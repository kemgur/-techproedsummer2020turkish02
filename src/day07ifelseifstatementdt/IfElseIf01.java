package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		
/*
 Kullanicidan sayi alin
 Sayi 0'dan buyuk ise ekrana "Pozitif" yazdirin
 Sayi sifir ise ekrana "Notr"  yazdirin
 Sayi sifirdan kucuk ise ekrana "Negatif" yazdirin
 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		double s = scan.nextDouble();
		
		if(s>0) {
			System.out.println("Pozitif");
			
		}else if(s==0) {
			System.out.println("Notr");
			
		}else if(s<0) {
			System.out.println("Negatif");
			
		}else {
			System.out.println("Ben sana sayi gir dedim");
		}
		scan.close();
	}

}
