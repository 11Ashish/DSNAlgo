package main.java.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int []a={5,3,2,4,7,1};
		int[] sorted=SelectionSort1(a,a.length);
		for(int i=0;i<sorted.length;i++){
			System.out.print(sorted[i] +"  ");
		}

	}

	private static int[] SelectionSort1(int[] a, int n) {
	 int min_idx;
	 for(int i=0;i<n-1;i++){
		 min_idx=i;
		 for(int j=i;j<n;j++){
			 if(a[min_idx]>a[j])
				 min_idx=j;
		 }
		 int temp=a[min_idx];
		 a[min_idx]=a[i];
		 a[i]=temp;
	 }
	 return a;
	 
	}

}
