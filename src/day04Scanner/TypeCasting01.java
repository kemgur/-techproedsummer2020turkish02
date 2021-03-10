package day04Scanner;

public class TypeCasting01 {

	public static void main(String[] args) {
		// Kucuk data tipinin buyuk data tipine cast edilmesi 
		//Auto Widening (Genisletme) Casting
		byte b1 = 13;
		int i1 = b1;
		
		System.out.println(b1);
		System.out.println(i1);
				

		short s1 = 2300;
		float f1 = s1;
		System.out.println(f1);//2300.0 
		
		//Explicit(Acikca) Narrowing(Daraltma) Casting
		short s2 = 120;
		byte b2 = (byte)s2;
		System.out.println(b2);
		
		short s3 = 1200;
		byte b3 = (byte)s3;
		System.out.println(b3);
		
		short s4 = 1200;
		byte b4 = (byte)s3;
		System.out.println(b4);
		System.out.println(s4);
		
	}

}
