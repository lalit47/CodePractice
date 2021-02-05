package com.cdac;
import java.util.Scanner;

public class CheckPrimeBetweenTwoInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       int start=sc.nextInt();
	   int end=sc.nextInt();
	  // int num=sc.nextInt();
	   
	   for(int i=start;i<=end;i++) {
		   boolean status=CheckPrime(i);
	   if(status==true) {
		   System.out.println(i+" Prime Number");
	   }else {
		   System.out.println(i+" Not a Prime Number");
	   }
	  }
	}

	private static boolean CheckPrime(int num) {
		if(num<=1) 
			return false;
		for(int i=2;i<num;i++) 
			if(num%i==0) 
				return false;
		
		 return true;	
		
	}
	
	
}

