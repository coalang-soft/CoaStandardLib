#use URL Json

var OSM;
{
    def data(lat,lon) =
        eval.json(
            URL("https://nominatim.openstreetmap.org/reverse?format=json&lat=" & lat.toString() & "&lon=" & lon.toString())
            .buildString("UTF-8")
        );
    def staticMap(lat,lon,width:600,height:width,zoom:5) =
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
    def liveMap(lat,lon,zoom:6) =
        URL(
            "http://www.openstreetmap.org/#map=%s/%s/%s".format(zoom.toString(), lat.toString(), lon.toString())
        );
    OSM = [
        data:data,
        map:staticMap,
        liveMap:liveMap,
        query:query
    ];
};

prototypes.object.osmMap = ({|self,extra...| return OSM.map.bind(self.lat,self.lon).invoke(extra);});
prototypes.object.osmLiveMap = ({|self,extra...| return OSM.liveMap.bind(self.lat,self.lon).invoke(extra);});
prototypes.object.osmQuery = OSM.query;