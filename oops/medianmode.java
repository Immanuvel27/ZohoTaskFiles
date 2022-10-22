package oops;

import java.util.*;



public class medianmode {
	public static void Sort(int a[],int n) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;

				}
			}
		}
	}

public static double med(int a[],int n) {
	double med=0;
	
	if((n%2)==0) {
		med=(a[(n)/2]+a[(n-1)/2])/2.0;
	}else {
		med=a[n/2];
	}
	return(med);
}

public static int mode(int a[],int n) {
	int maxcount=0,mode=0;
	for(int i=0;i<n;i++) {
		int count=1;
		for(int j=0;j<n;j++) {
			if(a[i]==a[j]) {
				count++;
			}
			if(count>maxcount) {
				maxcount=count;
				mode=a[i];
			}
		}
	}
	
	return(mode);
	
}




	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=cin.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array:");

		for(int i=0;i<n;i++){
			a[i]=cin.nextInt();
		}

		Sort(a,n);
		
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		double median=med(a,n);
		System.out.println("the median is:"+median);
		
		int mode=mode(a,n);
		System.out.println("the mode is:"+mode);

	}

}
