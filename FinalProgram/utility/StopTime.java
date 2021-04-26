package utility;

/*************************************************************************
 *  utility.StopTime class (for CSU22012 Project).
 *
 *  @version 1.0 12/4/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class StopTime implements Comparable<StopTime>
{
	public final Integer tripID;
	public final Time arrivalTime;
	public final Time departureTime;
	public final Integer stopID;
	public final Integer stopSequence;
	public final Integer stopHeadsign;
	public final Integer pickupType;
	public final Integer dropOffType;
	public final Double shapeDistanceTravelled;
	
	/**
     * Create a utility.StopTime object with the specified properties
     * @param stopTimeLine: String containing comma-separated information
     */
	public StopTime(String stopTimeLine)
	{
		String[] values = stopTimeLine.split(",");
		this.tripID = (values[0].equals("") ? null : Integer.parseInt(values[0]));
		this.arrivalTime = new Time(values[1]);
		this.departureTime = new Time(values[2]);
		this.stopID = (values[3].equals("") ? null : Integer.parseInt(values[3]));
		this.stopSequence = (values[4].equals("") ? null : Integer.parseInt(values[4]));
		this.stopHeadsign = (values[5].equals("") ? null : Integer.parseInt(values[5]));
		this.pickupType = (values[6].equals("") ? null : Integer.parseInt(values[6]));
		this.dropOffType = (values[7].equals("") ? null : Integer.parseInt(values[7]));
		this.shapeDistanceTravelled = (values.length < 9 ? null : Double.parseDouble(values[8]));
	}
	
	/**
     * Checks whether a given input line is a valid StopTime input
     * 
     * @param stopTimeLine: String containing comma-separated information
     * @return boolean representing whether String is valid or not
     */	
    public static boolean isValidLine(String stopTimeLine)
    {
    	boolean isValidLine = true;
    	
    	String[] values = stopTimeLine.split(",");
		Time arrivalTime = new Time(values[1]);
		Time departureTime = new Time(values[2]);
		
		Time maxTime = new Time("23:59:59");
		Time minTime = new Time("00:00:00");
		
		if((arrivalTime.compareTo(maxTime) > 0)
			|| (arrivalTime.compareTo(minTime) < 0)
			|| (departureTime.compareTo(maxTime) > 0)
			|| (departureTime.compareTo(minTime) < 0))
		{
			isValidLine = false;
		}
			
		return isValidLine;
    }
	
	/**
     * Compare two utility.StopTime objects based on their tripID
     * 
     * @param stopTime: stopTime to compare to
     * @return integer representing result of comparison
     */	
	@Override
    public int compareTo(StopTime stopTime)
    {
        return Integer.valueOf(this.tripID).compareTo(Integer.valueOf(stopTime.tripID));
    }
	
    /**
     * Get String representation of utility.StopTime
     * 
     * @return String containing information on utility.StopTime entry
     */
	@Override
    public String toString()
    {
        return ("			------------------------------------"+"\n\n"
        		+ "			Trip ID: " + tripID
        		+ "\n			Arrival utility.Time: " + arrivalTime
        		+ "\n			Departure utility.Time: " + departureTime
        		+ "\n			Stop ID: " + stopID
        		+ "\n			Stop Sequence: " + stopSequence
        		+ "\n			Stop Headsign: " + stopHeadsign
        		+ "\n			Pickup Type: " + pickupType
        		+ "\n			Drop Off Type: " + dropOffType
        		+ "\n			Shape Distance Travelled: " + shapeDistanceTravelled + "\n");
    }
}
