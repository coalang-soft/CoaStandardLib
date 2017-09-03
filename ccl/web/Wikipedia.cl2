#use URL Json Locale struct prototypes

var WikipediaEntry = struct(["title", "description", "link"]);

def Wikipedia(lang:Locale.defaultLanguage){
    def queryRaw(q){
        return URL("https://" & lang.toString() & ".wikipedia.org/w/api.php?action=opensearch&search=" & q.toString())
                   .buildString("UTF-8").json();
    };
    def query(q){
        var raw = queryRaw(q);

        if(raw.type.equals("array")!){
            return raw;
        }

        var titles = raw.1;
        var descriptions = raw.2;
        var links = raw.3;

        return ({|i|
            return WikipediaEntry(titles[i], descriptions[i], links[i].url());
        }).for(0,titles.length() - 1);
    };

    return [query:query];
};

prototypes.object.wikipediaQuery = ({|self,args...| return Wikipedia.invoke(args).query(self);});