//4. Write a Java method to count all words in a string.

package testMethods;

import java.util.Scanner;

public class countWords {
	public static int count(String str,int n) {
		int count=1;
		char[] ch=str.toCharArray();
		for(int i=0;i<n;i++) {
			if(ch[i]==' ') {
				count++;
			}
		}
		return(count);
	}

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=cin.nextLine();
		int n=str.length();
		int count=count(str,n);
		System.out.println("the no of word in string is:"+count);
		

	}

}
