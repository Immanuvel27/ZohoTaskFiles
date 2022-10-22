package test1;

import java.util.Scanner;

public class subArray {
	static void subarr(int arr[],int n,int sum) {
		int res;
//		
		System.out.println(sum);
		for(int i=0;i<n;i++) {
			res=0;
			
			for(int j=i;j<n;j++) {
				res+=arr[j];
				
				if(res==sum){
					System.out.print("{");
					for(int k=i;k<=j;k++) {
						System.out.print(arr[k]+",");
					}
					System.out.print("}");
					
				}
				
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
		
		System.out.println("enter tbhe sum:");
		int sum=cin.nextInt();
		
		subarr(arr,n,sum);
		
		

	}

}
