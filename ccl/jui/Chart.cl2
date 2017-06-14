#include ccl/jui/JUI.cl2
{
	JUI.setProperty("chart", {|name| return java("javafx.scene.chart.".concat(name));});
};