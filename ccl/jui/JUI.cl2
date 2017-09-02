#use prototypes

var JUI;

{
	
	var EventHandler = {|clss, func|
		return clss([
			handle:func
		]);
	};
	
	JUI = [
		layout:{|name|
		  return java("javafx.scene.layout.".concat(name));
        },
		control:{|name|
		  return java("javafx.scene.control.".concat(name));
        },
		search:{|name|
		  return java("io.github.coalangsoft.jsearchfx.ui.".concat(name));
        },
		media:{|name|
		  return java("javafx.scene.media.".concat(name));
        },
		image:{|name|
		  return java("javafx.scene.image.".concat(name));
        },
		Scene:java("javafx.scene.Scene"),
		EventHandler:EventHandler.bind(java("javafx.event.EventHandler")),
		FileChooser:java("javafx.stage.FileChooser"),
		Font:java("javafx.scene.text.Font")
	];

    def makeImage(in){
        var res = JUI.image("Image")(in);
        if(res.type == "error"){
            res = JUI.image("Image")(in.reader());
        }
        return res;
    }

	prototypes.object.juiImage = makeImage;
	prototypes.object.juiIcon = JUI.image("ImageView");
	prototypes.object.juiDisplayImage = ({|self| return self.juiImage().juiIcon();});

    prototypes.object.juiControl = ({|arg,name| return JUI.control(name)(arg);});
    prototypes.object.juiLayout = ({|arg,name| return JUI.layout(name)(arg);});

};