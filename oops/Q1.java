package oops;

import java.util.Scanner;

class Rectangle{
	int height;
	int width;
	public  void display(int n,int y) {

		System.out.print(n+"  "+y);
	}
}
class RectangleArea extends Rectangle{
	public void addinput() {
		Scanner cin=new Scanner(System.in);
		System.out.println("enter the height:");
		int height=cin.nextInt();
		System.out.println("enter the width:");
		int width=cin.nextInt();
		this.height=height;
		this.width=width;
		display(this.height,this.width);
		display(this.height*this.width);

	}
	public void display(int n) {
		System.out.println();
		System.out.println(n);
	}
}

public class Q1 {
	public static void main(String[] args) {
		RectangleArea r1=new RectangleArea();
		r1.addinput();



	}
}

