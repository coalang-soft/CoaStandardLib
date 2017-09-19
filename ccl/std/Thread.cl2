#use prototypes

var Thread;
{
	var r = java("java.lang.Runnable");
	var t = java("java.lang.Thread");
	
	def Thread(f,name){
        if(name.type == "undefined"){
            
        }
		var ret = t(
			r([
				run:f
			])
		);
		ret.setName(name);
		return [
			start:ret.start
		];
	};
};

def prototypes.object.thread(self,name) = Thread(self,name).start();