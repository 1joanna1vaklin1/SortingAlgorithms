
package sortingalgorithms;

/**
 *
 * @author joannavaklin
 */
public class BubbleSort extends SortingAlgorithms {


//Best case sceanario happens when the array is already sorted. O(N)
//Worst case sceanario and average case has O(N^2) time complexity. 
//Decreasing the endOfArray is an optimatization since we know
//that the biggest number will end up in the end of the array with
//each iteration. 

  public static int[] bubbleSort(int[] array) {
		
    boolean swapExists = true;
    int endOfArray = array.length - 1; 
		
        while(swapExists)
        {
                swapExists = false; 
                for(int i = 0; i < endOfArray; i++)
                {
                        if(array[i] > array[i+1])
                        {
                                swapExists = true;
                                swap(array, i, i+1);
                        }
                }
                endOfArray -= 1; 
        }
        return array;
  }
	
public static void swap(int [] array, int i, int j)
    {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp; 
    }

}
