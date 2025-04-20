package com.array;

public class StringUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Arv sunil";
		System.out.println("check duplicates characters in String  "+isUniqueCharacter(str));
		System.out.println("check duplicates characters in String  "+isUniqueCharacterBit(str));
		
	}

	private static boolean isUniqueCharacterBit(String str) {
		int checker=0;
		for(int i=0;i<str.length();i++){
			int val=str.charAt(i)-'a';
			int x=checker & (1<<val);
			if(x>0){
			return false;	
			}
			checker|=(1<<val);
		}
		return true;
		
	}

	private static boolean isUniqueCharacter(String str) {
		if(str.length()>128)
			return false;
		boolean[] b=new boolean[128];
		for(int i=0;i<str.length();i++){
			int val=str.charAt(i);
			if(b[val])
				return false;
			b[val]=true;
			
		}
		return true;
		
	}
		
	}

