#include <io/URL>
if(eval.ant.type == "error"){
var AntLangPath = "https://rawgit.com/AntLang-Software/jsAntLang/master/AntLang.js";

var jsAntLang = URL(AntLangPath).buildString("UTF-8");
var antlang = eval.js(jsAntLang & ";new AntLangScriptEngine();");
eval.setProperty("ant", antlang.run);
eval.ant.setProperty("engine", antlang);
};