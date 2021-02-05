package com.cdac;
import java.util.Scanner;

public class SwappingTwoNumbersWithoutUsingThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println(a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping");
       System.out.print(a+" "+b);
        
	}

}
