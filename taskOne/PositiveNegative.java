//Write a Java program that reads a floating-point number and prints
//"zero" if the number is zero. Otherwise, print "positive" or "negative". Add
//"small" if the absolute value of the number is less than 1, or "large" if it
//exceeds 1,000,000.

package taskOne;
import java.util.*;
public class PositiveNegative {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double number = cin.nextDouble();
        if(number>0) {
        	if (number < 1)
            {
                System.out.println("Positive small number");
            }
            else if (number > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }else if(number<0) {
        	number*=-1;
        	if (number < 1)
            {
                System.out.println("Negative small number");
            }
            else if (number > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }

		
	}

}
