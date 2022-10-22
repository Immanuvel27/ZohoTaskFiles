package test1;

import java.util.*;


public class maxPatient {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("enter the number of days");
		int n=cin.nextInt();
		int[] arr=new int[n];
		int[] pat=new int[n];
		int nop=0,c=0,z=0;
		
		int k=3;
		System.out.println("enter the array");
		for(int i=0;i<n;i++) {
			arr[i]=cin.nextInt();
		}
			
		for(int i=0;i<n;i++) {			
			if(i>=k) {
			pat[i]=arr[i]+arr[i-k+1]+arr[i-k+2];
			}else {c+=arr[i];
				pat[i]+=c;
				
			}
			
			
		}
		int max=pat[0];
		System.out.println("the daily patients:");
		for(int i=0;i<n;i++) {
			System.out.print(i+1+"=>"+pat[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			if(pat[i]>=max) {
				max=pat[i];
			}
		}
		System.out.println(" maximun Number ofNumber pateints at:");
		for(int i=0;i<n;i++) {
			if(max==pat[i]) {
				System.out.print(i+1+" ");
			}
		}
	}

}
