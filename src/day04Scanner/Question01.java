package day04Scanner;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
	
		/*Kullanıcıdan dikdörtgenin boyutlarını alan ve sonra diktörtgenin alan ve 
		cevresini hesaplayıp ekrana yazdıran bir program yazınız. 
		Not: Alan: Boy x En 
		Not: Çevre: 2x (Boy + En)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dikdortgenin enini ve boyunu giriniz");
		int en = scan.nextInt();
		int boy = scan.nextInt();
		
		System.out.println("Alan: "+ en*boy);
		System.out.println("Cevre: "+ 2*(en+boy));
		
		scan.close();  

	}

}
