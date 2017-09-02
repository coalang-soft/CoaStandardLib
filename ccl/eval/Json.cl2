#use prototypes

eval.setProperty("json", eval.js("JSON.parse"));
prototypes.object.json = ({|expr| return eval.json(expr);});