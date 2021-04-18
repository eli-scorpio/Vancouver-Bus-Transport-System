package utility;

import java.util.Arrays;

/*************************************************************************
 *  Merge Sort class (for CSU22012 Project).
 *
 *  @version 2.0 18/4/21
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
    
    
    
    
    
//    //Code below adapted from Pavel Petrukhin's assignment 1
//    private static void swap(StopTime[] a, int i, int j)
//    {
//          StopTime temp = a[i];
//          a[i] = a[j];
//          a[j] = temp;
//    }
//    
//
//    private static void cutoffInsertion(StopTime[] a, int low, int high)
//    {
//       for(int i = low; i < high; i++)
//       {
//          for(int j = i + 1; j > low; j--)
//          {
//             if(a[j].compareTo(a[j - 1]) < 0)
//             {
//                StopTime temp = a[j];
//                a[j] = a[j - 1];
//                a[j - 1] = temp;
//             }
//             else
//             {
//                break;
//             }
//          }
//       }
//    }
//    
//    private static void merge(StopTime[] a, StopTime[] aux, int left, int mid, int right)
//    {
//       //note we copy into aux, so we have to launch with aux and a swapped (to get final array in a)
//       int i = left,j = mid + 1;
//       for(int k = left; k <= right; k++)
//       {
//          if(i > mid)
//          {
//             aux[k] = a[j++];
//          }
//          else if(j > right)
//          {
//             aux[k] = a[i++];
//          }
//          else if(a[j].compareTo(a[i]) < 0)
//          {
//             aux[k] = a[j++];
//          }
//          else
//          {
//             aux[k] = a[i++];
//          }
//       }
//    }
//
//    private static void mergeSortRecursive(StopTime[] a, StopTime[] aux, int l, int r)
//    {
//       if(r - l > CUTOFF) 
//       {
//          int m = l + (r - l)/2;
//          mergeSortRecursive(aux, a,l,m);       //swapping current aux and a, so that a is aux param in next call
//          mergeSortRecursive(aux, a,m+1,r);
//          if(a[m].compareTo(a[m+1]) <= 0) //in case we do not have to merge, we still have to copy into aux
//          {                      
//            System.arraycopy(a,l,aux,l, r - l + 1);
//            return;
//          }
//          merge(a,aux, l, m, r);                   //merge happens into aux, so we have a normal order here, since first
//                                                   //call is swapped (we want 2 big arrays to be merged in our initial array
//                                                   //which is an aux parameter in first call
//       }
//       else
//       {
//          cutoffInsertion(aux,l,r);                //we sort aux, since we always merge into aux and cutoff should have
//                                                   //the same effect as merging
//       }
//    }
//
//    static StopTime[] mergeSort(StopTime[] a) 
//    {
//       StopTime[] aux =   Arrays.copyOf(a,a.length);
//       mergeSortRecursive(aux,a,0,a.length-1); //start with swapped since things are copied into aux param in merge
//       return a;
//    }
}