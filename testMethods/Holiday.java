package testMethods;

import java.util.*;

public class Holiday {
	private String name;
	private int day;
	private String month;
	Holiday(String name,int day, String month){
		this.name=name;
		this.day=day;
		this.month=month;
	}
	
	static boolean isMonth(Holiday h1,Holiday h2) {
		if(h1.month==h2.month) {
			return true;
		}else 
		{return false;}
	}
	
	public static void main(String[] args) {
		Holiday h1=new Holiday("diwali", 3, "september");
		Holiday h2=new Holiday("Dhasara", 15,"september");
		boolean ismonth=isMonth(h1, h2);
		if(ismonth) {
			System.out.println("true");
		}else {System.out.println("false");}
	}
}
