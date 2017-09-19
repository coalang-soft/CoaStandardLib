#use URL Json prototypes

def GlosbeTranslate(phrase,from,to) = eval.json(URL(
    "https://glosbe.com/gapi/translate?format=json&from=" & from.toString()
    & "&dest=" & to.toString()
    & "&phrase=" & phrase.toString().replace(" ", "%20")
).buildString("UTF-8"));

prototypes.string.glosbeTranslate = GlosbeTranslate;
def prototypes.string.glosbeSimpleTranslate(phrase,from,to){
    var results = GlosbeTranslate(phrase,from,to).tuc;
    if(results.type == "error"){
        return results;
    }
    return ({|i| return results.get(i).phrase;}).array(results.length());
};
def prototypes.string.glosbeSingleTranslate(phrase,from,to) = phrase.glosbeSimpleTranslate(from,to).0.text;