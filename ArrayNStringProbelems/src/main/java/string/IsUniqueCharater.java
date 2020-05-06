package main.java.string;

public class IsUniqueCharater {
public static void main(String args[]) {
	String str="ABBA";
	
	
	System.out.println(isUniqueChar(str));
	System.out.println(isUniqueChar1(str));
}
//assuming charater set is ASCII if it is Unicode then we can increan boolean array length.
private static boolean isUniqueChar(String str) {
	if(str.length()>128)
		return false;
	boolean[] char_set=new boolean[128];
	for(int i =0;i<str.length();i++) {
		int ch=str.charAt(i);
		if(char_set[ch]) {
			System.out.println("value of repeated charater  "+(char)ch);
			return false;
		}
		char_set[ch]=true;
	}
	return true;
	
}

//
static boolean isUniqueChar1(String str) {
	int checker=0;
	for(int i=0;i<str.length();i++) {
		int val=str.charAt(i)-'a';
		if((checker & (1<< val))>0) {
			System.out.println(str.charAt(i));
			return false;
			}
	checker |=(1<<val);
	}
	return true;
}

}
