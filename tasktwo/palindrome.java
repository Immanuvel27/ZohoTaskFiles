package tasktwo;


import java.util.*;



public class palindrome {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String string=cin.nextLine();
		char[] arr=string.toCharArray();
		int len=arr.length;
		String res="";
		String rev="";
		int j=0;
		for(int i=0;i<len;i++) {
			if(arr[i]>='A'&& arr[i]<='Z') {
				int r=(int)arr[i]+32;
				res+=(char)r;
			}
			else if(arr[i]>='a'&&arr[i]<='z') {
				res+=arr[i];				
			}
			else {
				continue;
			}
			
			
		}
		
		  for ( int i = res.length() - 1; i >= 0; i-- ) {
				rev += res.charAt(i);
		  } 
         char[] t1=res.toCharArray();
         char[] t2=rev.toCharArray();
         int flag=1;
         for(int i=0;i<res.length();i++) {
        	 if(t1[i]!=t2[i]) {
        		 flag=0;
        		 break;
        	 }
         }
         
         if(flag==1) {
        	 System.out.println("it is a palindrom");
         }else {
        	 System.out.println("not a palindrome");
         }
		  
		System.out.println(rev);
		

	}

}
