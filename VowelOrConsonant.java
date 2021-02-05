package com.cdac;
import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any letter:");
		char ch=sc.next().charAt(0);
        //String a="",e="",i="",o="",u="";
	   
       if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
	          System.out.println("Vowel");
       }else{
    	      System.out.println("Consonant");
       }
    	 

}
}
