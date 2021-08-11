


package sortingalgorithms;
/**
 * Java Program for implementing Greedy Method Selection Sort
 * @author joannavaklin
 */
public class SelectionSort {
    
    public static void sort(int[] A)
    {
        for(int i = A.length-1; i >= 1; i--)
        {
            int maxIndex = i; 
            
            for(int j = 0; j < i; j++)
            {
                if(A[maxIndex] < A[j])
                    maxIndex = j;
            }
            
            int temp = A[i];
            A[i] = A[maxIndex];
            A[maxIndex] = temp;
        }
    }
    
    public static void printArray(int [] A)
    {
        for(int num : A)
        {
            System.out.println(num);
        }
    }
    
    
    
}
