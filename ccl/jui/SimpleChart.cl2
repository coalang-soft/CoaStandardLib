#use XYChart prototypes

var SimpleChart;
{
	var NumberAxis = JUI.chart("NumberAxis");
	
	SimpleChart = ({|x,y,to,from:0,type:"LineChart"|
		var chart = JUI.chart(type)(NumberAxis(),NumberAxis());
		chart.getData().add(XYSeries(x,y,from,to));
		return chart;
	});

};

{
    def ret(x) = x;

    prototypes.object.juiPlot = ({|x,y,type:"LineChart",from:0,to:100|
        return SimpleChart(x,y,to,from,type);
    }).bind(ret);
};