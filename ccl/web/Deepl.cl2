#use URL Json

var Deepl;
{
    var JSON_ARG = "{\"jsonrpc\":\"2.0\",\"method\":\"LMT_handle_jobs\",\"params\":{\"jobs\":[{\"kind\":\"default\",\"raw_en_sentence\":\"%s\"}],\"lang\":{\"source_lang_user_selected\":\"%s\",\"target_lang\":\"%s\"}}}";
    var URL_ARG = "https://www.deepl.com/jsonrpc";
    def translate(sentence, from, to){
        var u = URL(URL_ARG);
        u.writeString(JSON_ARG.format(sentence,from,to));
        return u.buildString("UTF-8").json();
    }
    def translator(from,to){
        return ({|sentence| return translate(sentence,from,to);});
    }
    def simpleTranslate(sentence,from,to){
        return translate(sentence,from,to).result.translations.0.beams;
    }
    Deepl = [
        translate:translate,
        translator:translator,
        simpleTranslate:simpleTranslate
    ];
}