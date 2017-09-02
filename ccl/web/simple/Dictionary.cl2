#use GlosbeTranslate Locale

def Dictionary(from,to) = ({|phrase|
    return phrase.glosbeSimpleTranslate(from,to).0.text;
});

Dictionary.from = ({|a| return Dictionary(a, Locale.defaultLanguage);});
Dictionary.to = ({|a| return Dictionary(Locale.defaultLanguage,a);});