var Thread;
{
	var r = java("java.lang.Runnable");
	var t = java("java.lang.Thread");
	
	Thread = {|f,name|
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