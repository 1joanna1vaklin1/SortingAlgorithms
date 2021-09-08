package sortingalgorithms;
import java.util.*;


/**
 *
 * @author joannavaklin
 * #Quick Sort Algorithm written with the help of AlgoExpert.io
 */
public class QuickSort {
  

  public static int[] quickSort(int[] array) {
    quickSortHelper(array, 0, array.length-1);
    return array;
  }
	
	public static void quickSortHelper(int [] array, int startIndx, int endIndx)
	{
		//Base Case
		if(startIndx >= endIndx)
		{
			return; 
		}
		int pivot = startIndx; 
		int leftPointer = startIndx + 1;
		int rightPointer = endIndx; 
		
		while(rightPointer >= leftPointer)
		{
			if(array[leftPointer] > array[pivot] && array[rightPointer] < array[pivot])
			{
				swap(array, leftPointer, rightPointer); 
			}
			if(array[leftPointer] <= array[pivot])
			{
				leftPointer+=1; 
			}
			if(array[rightPointer] >= array[pivot])
			{
				rightPointer-=1; 
			}
		}
		swap(array, pivot, rightPointer);
		boolean leftSubArrayIsSmaller = (rightPointer - 1 - startIndx) < (endIndx -(rightPointer + 1));
		
		if(leftSubArrayIsSmaller)
		{
			quickSortHelper(array, startIndx, rightPointer-1);
			quickSortHelper(array, rightPointer+1, endIndx);
		}
		else{
			quickSortHelper(array, rightPointer+1, endIndx);
			quickSortHelper(array, startIndx, rightPointer-1);
			
		}
			
	}
	
	public static void swap(int [] array, int leftPointer, int rightPointer)
	{
		int temp = array[leftPointer];
		array[leftPointer] = array[rightPointer];
		array[rightPointer] = temp;
	}
        
        public static void printArray(int [] A)
    {
        for(int num : A)
        {
            System.out.println(num);
        }
    }
}
