package test1;
import java.util.*;
public class uniqueThreeDigit {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				int temp=0;
				for(int k=1;k<=4;k++) {
					if(i!=k&&j!=k&&j!=i) {
						System.out.print(((((temp+i)*10)+j)*10)+k+"\n");
						count+=1;
					}
					
				}
			}
		}
		System.out.println("the total number of count is:"+count);

	}

}
