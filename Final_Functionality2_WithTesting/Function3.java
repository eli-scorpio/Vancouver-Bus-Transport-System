import java.util.ArrayList;
import java.util.Arrays;
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
     */
	public Function3()
	{
		Input input = new Input("stop_times.txt");
		
		//Read file into array of StopTime 
		ArrayList<StopTime> stopTimesArrayList = new ArrayList<StopTime>();		
		String currentLine = input.nextLine(); //get rid of header line
		while((currentLine = input.nextLine()) != null)
		{
			stopTimesArrayList.add(new StopTime(currentLine));
		}
		
		//Remove invalid times
		Time maxTime = new Time("23:59:59");
		for(int i = 0; i < stopTimesArrayList.size(); i++)
		{
			if(stopTimesArrayList.get(i).arrivalTime.compareTo(maxTime) > 0)
			{
				stopTimesArrayList.remove(i);
				i--;
			}
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
		
		//Print all lines with the same arrival time
		for(int i = 0; i < stopTimes.length; i++)
		{
			if(stopTimes[i].arrivalTime.compareTo(userArrivalTime) == 0)
			{
				System.out.println(stopTimes[i].toString());
			}
		}
	}
}