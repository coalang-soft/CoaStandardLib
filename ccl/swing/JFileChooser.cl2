#use File

var JFileChooser = java("javax.swing.JFileChooser");

{
    JFileChooser.MULTI_INSTANCE = JFileChooser();
    JFileChooser.MULTI_INSTANCE.setMultiSelectionEnabled(true);
}

JFileChooser.open = ({|c| c.showOpenDialog(undefined); return ({|f| return f.getPath().toString().file();}).for(array(c.getSelectedFiles()));}).bind(JFileChooser.MULTI_INSTANCE);
JFileChooser.save = ({|c| c.showSaveDialog(undefined); return ({|f| return f.getPath().toString().file();}).for(array(c.getSelectedFiles()));}).bind(JFileChooser.MULTI_INSTANCE);
JFileChooser.openSingle = ({|| return JFileChooser.open().getOrDefault(0,undefined);});
JFileChooser.saveSingle = ({|| return JFileChooser.save().getOrDefault(0,undefined);});