package com.cdac;
import java.util.Scanner;

public class FibonacciSeriesUptoGivenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int a=0,b=1;
      int c;
      System.out.print(a+" "+b+" ");
      
      for(int i=2;i<num;i++) {
    	  c=a+b;
    	  if(c<num) {
    	  System.out.print(c+" ");
          a=b;
          b=c;
    	  }else {
    		 break;
    	  }
      }
	}

}
