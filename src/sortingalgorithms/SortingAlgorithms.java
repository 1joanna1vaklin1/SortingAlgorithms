/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author joannavaklin
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] A = {1,5,6,2,3};
        SelectionSort ssobj = new SelectionSort();
        ssobj.sort(A);
        ssobj.printArray(A);
        
        
    }
    
}
