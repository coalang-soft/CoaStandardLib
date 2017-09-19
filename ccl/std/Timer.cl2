#use prototypes

var Timer = [
    start:{|f| java("javafx.animation.AnimationTimer")(f).start();}
];

prototypes.function.timer = Timer.start;