#use prototypes

var SwingImage = [
    make:java("javax.imageio.ImageIO").read,
    icon:java("javax.swing.ImageIcon")
];

prototypes.object.jIcon = SwingImage.icon;
prototypes.object.jImage = SwingImage.make;
prototypes.object.jDisplayImage = ({|self| return self.jImage().jIcon();});