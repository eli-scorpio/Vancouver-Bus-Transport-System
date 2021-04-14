package utility;

/*************************************************************************
 *  utility.Time class (for CSU22012 Project).
 *
 *  @version 1.0 12/4/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class Time implements Comparable<Time>
{
	private final int hour;
	private final int minute;
	private final int second;
	
	/**
     * Create a utility.Time object with the specified properties
     * @param time: String containing time in format hh:mm:ss
     */
	public Time(String time)
	{
		String[] values = time.split(":");
		this.hour = Integer.parseInt(values[0].trim());
		this.minute = Integer.parseInt(values[1].trim());
		this.second = Integer.parseInt(values[2].trim());
	}
	
	/**
     * Check whether String is a valid time in format hh:mm:ss
     * 
     * @param time: String to check if in format hh:mm:ss
     * @return is the String a valid time?
     */	
	public static boolean isValidTime(String time)
	{
		boolean validTime = false;
		String[] values = time.split(":");
		if(values.length == 3)
		{
			try
			{
				int hour = Integer.parseInt(values[0].trim());
				int minute = Integer.parseInt(values[1].trim());
				int second = Integer.parseInt(values[2].trim());
				
				if((hour >= 0) && (hour < 24)
					&& (minute >= 0) && (minute < 60)
					&& (second >= 0) && (second < 60))
				{
					validTime = true;
				}
			}
			catch(NumberFormatException e) {}
		}
		
		return validTime;
	}
	
	/**
     * Compare two utility.Time objects
     * 
     * @param time: time to compare to
     * @return integer representing result of comparison
     */	
	@Override
    public int compareTo(Time time)
    {
        int hourDifference = Integer.valueOf(this.hour).compareTo(Integer.valueOf(time.hour));
        int minuteDifference = Integer.valueOf(this.minute).compareTo(Integer.valueOf(time.minute));
        int secondDifference = Integer.valueOf(this.second).compareTo(Integer.valueOf(time.second));
        if(hourDifference != 0)
        {
        	return hourDifference;
        }
        else if(minuteDifference != 0)
        {
        	return minuteDifference;
        }
        else
        {
        	return secondDifference;
        }
    }
	
    /**
     * Get String representation time
     * 
     * @return String containing time in format hh:mm:ss
     */
	@Override
    public String toString()
    {
		return (hour + ":" + minute + ":" + second);
    }
}
