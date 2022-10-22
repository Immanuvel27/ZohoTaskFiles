package test1;
import java.util.*;
public class removeVowel {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=cin.nextLine();
		int n=str.length();
		int z=0;
		char[] ch = str.toCharArray();
		char[] ch1=new char[n];
		
		for(int i=0;i<n-1;i++) {
			if(ch[i]!=ch[i+1]) {
				if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||
						ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
					ch[i]='#';
					
				}
				
			}
			else 
				if(ch[i]==ch[i+1]) {
				i++;
			}
		}
		if(ch[n-1]!=ch[n-2]) {
			if(ch[n-1]=='A'||ch[n-1]=='E'||ch[n-1]=='I'||ch[n-1]=='O'||ch[n-1]=='U'||ch[n-1]=='a'||ch[n-1]=='e'||ch[n-1]=='i'||ch[n-1]=='o'||ch[n-1]=='u') {
				ch[n-1]='#';
		}
		}
		
		for(int i=0;i<n;i++) {
			if(ch[i]!='#') {
				ch1[z++]=ch[i];
			}
		}
		System.out.println();
		for(int i=0;i<ch1.length;i++) {
			System.out.print(ch1[i]);
		}
		
		
		
		
	}

}
