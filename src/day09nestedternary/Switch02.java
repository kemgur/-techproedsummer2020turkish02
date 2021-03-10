package day09nestedternary;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
	
		 /*
		 Kullanicidan gun numarasini alin
		 Ekrana gun ismini yazdirin
		 1 ==> Pazar, ... 7 ==> Cumartesi
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Birden 7 te kadar bir gun giriiniz");
		int s = scan.nextInt();
		
		switch(s) {
		
		case 1:
			System.out.println("Pazar");
			break;
		case 2:
			System.out.println("Pazartesi");
			break;
		case 3:
			System.out.println("Sali");
			break;
		case 4:
			System.out.println("Carsamba");
			break;
		case 5:
			System.out.println("Persembe");
			break;
		case 6:
			System.out.println("Cuma");
			break;
		case 7:
			System.out.println("Cumartesi");
			break;
		default:
			System.out.println("Gecerli gun giriniz");
		
		}
		scan.close();
	}

}
