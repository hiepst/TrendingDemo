package cs.trend.client;

import javax.swing.JPanel;

public interface DemoPanel {

	void init();

	void startTrending();

	void stopTrending();

	JPanel getComponent();

	void addPlot(Source source, CassetteDataPoint dataPoint);

	void removePLot();

	public void setDomainRange(int minutes);

	void showPlotDifference();

	void showPlotsSeparately();

	int getPlotCount();

	void showAveragePlot(int periodCount, int skip);

	void hideAveragePlot();
}