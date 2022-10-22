//Write a Java method to count all vowels in a string.
// Input the string: Education

package testMethods;

import java.util.Scanner;

public class countVowels {
	public static int count(String str,int n) {
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<n;i++){
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||
					ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
				
			}
			
		}
		return(count);
	}
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("Eneter the string:");
		String str=cin.nextLine();
		int n=str.length();
		int count=count(str,n);
		System.out.println("the total number of vowels in string:"+count);
	}

}
