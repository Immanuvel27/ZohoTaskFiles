package test1;

import java.util.*;

public class consequtive {
	
	static void  Check(int arr[],int n) {
		int min=arr[0];
		int max=arr[n-1];
		int flag=0;
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[i-1]+1) {
				flag=0;
				break;
			}else {
				{
					flag=1;
				}
			}
		}
		if(flag==1) {
			System.out.println("The array contains consequtive integers from "+min+" to "+max);
		}
		else {
			{
				System.out.println("the array doesnot contain consequtive numbers ");
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=cin.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the array:");
		for(int i=0;i<n;i++) {
			arr[i]=cin.nextInt();
		}
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		Check(arr,n);

	}

}
