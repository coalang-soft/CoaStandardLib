#use OSM prototypes

var StaticMap = OSM.map;

StaticMap.query = ({|in,args...| return OSM.query(in).0.osmMap.invoke(args);});

prototypes.string.staticMap = StaticMap.query;
prototypes.object.staticMap = ({|self,args...| return StaticMap.bind(self.lat,self.lon).invoke(args);});