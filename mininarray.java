package arr;

import java.util.Scanner;
public class mininarray {
	 public static int func(int n){
	Scanner sc=new Scanner(System.in);
	int arr[] = new int[n];
	for(int i=0;i<n;i++){
	System.out.println("enter the elements:");
	    arr[i] = sc.nextInt();
	}
	int min=arr[0];
	
	
	for(int i=0;i<arr.length;i++){
	    if(arr[i]<min){
	        min = arr[i];
	    }
	    
	}
	return min;
	 }     
	 public static void main(String[] args) {
	Scanner sc = new Scanner(System .in);
	System.out.println("enter the size of array:");
	int n = sc.nextInt();
	System.out.println(func(n));
	}
	}



