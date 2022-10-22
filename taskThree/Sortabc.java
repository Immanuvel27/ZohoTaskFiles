package taskThree;
import java.util.*;
public class Sortabc {
	public static void main(String args[]) {
	Scanner cin=new Scanner(System.in);
	System.out.println("enter the string");
	String str=cin.nextLine();
	String s1="";
	char[] ch = str.toCharArray();
	
	int n=str.length();
	
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
			if(ch[i]==ch[j]){
				ch[j]='*';
			}
		}
	}
	for(int i=0;i<n;i++) {
	if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z')	{
		s1+=ch[i];
	}else {
		continue;
	}
	}
	char[] ch1=s1.toCharArray();
	char temp;

	for(int i=0;i<s1.length()-1;i++) {
		for(int j=i+1;j<s1.length();j++) {
			if(ch1[i]>ch1[j]) {
				temp=ch1[i];
				ch1[i]=ch1[j];
				ch1[j]=temp;
		}
	}}
	System.out.println("dupilcate removed:");	
	System.out.println(s1);
	
	System.out.println("sorted:");
	for(int i=0;i<s1.length();i++) {
		System.out.print(ch1[i]);
	}

}
}