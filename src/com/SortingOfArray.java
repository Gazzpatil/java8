package com;
@FunctionalInterface
interface InsertSort{
	void sort(int[] arr);
}
public class SortingOfArray {
public static void main(String[] args) {
	InsertSort s=arr->{
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	};
	int[] arr= {10,20,4,5,11,45,66};
	s.sort(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
}
}
