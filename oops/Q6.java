package oops;

import java.util.*;

public class Q6 {

	public static void main(String[] args) {
	 Scanner cin=new Scanner(System.in);
	 System.out.println("enter the size of the array:");
	 int n=cin.nextInt();
	 int[] a=new int[n];
	 for(int i=0;i<n;i++) {
		 a[i]=cin.nextInt();
	 }
	 
	 
	 for(int i=0;i<n;i++) {
		 int near=Integer.MAX_VALUE;
		 for(int j=0;j<n;j++) {
			 if(i!=j) {
				 if(a[i]<a[j]) {
					 if(a[j]<near) {
						 near=a[j];
					 }
				 }
				 
			 }
		 }
		 if(near==Integer.MAX_VALUE) {
			 near=-1;
		 }
		 System.out.print(near+" ");
	 }

	}

}
