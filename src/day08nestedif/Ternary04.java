package day08nestedif;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan bir sayi alin 
		 * Bu sayi tek sayi ise karesini ekrana yazdirin
		 * Bu sayi cift sayi ise yarisini ekrana yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int num = scan.nextInt();
		
		int result = num%2==0 ? num/2 : num*num;
		System.out.println(result);
		
		scan.close();
	}

}
