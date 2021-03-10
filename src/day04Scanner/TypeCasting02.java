package day04Scanner;

public class TypeCasting02 {

	public static void main(String[] args) {
		
		/*
		 Desimal bier sayiyi byte, short, int, long gibi bir tam sayiya assign edersek
		  Java o virgullu sayinin ondalik kismini iptal eder sadece tam kismini kabul eder.
		  Java yuvarlama yapmaz.
		  
		 */
		int i1 = 5/2;
		System.out.println(i1);
		
		//Java int/int sonucunu tamsayi olarak return eder.
		double d1 =5/2;
		System.out.println(d1);//2.0
		
		//Matematiksel islemlerde birden fazla data type kullanilirsa Java sonucu en buyuk data type gore verir
		double d2 = 5.0/2;
		System.out.println(d2);//2.5
		
		double d3= 5/2.0;
		System.out.println(d3);//2.5
		

	}

}
