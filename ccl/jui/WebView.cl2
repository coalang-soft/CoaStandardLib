#use prototypes

def WebView(url){
    var view = java("javafx.scene.web.WebView")();
    var engine = view.getEngine();

    view.setProperty("engine", engine);
    view.setProperty("getLocation", engine.getLocation);
    view.setProperty("setLocation", engine.load);

    if(url.type.equals("undefined")!){
        view.setLocation(url.toString());
    }

    return view;
}

prototypes.object.juiWeb = WebView;