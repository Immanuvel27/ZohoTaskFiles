//Given an array of integers of size n. Convert the array in such a way that if next valid number is
//same as current number, double its value and replace the next number with 0. After the
//modification, rearrange the array such that all 0’s are shifted to the end.
//Input : arr[] = {2, 2, 0, 4, 0, 8}      Output : 4 4 8 0 0 0
//Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}        Output : 4 2 12 8 0 0 0 0 0 0

package tasktwo;
import java.util.*;
public class doubleandendzero {
	public static void main(String[] args) {
	      Scanner cin = new Scanner(System.in);
	      System.out.println("enter the number of items");
	      int n=cin.nextInt();
	      int[] arr=new int[n];
	      System.out.println("enter the array");
	      for(int i=0;i<n;i++){
	          arr[i]=cin.nextInt();
	      }
	      for(int i=0;i<n-2;i++){
	          if(arr[i]!=0&&arr[i]==arr[i+1]){
	              arr[i]*=2;
	              arr[i+1]=0;
	              i++;
	          }
	      }
	   
	    int c=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]!=0){
	            arr[c++]=arr[i];
	        }
	    }
	    while (c < n)
	            arr[c++] = 0;
	      
	      
	      for(int i=0;i<n;i++){
	          System.out.print(arr[i]+" ");
	      }
	    }

}
