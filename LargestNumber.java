package com.cdac;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int arr[]=new int[num];
     for(int i=0;i<num;i++) {
          arr[i]=sc.nextInt();
	}
     int max=arr[0];
     for(int i=1;i<arr.length;i++) {
    	 if(max<arr[i]) {
    		 int temp=max;
    		 max=arr[i];
    	 }
     }
     System.out.println(max);
	}

}
