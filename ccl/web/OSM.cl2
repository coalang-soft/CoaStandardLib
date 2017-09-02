#use URL Json

var OSM;
{
    def data(lat,lon) =
        eval.json(
            URL("https://nominatim.openstreetmap.org/reverse?format=json&lat=" & lat.toString() & "&lon=" & lon.toString())
            .buildString("UTF-8")
        );
    def map(lat,lon,width:600,height:width,zoom:5) =
        URL(
            "http://geomap.nagvis.org/?module=map&&lat=" & lat.toString()
            & "&lon=" & lon.toString()
            & "&zoom=" & zoom.toString()
            & "&width=" & width.toString()
            & "&height=" & height.toString()
        );
    def query(query) =
        eval.json(
            URL("https://nominatim.openstreetmap.org/search?format=json&q=" & query.toString().replace(" ", "%20"))
            .buildString("UTF-8")
        );
    OSM = [
        data:data,
        map:map,
        query:query
    ];
};

prototypes.object.osmMap = ({|self,extra...| return OSM.map.bind(self.lat,self.lon).invoke(extra);});
prototypes.object.osmQuery = OSM.query;