package main.java.sorting;

public class BubbleSort {

	public static void main(String[] args){
		int []a={5,3,2,4,7,1};
		int[] sorted=bubbleSort1(a,a.length);
		for(int i=0;i<sorted.length;i++){
			System.out.print(sorted[i] +"  ");
		}
		
		System.out.println();
		
		int[] sorted2=bubbleSort2(a,a.length);
		for(int i=0;i<sorted2.length;i++){
			System.out.print(sorted2[i]+"  ");
		}
		
		System.out.println();
		int[] sorted3=bubbleSortListAlreadySorted(a,a.length);
		for(int i=0;i<sorted3.length;i++){
			System.out.print(sorted3[i]+"  ");
		}
	}

	public static int[] bubbleSort1(int[] a, int n) {
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	
	public static int[] bubbleSort2(int[] a,int n){
		for(int i=n-1;i>=0;i--){
			for(int j=0;j<=i-1;j++){
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			}
		}
		return a;
	}
	
	public static int[] bubbleSortListAlreadySorted(int[] a,int n){
		boolean swapped=true;
		for(int i=n-1;i>=0 && swapped;i--){
			swapped=false;
			for(int j=0;j<=i-1;j++){
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped=true;
				}
				
			}
		}
		return a;
	}
	
}
