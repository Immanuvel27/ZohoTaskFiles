//Write a Java method to display the middle character of a string.
// Note: a) If the length of the string is odd there will be two middle characters.


package testMethods;

import java.util.Scanner;

import taskThree.stringRepeat;

public class midElement {
	public static void middle(String str,int n) {
		int mid;
		char[] ch = str.toCharArray();
		if(n%2==0) {
			mid=n/2;
			System.out.println(ch[mid-1]+","+ch[mid]+" are mid elements");
		}
		else {
			mid=(n/2);
			System.out.println("the middle element is:"+ch[mid]);
		}
		
	}
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=cin.nextLine();
		int n=str.length();
		middle(str,n);

	}

}
