package functions;

import ui.ProgressBar;
import utility.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*************************************************************************
 *  Function 3 (Sorting) class (for CSU22012 Project).
 *
 *  @version 1.0 12/4/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class Function3
{
	private StopTime[] stopTimes;

	/**
	 * Read in and store entries in "stop_times.txt" to enable user input for function 3
	 * @throws FileNotFoundException
	 */
	public Function3() throws FileNotFoundException
	{
		File newFile = new File("FinalProgram/out/production/FinalProgram/stop_times.txt");
		String inputFile = newFile.getPath();
		Input input = new Input(inputFile);
		Scanner sc = new Scanner(newFile);
		int noOfLines = -1; // dont count header

		while(sc.hasNextLine()) {
			sc.nextLine();
			noOfLines++;
		}

		//Read file into array of utility.StopTime (only valid lines)
		ArrayList<StopTime> stopTimesArrayList = new ArrayList<StopTime>();
		String currentLine = input.nextLine(); //get rid of header line
		ProgressBar readingBar = new ProgressBar(noOfLines, "Reading file");
		int count = 0;
		while((currentLine = input.nextLine()) != null)
		{
			count++;

			if(StopTime.isValidLine(currentLine))
				stopTimesArrayList.add(new StopTime(currentLine));

			if(count%(noOfLines/100) == 0 || count == noOfLines)
				readingBar.printBar(count);
		}

		//Convert arrayList to array
		stopTimes = new StopTime[stopTimesArrayList.size()];
		stopTimes = stopTimesArrayList.toArray(stopTimes);

		//Sort by tripID
		MergeSort.sortStopTimes(stopTimes);
	}

	/**
	 * Print all trips with a given arrival time
	 *
	 * @param userInput: String in format hh:mm:ss representing user's desired arrival time
	 */
	public void printTripsWithGivenArrivalTimes(String userInput)
	{
		Time userArrivalTime = new Time(userInput);
		int numberOfResults = 0;

		//Print all lines with the same arrival time
		for(int i = 0; i < stopTimes.length; i++)
		{
			if(stopTimes[i].arrivalTime.compareTo(userArrivalTime) == 0)
			{
				System.out.println(stopTimes[i].toString());
				numberOfResults++;
			}
		}

		System.out.println("\n			Number of results found: " + numberOfResults + "\n");
	}
}