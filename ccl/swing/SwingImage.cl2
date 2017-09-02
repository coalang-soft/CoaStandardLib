#use prototypes

var SwingImage = [
    make:{|in|
        var res = java("javax.imageio.ImageIO").read(in);
        if(res.type == "error"){
            res = java("javax.imageio.ImageIO").read(in.reader());
        }
        return res;
    },
    icon:java("javax.swing.ImageIcon")
];

prototypes.object.jIcon = SwingImage.icon;
prototypes.object.jImage = SwingImage.make;
prototypes.object.jDisplayImage = ({|self| return self.jImage().jIcon();});