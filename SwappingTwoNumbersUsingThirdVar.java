package com.cdac;
import java.util.Scanner;

public class SwappingTwoNumbersUsingThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("Before Swapping");
      System.out.println(a+" "+b);
      int temp=b;
      b=a;
      a=temp; 
      System.out.println("After Swapping");
      System.out.print(a+" "+b);
	}

}
