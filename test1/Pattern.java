package test1;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.println("enter the no of rows:");
		int n=cin.nextInt();
		int k=1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(k++);
				if(j<i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		k+=-1;
		for(int i=1;i<=n;i++) {
			int f=k-(n-i);
			for(int j=n-i;j>=0;j--) {
				System.out.print(f++);
				
				if(j>0){
					System.out.print("*");
				}
				k--;
				
				
				
			}
			
			System.out.println();
		}
		
		

	}

}
