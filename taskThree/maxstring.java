// Given a list of non-negative integers nums, arrange them such that they form the largest number
//and return it. Since the result may be very large, so you need to return a string instead of an
//integer.
//Input: nums = [10,2]
//Output: "210"
//Input: nums = [3,30,34,5,9]
//Output: "9534330"

package taskThree;

import java.util.*;

public class maxstring {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=cin.nextInt();
		String[] num=new String[n];
		System.out.println("enter the array:");
		for(int i=0;i<n;i++) {
			int s=cin.nextInt();
			num[i]=Integer.toString(s);
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(num[i]);
		}
		System.out.println();
		String xy="";
		String yx="";
		String temp;
		String s1="";
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				xy=num[i]+num[j];
				yx=num[j]+num[i];
				if(Integer.parseInt(xy)<Integer.parseInt(yx)) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;			
				}
			}s1+=num[i];
		}
		System.out.println(s1);
		

	}

}
