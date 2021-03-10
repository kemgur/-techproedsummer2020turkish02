package day05incrementdecrement;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 Sayilari kullanicidan alin
		 iki tane intiger variable olusturun
		 Sonra bu integerlarin yerlerini degistirin((swap) yani a=3 b= 5 olsun
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz");
		int s1 = scan.nextInt();
		System.out.println("Ikinci sayiyi giriniz");
		int s2 = scan.nextInt();
		
		System.out.println(s1 +" " + s2);
		int s3 = s1;
		s1=s2;
		s2=s3;
		System.out.println(s1 +" " + s2);
	
		//2. yol
		s1 = s1 + s2;
		s2 = s1 -s2;
		s1 = s1 -s2;
		System.out.println(s1 +" " + s2);
		
scan.close();
	}

}
