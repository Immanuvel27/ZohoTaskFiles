//.Write a Java program to solve quadratic equations (use if, else if and
//else).

package taskOne;
import java.util.*;


public class quadraticEquation {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		
		System.out.println("enter the a:");
		int a=cin.nextInt();
		System.out.println("enter the b:");
		int b=cin.nextInt();
		System.out.println("enter the c:");
		int c=cin.nextInt();
		double Root=Math.sqrt(b*b-(4.0*a*c));
		
		if(Root>0) {
			double result1=((-b+Root)/2.0*a);
			double result2=((-b-Root)/2.0*a);
			System.out.println("root:  "+result1+" , "+result2);
		}
		else if(Root==0) {
			double result=(-b/(2.0*a));
		}
		else {
			System.out.println("there no roots");
		}
	}

}
