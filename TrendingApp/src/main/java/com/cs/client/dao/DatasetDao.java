package com.cs.client.dao;

import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

import com.cs.client.OutOfLimitListener;

public interface DatasetDao {

	TimeSeriesCollection getDataSet();

	TimeSeriesCollection getDataSet(String displayName);

	void removeSeries(String displayName);

	TimeSeries addSeries(String displayName);

	void addDatas();

	void addData(String displayName);

	void setOutOfLimitListener(OutOfLimitListener outOfLimitListener);

	void addMovingAverage(int periodCount, int skip);

	void removeMovingAverage();

	void setFileName(String fileName);

	void init();
}