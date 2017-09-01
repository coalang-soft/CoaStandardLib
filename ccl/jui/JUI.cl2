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

	prototypes.object.juiImage = JUI.image("Image");

};