package main.java.sorting.quicksort;

import java.util.Arrays;

public class QuicksortMine {
public static void main(String[] args) {
	 int arr[] = {10, 7, 8, 9, 1, 5}; 
     int n = arr.length; 
     QuicksortMine q=new QuicksortMine();
    q.quicksort(arr,0,n-1);
    printArray(arr);
     System.out.println(Arrays.toString(arr));
     
}

public void quicksort(int[] arr, int low, int high) {
	if(low<high){
		int p=partition(arr,low,high);
		quicksort(arr,low, p-1);
		quicksort(arr, p+1, high);
	}
	
}

public int partition(int[] arr, int low, int high) {
	int pivot=arr[high];
	int i=low-1;
	for(int j=low;j<high;j++){
		if(arr[j]<pivot){
			i++;
			//swap(arr[i],arr[j]);
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	//swap(arr[i+1],pivot);
	int temp=arr[i+1];
	arr[i+1]=pivot;
	pivot=temp;
	return i+1;
}

static void printArray(int arr[]) 
{ 
	int n = arr.length; 
	for (int i=0; i<n; ++i) 
		System.out.print(arr[i]+" "); 
	System.out.println(); 
} 
}
