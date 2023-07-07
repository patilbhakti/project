package com.sample;

import java.util.Scanner;


public class Palindrome {
	

   
	Scanner sc=new Scanner(System.in);
	
    public static void main( String[] args )
    {
        Palindrome pal=new Palindrome();
        pal.strPalindrome();
        pal.numPalindrome();
        pal.subString();
        
       
    }
    
    public void strPalindrome() {
    	 System.out.println("Enter string to check palindrome:");
    	 String str=sc.nextLine();
        int len=str.length();
        String rev="";
    	for(int i=len-1;i>=0;i--){
    		rev+=str.charAt(i);
    	}
    	if(str.equals(rev))
    	 System.out.println("Palindrome");
    	else
    	  System.out.println("Not a Palindrome");;
	}
    
    public void numPalindrome() {
    	System.out.println("Enter a number to check palindrome:");
    	int n=sc.nextInt();
    	int temp,r,sum=0;
    	temp=n;
    	while(n>0) {
    		r=n%10;
    		sum=(sum*10)+r;
    		n=n/10;
    	}
    	if(temp==sum)
    		System.out.println("Palindrome");
    	else
    		System.out.println("Not a Palindrome");
    }
    
    public void subString() {
    	String sentence=sc.nextLine();
    	String word=sc.nextLine();
    	
    	String s[]=sentence.split(" ");
    	for(String str:s) {
    		if(str.equalsIgnoreCase(word))
    			System.out.println("Present");
    		else 
    			System.out.println("Not Present");
    	}
    }
}
