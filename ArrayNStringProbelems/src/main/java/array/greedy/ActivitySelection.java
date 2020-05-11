package main.java.array.greedy;

//The following implementation assumes that the activities  
//are already sorted according to their finish time 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class Activity implements Comparable<Activity>{
	int start,finish;
	public Activity(int start, int finish) {
		this.start=start;
		this.finish=finish;
	
	}
	
	@Override
	public int compareTo(Activity a1) {
		// TODO Auto-generated method stub     
		//if finish time is also equal then you can use it like this 
		int i=this.finish-a1.finish;
		if(i==0) {
			return this.start-a1.start;
		}
		else
		return this.finish-a1.finish;
		
	}

	@Override
	public String toString() {
		return "Activity [start=" + start + ", finish=" + finish + "]";
	}
	

	
}
public class ActivitySelection 
{ 
	
	// Prints a maximum set of activities that can be done by a single 
	// person, one at a time. 
	// n --> Total number of activities 
	// s[] --> An array that contains start time of all activities 
	// f[] --> An array that contains finish time of all activities 
	//Sort the activities according to their finishing time
	public static void printMaxActivities(int s[], int f[], int n) 
	{ 
	int i, j; 
	
	System.out.println("Following activities are selected : n"); 
	
	// The first activity always gets selected 
	i = 0; 
	System.out.print(i+" "); 
	
	// Consider rest of the activities 
	for (j = 1; j < n; j++) 
	{ 
		// If this activity has start time greater than or 
		// equal to the finish time of previously selected 
		// activity, then select it 
		if (s[j] >= f[i]) 
		{ 
			System.out.print(j+" "); 
			i = j; 
		} 
	} 
	} 
	
	//This method is used when Activities are not sorted based on their finish time.
	public static void printMaxActivities1(Activity[] a) {
		int n=a.length;
		int i=0;
		//before sorting 
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		
		//After sorting
		System.out.println(Arrays.toString(a));
		System.out.println();
		    
		System.out.print(i+" ");
		for (int j = 1; j < n; j++) 
		{ 
			// If this activity has start time greater than or 
			// equal to the finish time of previously selected 
			// activity, then select it 
			if (a[j].start >= a[i].finish) 
			{ 
				System.out.print(j+" "); 
				i = j; 
			} 
		} 
	} 
	
	
	
	// driver program to test above function 
	public static void main(String[] args) 
	{ 
	int s[] = {1, 3, 0, 5, 8, 5}; 
	int f[] = {2, 4, 6, 7, 9, 9}; 
    Activity[] act=new Activity[s.length];
    for(int i=0;i<s.length;i++) {
    	act[i]=new Activity(s[i],f[i]);
    }
    
	int n = s.length; 
		
	printMaxActivities(s, f, n); 
	
	System.out.println();
	
	printMaxActivities1(act);
	} 
	
} 
