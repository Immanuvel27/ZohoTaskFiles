// Given a string check if it is Pangram or not. A pangram is a sentence
//containing every letter in the English Alphabet.
//Example 1:
//Input:
//S = Bawds jog, flick quartz, vex nymph
//Output: 1
//Example 2:
//Input:
//S = sdfs
//Output: 0

package taskOne;

import java.util.*;

public class Pangram {
	 public static void main(String[] args) {
		 Scanner cin = new Scanner(System.in);
	        System.out.print("Enter the String: ");
	        String str= cin.nextLine();
		 boolean[] alphabet = new boolean[26];
		 int index = 0;
	      int flag = 1;
	      
	      for (int i = 0; i < str.length(); i++) {
	    	  if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
	              index = str.charAt(i) - 'A';
	           }else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
	              index = str.charAt(i) - 'a';
	        }
	    	  alphabet[index] = true;

	      } 	      
	      for (int i = 0; i <= 25; i++) {
	          if (alphabet[i] == false)
	          flag = 0;
	       }
	      System.out.print("String: " + str);
	      if (flag == 1)
	         System.out.print("\nThe above string is a pangram.");
	      else
	         System.out.print("\nThe above string is not a pangram.");
	     
	 }

}
