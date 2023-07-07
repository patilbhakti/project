package com.sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class FileHandling {
	
	

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		FileWriter fwriter=new FileWriter("D:/Selenium/emp.txt",true);
		System.out.println("Enter a text to enter in file:");
        String name=sc.nextLine();
        String age=sc.nextLine();
        String designation=sc.nextLine();
        
        

        BufferedWriter bwriter=new BufferedWriter(fwriter);
        
        bwriter.write(name+" ");
        bwriter.write(age+" ");
        bwriter.write(designation);
        bwriter.flush();
        bwriter.newLine();
        System.out.println("File output is completed");
        bwriter.close();
        fwriter.close();
        
        FileHandling fh=new FileHandling();
        fh.fileReader();
        
        
	}
	
	public void fileReader() throws Exception{
		 //FileReader points a file in read  mode 
        FileReader fileReader=new FileReader("D:/Selenium/emp.txt");
        // BufferedReader will read from a specific file in the form of  string
        BufferedReader bReader=new BufferedReader(fileReader);
        
        while(true) {
     	   String str=bReader.readLine();
     	   if(str==null)  // end of file
               break;
     	   System.out.println(str);
        }
        bReader.close();
        fileReader.close();
	}
	
	public void fileDelete(String name,String age, String designation) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of product to delete:");
		String na=sc.nextLine();
		FileReader fr=new FileReader("D:/Selenium/emp.txt");
		BufferedReader br=new BufferedReader(fr);
		TreeSet<String> set=new TreeSet<String>();
		set.add(name);
		set.add(age);
		set.add(designation);
		boolean flag=false;
		while(true) {
			String str=br.readLine();
			if(str==null)
				break;
			String arr[]=str.split(" ");
			String n=arr[0];
			if(na.equalsIgnoreCase(n))
				flag=true;
			else {
				
			}
			
			
			
		}
		
		
	}

}
