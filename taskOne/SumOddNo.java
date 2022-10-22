//Write a program in Java to display the n terms of odd natural number
//and their sum.
//Input number of terms is: 5
//Expected Output :
//The odd numbers are :
//1
//3
//5
//7
//9
//The Sum of odd Natural Number up to 5 terms is: 25

package taskOne;

import java.util.*;

public class SumOddNo {
public static void main(String args[]) {
	
	Scanner cin = new Scanner(System.in);
	
	System.out.println("Enter the number of items :");
	int n=cin.nextInt();
	int sum=0;
	for(int i=1;i<=n*2;i++) {
		if(i%2!=0) {
			sum+=i;
			System.out.println(i);
		}
	}
	System.out.println("the sum of first "+n+" odd natural numbers is: "+sum);
}
}
