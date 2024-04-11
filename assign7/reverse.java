package com.sunbeam;

public class reverse {
	public static void main(String[]args)
	{
	String str="atharv";
	String reversestr="";
	for(int i = str.length()-1; i >= 0; i--){  
		reversestr = reversestr + str.charAt(i);  
	}
	
System.out.println("orginal---"+ str);

	System.out.println("reverse string--"+reversestr);
}
}
