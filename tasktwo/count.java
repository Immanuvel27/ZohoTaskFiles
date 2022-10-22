package tasktwo;
import java.util.*;
public class count {
public static void main(String args[]) {
	Scanner cin=new Scanner(System.in);
	System.out.println("enter the number of items in array");
	int n=cin.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the array");
	for(int i=0;i<n;i++) {
		arr[i]=cin.nextInt();
	}
	
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
	
	int count=1;
	for(int i=0;i<n;i++) {
		if(arr[i]<0) {
			continue;
		}else {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=-1;
					count++;
				}
			}
			System.out.println(arr[i]+"|"+count);
			count=1;
		}
		
		
		
	}
}
}
