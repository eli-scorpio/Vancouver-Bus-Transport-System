package utility;

import java.util.Arrays;

/*************************************************************************
 *  Merge Sort class (for CSU22012 Project).
 *
 *  @version 3.0 28/4/21
 *
 *  @author Brian Whelan (improvements have been made by integrating Pavel 
 *  					  Petrukhin's assignment 1 merge sort improvements)
 *
 *************************************************************************/
public class MergeSort 
{
	private static int CUTOFF = 10;
	/**
     * Don't let anyone instantiate this class.
     */
	private MergeSort() {}
	
	/**
     * Sort an array of utility.StopTime objects in ascending order using merge sort.
     * 
     * @param array: an unsorted array of utility.StopTime objects.
     */
    public static void sortStopTimes(StopTime[] array)
    {
       	if(array != null)
    	{   		
    		//Create auxiliary array to aid sorting
       		StopTime[] aux = Arrays.copyOf(array, array.length);
	    	
	    	//Bottom-Up Merge Sort (iterative)
       		//sortStopTimes(array, aux);
       		
       		//Top-Down Merge Sort (recursive)
       		sortStopTimes(aux, array, 0, array.length - 1); //start with swapped since things are copied into aux param in merge
    	}
    }
    
    /**
     * Iteratively use merge sort to sort array using bottom-up merge sort.
     *
     * @param array: an unsorted array of utility.StopTime objects.
     * @param aux: an auxiliary array to aid sorting
     */
//    private static void sortStopTimes(StopTime[] array, StopTime[] aux)
//    {
//    	//Pass through array and merge subarrays of size 1, 2, 4, ...
//    	for(int size = 1; size < array.length; size = size + size)
//    	{
//    		for(int low = 0; low < array.length - size; low += size + size)
//    		{
//    			merge(array, aux, low, low + size - 1, Math.min(low + size + size - 1, array.length - 1));
//    		}
//    	}
//    }
    
    /**
     * Recursively use merge sort to sort array using top-down merge sort.
     *
     * @param array: an unsorted array of utility.StopTime objects.
     * @param aux: an auxiliary array to aid sorting
     * @param low: start index of array.
     * @param high: end index of array.
     */
    private static void sortStopTimes(StopTime[] array, StopTime[] aux, int low, int high)
    {
       if(high - low > CUTOFF) 
       {
          int m = low + (high - low) / 2;
          
          //Swapping current aux and array, so that aarray is aux param in next call
          sortStopTimes(aux, array, low, m);       
          sortStopTimes(aux, array, m + 1, high);
          
          //In case we do not have to merge, we still have to copy into aux
          if(array[m].compareTo(array[m + 1]) <= 0) 
          {                      
            System.arraycopy(array, low, aux, low, high - low + 1);
            return;
          }
          
          //Merge happens into aux, so we have a normal order here, since first
          //call is swapped (we want 2 big arrays to be merged in our initial array
          //which is an aux parameter in first call
          merge(array, aux, low, m, high);                   

       }
       else
       {
    	  //We sort aux, since we always merge into aux and cutoff should have the 
    	  //same effect as merging
          cutoffInsertion(aux, low, high);                                           
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
//    private static void merge(StopTime[] array, StopTime[] aux, int low, int mid, int high)
//    {
//    	//Copy elements from original array into auxiliary array
//    	for(int k = low; k <= high; k++)
//    	{
//    		aux[k] = array[k];
//    	}
//    	
//    	//Merge copied elements back into original array in sorted order
//    	int i = low;
//    	int j = mid + 1;
//    	for(int k = low; k <= high; k++)
//    	{
//    		if		(i > mid)						array[k] = aux[j++];
//    		else if (j > high)						array[k] = aux[i++];
//    		else if (aux[j].compareTo(aux[i]) < 0) 	array[k] = aux[j++];
//    		else 									array[k] = aux[i++];
//    	}		
//    }
   
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
       //Note we copy into aux, so we have to launch with aux and array swapped (to get final array in a)
       int i = low,j = mid + 1;
       for(int k = low; k <= high; k++)
       {
          if(i > mid)
          {
             aux[k] = array[j++];
          }
          else if(j > high)
          {
             aux[k] = array[i++];
          }
          else if(array[j].compareTo(array[i]) < 0)
          {
             aux[k] = array[j++];
          }
          else
          {
             aux[k] = array[i++];
          }
       }
    }
    
    /**
     * Swap two utility.StopTime objects in an array of utility.StopTime objects
     * 
     * @param array: an unsorted array of utility.StopTime objects.
     * @param index1: index of first element to swap.
     * @param index2: index of first element to swap.
     */
    private static void swap(StopTime[] array, int index1, int index2)
    {
          StopTime temp = array[index1];
          array[index1] = array[index2];
          array[index2] = temp;
    }
    
    /**
     * Sort an array of utility.StopTime objects in ascending order using insertion sort.
     * 
     * @param array: an unsorted array of utility.StopTime objects.
     */
    private static void cutoffInsertion(StopTime[] array, int low, int high)
    {
       for(int i = low; i < high; i++)
       {
          for(int j = i + 1; j > low; j--)
          {
             if(array[j].compareTo(array[j - 1]) < 0)
             {
                StopTime temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
             }
             else
             {
                break;
             }
          }
       }
    }    
}