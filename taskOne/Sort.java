//Given an unsorted array arr[] of size N having both negative and positive
//integers. The task is place all negative element at the end of array without
//changing the order of positive element and negative element.
//Example 1:
//Input :
//N = 8
//arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
//Output :
//1  3  2  11  6  -1  -7  -5
//Example 2:
//Input :
//N=8
//arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
//Output :
//7  9  10  11  -5  -3  -4  -1


package taskOne;
import java.util.*;
public class Sort {
	public static void main(String[] args) {
//		int arr[] = { 1, -1, -3, -2, 7, 5, 11, 6 };
		Scanner cin=new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int x=cin.nextInt();
		int [] arr=new int[x];
		System.out.println("enter the array: ");
		for(int i=0;i<x;i++) {
			arr[i]=cin.nextInt();
		}
		int n=arr.length;
		int temp[] = new int[n];
		int j=0;
		
		for(int i=0;i<n;i++) {
			 if (arr[i] >= 0)
	                temp[j++] = arr[i];
		}
		
		for(int i=0;i<n;i++) {
			 if (arr[i] < 0)
	                temp[j++] = arr[i];
		}
		
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
