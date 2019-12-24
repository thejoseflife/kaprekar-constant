package MathPrograms;

import java.util.ArrayList;

public class QuickSort {

	public int partition(ArrayList<Integer> arr, int low, int high) { 
        int pivot = arr.get(high);  
        int i = (low - 1);
        
        for (int j = low; j < high; j++) { 
            if (arr.get(j) <= pivot) { 
                i++; 
                int temp = arr.get(i); 
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                
            } 
        } 
        int temp = arr.get(i + 1); 
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
  
        return i + 1; 
    } 

    public void sort(ArrayList<Integer> arr, int low, int high) { 
        if (low < high) { 
            int pi = partition(arr, low, high); 
            sort(arr, low, pi - 1); 
            sort(arr, pi + 1, high); 
        } 
    }
    
    public void printArray(int[] arr) {
    	for(int i: arr) System.out.print(i + " ");
    	System.out.println();
    }
	
	public static void main(String[] args) {

	}

}

