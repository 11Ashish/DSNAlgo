package main.java.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int []a={5,3,2,4,7,1};
		int[] sorted=InsertionSort1(a,a.length);
		for(int i=0;i<sorted.length;i++){
			System.out.print(sorted[i] +"  ");
		}
	}

	private static int[] InsertionSort1(int[] a, int n) {
		
        for (int i = 1; i < n; ++i) { 
            int key = a[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && a[j] > key) { 
                a[j + 1] = a[j]; 
                j = j - 1; 
            } 
            a[j + 1] = key; 
        } 
        return a;
	}

}
