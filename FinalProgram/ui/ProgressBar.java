/*
A UI class which implements ProgressBar in console, used in functions.Function3
*/
package ui;

import java.util.Collections;

public class ProgressBar {
	
	private String action = "";
	private int dataSize = 0;
	
	public ProgressBar(int dataSize, String action) {
		this.dataSize = dataSize;
		this.action = action;
	}


	public void printBar(int progress) {

		StringBuilder string = new StringBuilder(150);
		int percent = (int) (progress * 100 / dataSize);
		string
				.append("\r" + action + " ")
				.append(String.format(" %d%% [", percent))
				.append(String.join("", Collections.nCopies(percent, "#")))
				.append(String.join("", Collections.nCopies(100 - percent, " ")))
				.append("] " + progress + "/" + dataSize);

		System.out.print(string);
	}

}
