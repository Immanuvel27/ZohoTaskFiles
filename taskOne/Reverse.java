//Given a String S, reverse the string without reversing its individual words.
//Words are separated by dots.
//Example 1:
//Input:
//S = i.like.this.program.very.much
//Output: much.very.program.this.like.i
//Example 2:
//Input:
//S = pqr.mno
//Output: mno.pqr
//

package taskOne;

import java.util.Scanner;

public class Reverse {
	
	static void reverse(char str[], int i,int j)
	{
		char temp;
		
		while (i <= j)
		{
		
		temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		i++;
		j--;
		}
	}
	
	
	static char[] reverseWords(char []s)
	{
	 
	  int i = 0;
	  for (int j = 0; j < s.length; j++)
	  {
	    
	    if (s[j] == '.')
	    {
	      reverse(s, i, j-1);
	      i = j + 1;
	    }
	  }
	 
	 
	  reverse(s, i, s.length - 1);
	 
	  reverse(s, 0, s.length - 1);
	  
	  return s;
	}
	 
	public static void main(String args[]) {
		 Scanner cin = new Scanner(System.in);
	        System.out.print("Enter the String: ");
	        String s= cin.nextLine();
		  char []p = reverseWords(s.toCharArray());
		  System.out.print(p);
	}
	

}
