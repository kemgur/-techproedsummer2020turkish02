package day05incrementdecrement;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 Kulanicidan 3 basamakli bir sayi aliniz
		 Bu sayinin rakamlari toplamini ekrana yaziniz
		 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		int s =scan.nextInt();
		
		int sonRakam = s%10;
		int ortaRakam = (s/10)%10;
		int ilkRakam = (s/100)%10;
		
		int Toplam = sonRakam +ortaRakam +ilkRakam;
		System.out.println(Toplam);
		
		
		
		
		scan.close();
		
		

	}

}
