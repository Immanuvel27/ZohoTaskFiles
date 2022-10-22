package tasktwo;
import java.util.*;

import taskOne.Reverse;
public class twistedPrime {
	static boolean checkPrime(int n) {
		int size=n/2;
		boolean flag=true;
		for(int i=2;i<size;i++) {
			if(n%i==0) {
				System.out.println("not prime");
				flag=false;
				break;
			}
			
			
		}
		if(flag==true) {
			System.out.println("it is prime number");
		}
		return flag;
	}
	
	static int reverse(int n)
    {
        int rev = 0, r;
        while (n > 0)
        {
            r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        return rev;
    }
	
	
	public static void main(String[] args) {
	      Scanner cin = new Scanner(System.in);
	      System.out.println("enter the number");
	      int n=cin.nextInt();
	      
	      boolean r=checkPrime(n);
	      int rev=reverse(n);
	      System.out.println("reversed"+rev);
	      boolean r1=checkPrime(rev);
	      
	      if(r==true&&r1==true) {
	    	  System.out.println("twisted prime");
	      }
	      else {
	    	  System.out.println("it is not twisted prime");
	      }
	      }
}
