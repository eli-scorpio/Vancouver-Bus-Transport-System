/*
A UI class which implements ProgressBar in console, used in functions.Function3
*/
package ui;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class ProgressBar {
	
	private String action = "";
	private int percentage = 0;
	private int progressIndex = 0;
	private int dataSize = 0;
	private int onePercentDataSize = 0;
	private int count = 0;
	private long startTimeMillis = 0;
	
	public ProgressBar(int dataSize, String action, long startTimeMillis) {
		this.startTimeMillis = startTimeMillis;
		this.dataSize = dataSize;
		this.action = action;
		onePercentDataSize = dataSize/100;
	}

	// This method is inspired by https://stackoverflow.com/questions/1001290/console-based-progress-in-java
	// I have personalised it to suit our context
	public void printBar(int progress) {
		long timeRemaining = (progress == 0)? 0 :
				(this.dataSize - progress) * (System.currentTimeMillis() - startTimeMillis) / progress;

		String formattedTimeRemaining = progress == 0 ? "N/A" :
				String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(timeRemaining),
						TimeUnit.MILLISECONDS.toMinutes(timeRemaining) % 60,
						TimeUnit.MILLISECONDS.toSeconds(timeRemaining) % 60);

		StringBuilder string = new StringBuilder(150);
		int percent = (int) (progress * 100 / dataSize);
		string
				.append('\r')
				.append(action + " ")
				.append(String.join("", Collections.nCopies((percent == 0)? 2 : 2 - (int) (Math.log10(percent)), " ")))
				.append(String.format(" %d%% [", percent))
				.append(String.join("", Collections.nCopies(percent, "#")))
				.append(String.join("", Collections.nCopies(100 - percent, " ")))
				.append(']')
				.append(String.join("", Collections.nCopies(progress == 0 ? (int) (Math.log10(dataSize)) : (int) (Math.log10(dataSize)) - (int) (Math.log10(progress)), " ")))
				.append(String.format(" %d/%d, Time Remaining: %s", progress, dataSize, formattedTimeRemaining));

		System.out.print(string);
	}

}
