package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan yasini alin
		 Yas 13 ten az ise ekarana calisamaz yazdirin
		 yasi 13 ile 65 arasinda ise Calisabilir yazdirin
		 Yasi 65 ustu ise ekrana "Emekli" yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasinizi giriniz");
		int yas = scan.nextInt();
		
		if(yas<0) {
			System.out.println("Yas negative olamaz");
			
		}else if(yas<13) {
			System.out.println("Calisamaz");
			
		}else if(yas<65){
			System.out.println("Calisabilir");
			
		}else if(yas>=66) {
			System.out.println("Emekli");
			
		}
		
		scan.close();
	}

}
