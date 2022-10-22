package tasktwo;

import java.util.Arrays;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string:");
		String str= scanner.nextLine();
		char[] arr = new char[str.length()];
		int div = str.length()/2;
		int j=0;
		for (int i = div; i < arr.length; i++) {
				arr[j] += str.charAt(i);
				j++;
		}
		for (int i = 0; i < div; i++) {
			arr[j] += str.charAt(i);
			j++;
	    }
		pattern(arr);
		
	}

	private static void pattern(char[] arr) {
		int n = arr.length;
		int k = n*2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
			k = k-2;
		}
	}
}
