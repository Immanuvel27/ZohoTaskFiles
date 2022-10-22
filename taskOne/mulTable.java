// Write a Java program that takes a number as input and prints its
//multiplication table up to 10.

package taskOne;

import java.util.*;

public class mulTable {
	public static void main(String args[]) {
		int number;
		System.out.println("Enter the number to be multiplied:");
		Scanner cin=new Scanner(System.in);
		number=cin.nextInt();
		cin.close();
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+"*"+number+"="+(i*number));
		}
		
	}
}
