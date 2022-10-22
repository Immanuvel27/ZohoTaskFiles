// Write a Java method to find the smallest number among three numbers.


package testMethods;

import java.util.*;

public class smallNum {
	public static int minimum(int a,int b,int c) {
		int min;
		if(a<b&&a<c) {
			min=a;
		}else {
			if(b<a&&b<c) {
				min=b;
			}else {
				min=c;
			}
		}
		return(min);
	}
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the first no:");
		a=cin.nextInt();
		System.out.println("enter the second no:");
		b=cin.nextInt();
		System.out.println("enter the third no:");
		c=cin.nextInt();
		int min=minimum(a,b,c);
		System.out.println("the minimum is: "+min);
		
		
		
	}

}
