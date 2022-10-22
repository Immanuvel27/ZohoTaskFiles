//You just need to take a string and a integer as an input and repeat the string upto the count given
//as in integer.
//Sample Test Case :
//Hello
//2
//Output :
//HelloHello

package taskThree;
import java.util.*;
public class stringRepeat {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("enter the string");
		String str=cin.nextLine();
		System.out.println("enter the number:");
		int n=cin.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(str);
		}
		
		

	}

}
