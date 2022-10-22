// Given 2 huge numbers as separate digits, store them in array and process them and calculate
//the sum of 2 numbers and store the result in an array and print the sum.
//Input: Number of digits:12
//9 2 8 1 3 5 6 7 3 1 1 6
//Number of digits:9
//7 8 4 6 2 1 9 9 7
//Output :  9 2 8 9 2 0 2 9 5 1 1 3


package tasktwo;

import java.util.*;

public class addString {
	static int convertDigit(int arr[]) {
		int dig=0;
		
		for(int i=0;i<arr.length;i++) {
			dig=dig*10+arr[i];
		}
		return dig;
	}
public static void main(String args[]) {
	Scanner cin=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=cin.nextInt();
	int[] arr=new int[n];
	int[] arr1=new int[n];
	
	System.out.println("enter the array2:");
	for(int i=0;i<n;i++) {
		arr[i]=cin.nextInt();
	}
	
	System.out.println("enter the array2:");
	for(int i=0;i<n;i++) {
		arr1[i]=cin.nextInt();
	}
	
	int dig=convertDigit(arr);
	int dig1=convertDigit(arr1);
	int sum=dig+dig1;
	int temp=sum;
	int count=0;
	while(temp!=0) {
		temp/=10;
		++count;		
	}
	int[] arr2=new int[count];
	for(int i=count-1;i>=0;i--) {
		arr2[i]=sum%10;
		sum/=10;
	}
	for(int i=0;i<count;i++) {
		System.out.print(arr2[i]+" ");
	}
	
//	System.out.println(dig);
//	System.out.println(dig1);
//	System.out.println(sum);
}
}
