/*
A UI class which implements ProgressBar in console, used in functions.Function3
*/
package ui;

public class ProgressBar {
	
	private StringBuilder progress = new StringBuilder("--------------------");
	private String action = "";
	private int percentage = 0;
	private int progressIndex = 0;
	private int fivePercentDataSize = 0;
	private int count = 0;
	
	public ProgressBar(int dataSize, String action) {
		this.action = action;
		fivePercentDataSize = dataSize/20;
		System.out.print(action + " [" + progress + "]" + percentage + "%\r");
	}
	
	private void incrementBar() {
		progress.setCharAt(progressIndex, '*');
		percentage += 5;
		progressIndex++;
	}
	
	public void printBar() {
		if(count%fivePercentDataSize == 0 && count != 0 && percentage < 100) {
			incrementBar();
			System.out.print(action + " [" + progress + "]" + percentage + "%\r");
		}	
		
		if(count == fivePercentDataSize*20+1)
			System.out.println("\n");
		
		count++;
	}

}
