//Two numbers are entered through the keyboard. Write a program to find
//the value of one number raised to the power of another. (Do not use Java builtin method)
package taskOne;

import java.util.*;

public class Power {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Enter the number 1 :");
		int a=cin.nextInt();
		System.out.println("Enter the number 2 :");
		int b=cin.nextInt();
	int result=1;
	for(int i=0;i<b;i++) {
		result*=a;
	}
	System.out.println("the a power b is: " +result);
	}

}
