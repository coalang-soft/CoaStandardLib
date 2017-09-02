#use prototypes

var struct = {|array|
	
	return {||

		var parameters = @;
		var ret = [];
		
		for(0,array.length() - 1){
			var i = @.get(0);
			ret.push(parameters.get(i), array.get(i));
		}
		
		return ret;
		
	};
    
};

prototypes.array.struct = struct;