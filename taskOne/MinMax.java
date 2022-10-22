//iven an array A of size N of integers. Your task is to find the minimum
//and maximum elements in the array.
//Example 1:
//Input:
//N = 6
//A[] = {3, 2, 1, 56, 10000, 167}
//Output:
//min = 1, max = 10000
//Example 2:
//Input:
//N = 5
//A[] = {1, 345, 234, 21, 56789}
//Output:
//min = 1, max = 56789

package taskOne;

import java.util.*;

public class MinMax {
	public static void main(String args[]) {
		Scanner cin=new Scanner(System.in);
		System.out.println("enter the number of items in array:");
		int n=cin.nextInt();
		int [] arr=new int[n];
		
		System.out.println("enter the array:");
		for(int i=0;i<n;i++) {
			arr[i]=cin.nextInt();
		}
		int max,min;
		max=arr[0];
		min=arr[0];
		for (int i = 1; i < n; i++)
	    {
	      
	        if (arr[i] > max) {
	            max = arr[i];
	        }
	 
	        else
	        if (arr[i] < min) {
	            min = arr[i];
	        }
	    }
		
		
		System.out.println("maximum is:"+max);
		System.out.println("minimum is:"+min);
	}

}
