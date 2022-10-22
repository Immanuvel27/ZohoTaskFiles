// Write a Java program to swap two variables.
package taskOne;
import java.util.*;
public class Swap {
	
	public static void main(String args[]) {
		Scanner cin=new Scanner(System.in); 
		System.out.println("enter the number 1");
		int number1=cin.nextInt(); 
		System.out.println("enter the number 2");
		int number2=cin.nextInt();
		cin.close();
		int temp;
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("after swapping");
		System.out.println("number1:"+number1);
		System.out.println("number2:"+number2);
		
	}
	

}
