package day09nestedternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		
		/*Kullanicadan bir ucgenin uc kenar uzunlugunu alin
		 * Ucu de birbirine esitse ucgenin cevresini kontrol edin 
		 * Cevre 30 dan buyuk ise "Ne buyuksun" yazin degilse "Normal Yazdirin
		 * ucu birbirine esit degilse ucgenin cevresini kontol ediniz
		 * Cevre 20 den kucukse "Ne kucuksun" yazdirin
		 * degilse "Normal" yazdirin
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" 3 kenar uzunlugu giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		
		String result =   (k1==k2 && k2==k3) ? (((k1+k2+k3)>30)?("Ne buyuksun"):("Normal")) :
			              (((k1+k2+k3)<20)?("Ne kucuksun"):("Normal")) ;
		
		System.out.println(result);
		
		scan.close();
	}

}
