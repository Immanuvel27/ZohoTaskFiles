//4.Given an array A[] and a number x, check for pair in A[] with sum as x.


package tasktwo;
import java.util.*;

import taskOne.sort012;
public class pairs {

	static int delDup(int arr[],int n) {
		if(n==0||n==1) {
			return n;
		}
		int[] temp = new int[n];
		 
        
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
 
       
        temp[j++] = arr[n - 1];
 
      
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];
 
        return j;
	}
	
	
	static int sortArray(int arr[],int n) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		return n;
	}
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
	      System.out.println("enter the number of items");
	      int n=cin.nextInt();
	      int[] arr=new int[n];
	      System.out.println("enter the array");
	      for(int i=0;i<n;i++){
	          arr[i]=cin.nextInt();
	      }
	      System.out.println("enter the sum to be made for pair:");
	      int sum=cin.nextInt();
	       
	     n=sortArray(arr, n);
	     
	     n=delDup(arr,n);
	    
	     int count=0;
	      for(int i=0;i<n;i++) {
	    	  for(int j=i+1;j<n;j++) {
	    		  if(arr[i]+arr[j]==sum) {count++;
	    			  System.out.print("("+arr[i]+","+arr[j]+") ");
	    		  }
	    	  }
	      }
	      System.out.println("total number of pairs:"+count);
	}

}
