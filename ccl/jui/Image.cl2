var Image = {|imageResourceIO|
	return java("javafx.scene.image.Image")(
		java("java.io.InputStream")(
			({|r| return r;}).bind(imageResourceIO.reader())
		)
	);
};