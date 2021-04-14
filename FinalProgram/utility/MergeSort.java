package utility;

/*************************************************************************
 *  Merge Sort class (for CSU22012 Project).
 *
 *  @version 1.0 12/4/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class MergeSort 
{
	/**
     * Don't let anyone instantiate this class.
     */
	private MergeSort() {}
	
	/**
     * Sort an array of utility.StopTime objects using merge sort in ascending order.
     * 
     * @param array: an unsorted array of utility.StopTime objects.
     */
    public static void sortStopTimes(StopTime[] array)
    {
       	if(array != null)
    	{   		
    		//Create auxiliary array to aid sorting
       		StopTime[] aux = new StopTime[array.length];
	    	
	    	//Bottom-Up Merge Sort (iterative)
	    	sortStopTimes(array, aux);
    	}
    }
    
    /**
     * Iteratively use merge sort to sort array using bottom-up merge sort.
     *
     * @param array: an unsorted array of utility.StopTime objects.
     * @param aux: an auxiliary array to aid sorting
     */
    private static void sortStopTimes(StopTime[] array, StopTime[] aux)
    {
    	//Pass through array and merge subarrays of size 1, 2, 4, ...
    	for(int size = 1; size < array.length; size = size + size)
    	{
    		for(int low = 0; low < array.length - size; low += size + size)
    		{
    			merge(array, aux, low, low + size - 1, Math.min(low + size + size - 1, array.length - 1));
    		}
    	}
    }
    
    /**
     * Merge two sorted subarrays into larger sorted array
     *
     * @param array: an unsorted array of utility.StopTime objects.
     * @param aux: an auxiliary array to aid sorting.
     * @param low: start of first subarray.
     * @param mid: end of first subarray (mid + 1 is start of second subarray).
     * @param high: end of second subarray.
     */
    private static void merge(StopTime[] array, StopTime[] aux, int low, int mid, int high)
    {
    	//Copy elements from original array into auxiliary array
    	for(int k = low; k <= high; k++)
    	{
    		aux[k] = array[k];
    	}
    	
    	//Merge copied elements back into original array in sorted order
    	int i = low;
    	int j = mid + 1;
    	for(int k = low; k <= high; k++)
    	{
    		if		(i > mid)						array[k] = aux[j++];
    		else if (j > high)						array[k] = aux[i++];
    		else if (aux[j].compareTo(aux[i]) < 0) 	array[k] = aux[j++];
    		else 									array[k] = aux[i++];
    	}		
    }
}