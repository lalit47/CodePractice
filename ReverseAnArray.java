package com.cdac;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        int arr[]=new int[num];
//        for(int i=0;i<arr.length;i++) {
//        	arr[i]=sc.nextInt();
//        }
        int arr[]= {4,5,1,2};
        int temp;
        int i=0;
        for( i=0;i<arr.length;i++) {
        	if(i==0) {
        		temp=arr[0];
        		arr[0]=arr[3];
        		arr[3]=temp;
        	}
        	if(i==1) {
        		temp=arr[2];
        		arr[2]=arr[1];
        		arr[1]=temp;
        	}
        	System.out.print(arr[i]+" ");
        }
      
	}

}
