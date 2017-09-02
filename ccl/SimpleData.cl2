#use AntLang Json prototypes StaticMap Dictionary

prototypes.string.map = prototypes.string.staticMap;
prototypes.object.map = prototypes.string.staticMap;
prototypes.string.translate = prototypes.string.glosbeSingleTranslate;
var chooseFile = JFileChooser.openSingle;