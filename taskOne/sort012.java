//Given an array of size N containing only 0s, 1s, and 2s; sort the array in
//ascending order.
//Example 1:
//Input:
//N = 5
//arr[]= {0 2 1 2 0}
//Output:
//0 0 1 2 2
//Example 2:
//Input:
//N = 3
//arr[] = {0 1 0}
//Output:
//0 0 1

package taskOne;

import java.util.*;

public class sort012 {
	public static void main(String[] args) {
//		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		Scanner cin=new Scanner(System.in);
		int [] arr=new int[10];
		int flag=0;
		int temp;
		System.out.println("Enter the number of items in array:");
		int n=cin.nextInt();
		System.out.println("ENter the array:");
		for(int i=0;i<n;i++) {
			arr[i]=cin.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==0||arr[i]==1||arr[i]==2) {
				flag=1;
			}else {
				flag=0;
			}
			
		}
		
		if(flag==1) {
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		}else {
			System.out.println("invalid array");
		}
		
	}
	

}
