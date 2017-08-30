var prototypes = [
    undefined:undefined.getPrototype(),
    array:[].getPrototype(),
    number:0.getPrototype(),
    string:"".getPrototype(),
    function:({||}).getPrototype(),
    object:0.getObjectPrototype()
];