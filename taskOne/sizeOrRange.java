// Write a program to illustrate the size or range of various data types.

package taskOne;

public class sizeOrRange {
	public static void main(String args[]) {
		System.out.println("integer size:"+(Integer.SIZE));
		System.out.println("integer range:"+(Integer.MIN_VALUE) +" to "+(Integer.MAX_VALUE));
		
		System.out.println("short size:"+(Short.SIZE));
		System.out.println("short range:"+(Short.MIN_VALUE) +" to "+(Short.MAX_VALUE));
		
		System.out.println("Float size:"+(Float.SIZE));
		System.out.println("Float range:"+(Float.MIN_VALUE) +" to "+(Float.MAX_VALUE));
		
		System.out.println("Long size:"+(Long.SIZE));
		System.out.println("Long range:"+(Long.MIN_VALUE) +" to "+(Long.MAX_VALUE));

		System.out.println("Double size:"+(Double.SIZE));
		System.out.println("Double range:"+(Double.MIN_VALUE) +" to "+(Double.MAX_VALUE));
		
		System.out.println("char size:"+(Character.SIZE));
		System.out.println("Char range:"+(Character.MIN_VALUE) +" to "+(Character.MAX_VALUE));
		
	}

}
