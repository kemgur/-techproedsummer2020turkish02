package day08nestedif;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		  Kullanıcıdan bir character alın 
		  Eğer character bir harf ise ekrana “Harf” yazdırın.
		  Diğer durumlarda ekrana “Harf değil” yazdırın.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		char harf = scan.next().charAt(0);
		
		String result = (harf>='a' && harf<='z' ||harf>='A' && harf<='Z'? "Harf" : "Harf degil");
		System.out.println(result);
		
		scan.close();
	}

}
