package cs.trend.demo;

import java.time.Instant;

public interface OutOfLimitListener {

	void outOfLimitPerform(Instant begin, Instant end, double value);
}
