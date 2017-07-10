package com.cts.platform.SpringSample;

import java.util.Arrays;

public class AddressSort {
   static void bubbleSort(int[] arr){
	   for(int m=0;m< arr.length;m++){
			for(int i=0;i<arr.length-1;i++){
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
   }
   
   static void selectionSort(int[] arr){
	   for(int i=0;i<arr.length-1;i++)
	   {
		   int temp=i;
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[temp]>arr[j])
			   {
				   temp=j;
			   }
		   }
		   int smallestNumber=arr[temp];
		   arr[temp]=arr[i];
		   arr[i]=smallestNumber;
		   
	   }
   }
   
   static void insertionSort(int[] arr)
   {
	   for(int i=1;i<arr.length;i++){
		   for(int j=0;j<=i;j++){
			   if(arr[j]>arr[i]){
				   int temp=arr[j];
				   arr[j]=arr[i];
				   arr[i]=temp;
				}
		   }
	   }
   }
	
	public static void main(String[] args) {
		int[] arr={1,2,3,5,8,4,2,9,7};
		//bubbleSort(arr);
		//selectionSort(arr);
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
