package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		
		/*Kullanicidan iki not aliniz
		 Ortalama 50 nin altinda ise "Kaldiniz"
		 Ortalama 70 in altinda ise "C ile gectiniz"
		 Ortalama 85 in altinda ise "B ile gectiniz"
		 Ortalama 100 ve 100 un altinda ise "A ile gectiniz"
		 Diger durumlarda(Negatif ve 100 den buyuk) "Gecerli not giriniz"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki notunuzu giriniz");
		int not1 = scan.nextInt();
		int not2 = scan.nextInt();
	
		int ort = (not1 +not2)/2;
		
		if(ort<0) {
			System.out.println("Notlar negatif olamaz");
		
		}else if(ort<50) {
			System.out.println("Kaldiniz");
			
		}else if(ort<70) {
			System.out.println("C");
			
		}else if(ort<85) {
			System.out.println("B");
			
		}else if(ort<=100) {
			System.out.println("A");
			
		}else if(ort>=100 || ort<0) {
			System.out.println("Gecerli not giriniz");
		}
		scan.close();
	}
}

