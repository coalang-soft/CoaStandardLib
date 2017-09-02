#use prototypes JUI

var Launcher = java("ccl.rt.v6.fx.FXLauncher");

prototypes.function.launch = Launcher.launch;
prototypes.function.launchSimple = ({|gui| return gui.juiApp().launch();});
prototypes.object.juiApp = ({|gui|
    return ({|win|
        var g = gui();
        var s = JUI.Scene(g);
        if(s.type == "error"){
            s = JUI.Scene(JUI.layout("Pane")([g]));
        }
        win.scene = s;
        win.show();
    });
});
prototypes.object.launch = ({|gui| gui.juiApp().launch(); return gui;});

java("javafx.embed.swing.JFXPanel")();