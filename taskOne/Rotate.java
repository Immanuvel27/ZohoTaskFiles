// Given two strings a and b. The task is to find if the string 'b' can be obtained
//by rotating another string 'a' by exactly 2 places.
//Example 1:
//Input:
//a = amazon
//b = azonam
//Output: 1
//Example 2:  Input:
//a = geeksforgeeks
//b = geeksgeeksfor
//Output: 0

package taskOne;

import java.util.*;

public class Rotate {
	
	
	static void REVERSE(char str[], int i,int j) {
		char temp;
		
		while (i <= j)
		{
		
		temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		i++;
		j--;
		}
//		System.out.println(str);
	}
	
	
	static char[] reverseWords(char []s)
	{
	  
	  REVERSE(s, 0, 1);
	  REVERSE(s, 2, s.length - 1);
	 
	  REVERSE(s, 0, s.length - 1);
	  
	  return s;
	}
	
	
	public static void main(String args[]) {
		
		 Scanner cin = new Scanner(System.in);
	        System.out.print("Enter the String 1: ");
	        String s1= cin.nextLine();
	        System.out.print("Enter the String 2: ");
	        String s2= cin.nextLine();
	        if(s1.length()!=s2.length()) {
	        	System.out.println("string length Are not equal");
	        }
	        else {
	        char []p = reverseWords(s1.toCharArray());
	       char []q = s2.toCharArray();
	       int flag=0;
				for(int i=0;i<p.length;i++)
				{
					if(p[i]==q[i]) {
						flag=1;
					}
					else flag=0;
					
				}
					
					if(flag==1) {
						System.out.println("yes");
					}else 
						{System.out.println("no");
					}
	
	    }
}
	}