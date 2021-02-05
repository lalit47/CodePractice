package com.cdac;
import java.util.Scanner;

public class FibonacciSeries {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
	     int first=0;
	     int sec=1;
	     System.out.print(first+" "+sec+" " );
	     for(int i=2;i<num;i++) {
	      int result=first+sec;	 
	      System.out.print(result+" ");
	      first=sec;
	      sec=result;
	     }
		
	}

}
