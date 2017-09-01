#use prototypes

def JPopup(args...) = java("javax.swing.JOptionPane").showMessageDialog.bind(undefined).invoke(args);

{
    var JOptionPane = java("javax.swing.JOptionPane");
    JPopup.ERROR = JOptionPane.ERROR_MESSAGE;
    JPopup.INFORMATION = JOptionPane.INFORMATION_MESSAGE;
    JPopup.QUESTION = JOptionPane.QUESTION_MESSAGE;
    JPopup.WARNING = JOptionPane.WARNING_MESSAGE;
    JPopup.PLAIN = JOptionPane.PLAIN_MESSAGE;

    JPopup.input = JOptionPane.showInputDialog.bind(undefined);
}

prototypes.object.jPopup = JPopup;
prototypes.object.jInputPopup = JPopup.input;