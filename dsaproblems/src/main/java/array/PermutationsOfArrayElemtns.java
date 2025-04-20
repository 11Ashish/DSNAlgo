package main.java.array;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsOfArrayElemtns {
//private static final int Integer = 0;

public static void main(String args[]){
	int arr[]={1,2,2};
	ArrayList<Integer> ar=new ArrayList<Integer>();
	boolean[] b=new boolean[3];
	permutations(arr,ar,b);
	
	
	String s = "1222"; 
	// Permutations of String this works for both Integer & string which have alphabets:::
    printPermutn(s, ""); 
	
	String s1 = "abc"; 
	// Permutations of String this works only for string which have alphabets:::
    printDistinctPermutn(s1, "");
	
	
}

private static void permutations(int[] arr, ArrayList<Integer> ar, boolean[] b) {
	// TODO Auto-generated method stub
	if(ar.size()==arr.length){
		System.out.println(Arrays.toString(ar.toArray()));
		return;
	}
	for(int i=0;i<arr.length;i++){
		if(!b[i]){
			b[i]=true;
			ar.add(arr[i]);
			permutations(arr,ar,b);
			
			// For debugging purpose to understand values of Boolean Array
			//System.out.println("Hello"+b[0]+"  "+b[1]+"  "+b[2]);
			b[i]=false;
			ar.remove(ar.size()-1);
			// For debugging purpose to undersatnd how it works
			//System.out.println(ar);
			
		}
	}
	
}

//  
static void printPermutn(String str, String ans) 
{ 

    // If string is empty 
    if (str.length() == 0) { 
        System.out.print(ans + " "); 
        return; 
    } 

    for (int i = 0; i < str.length(); i++) { 

        // ith character of str 
        char ch = str.charAt(i); 

        // Rest of the string after excluding  
        // the ith character 
        String ros = str.substring(0, i) +  
                     str.substring(i + 1); 
      //  System.out.println(ros +  "    ");
        // Recurvise call 
        printPermutn(ros, ans + ch); 
    } 
} 


static void printDistinctPermutn(String str,  
        String ans) 
{ 

// If string is empty 
if (str.length() == 0) { 

// print ans 
System.out.print(ans + " "); 
return; 
} 

// Make a boolean array of size '26' which 
// stores false by default and make true  
// at the position which alphabet is being 
// used 
boolean alpha[] = new boolean[26]; 

for (int i = 0; i < str.length(); i++) { 

// ith character of str 
char ch = str.charAt(i); 

// Rest of the string after excluding  
// the ith character 
String ros = str.substring(0, i) +  
str.substring(i + 1); 

// If the character has not been used  
// then recursive call will take place.  
// Otherwise, there will be no recursive 
// call 
if (ch>0&&alpha[ch - 'a'] == false) 
printDistinctPermutn(ros, ans + ch); 
alpha[ch - 'a'] = true; 
} 
} 
}
