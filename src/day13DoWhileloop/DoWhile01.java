package day13DoWhileloop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		
		// "while" ile "do-while" farki nedir?
				/*
				 1)while loop once sarti kontrol eder sonra kodu calistirir.
				   do-while loop ise once kodu calistirir sonra sarti kontrol eder.
				 2)Birinci maddeden dolayi do-while loop'da kodlar en az 1 kere calisir
				   fakat while loop'da kodlarin hic calismamasi da mumkundur.  
				*/
		int i=1;
		while(i<1){
			System.out.println(i);
			i++;
		}

		do {
			System.out.println(i);
			i++;
			 
		}while(i<0);
		
		/* 
		 Kullanicidan bir sayi alin
		 Bu sayi 10 dan buyuk ise ekrana "Kazandiniz" yazdirin
		 Sayi 10 veya 10 dan kucuk ise ekrana "Kaybettiniz" yazip tekrar sayi isteyin
		*/
		
		/*
		 Oyun gibi kod yazarken while icindeki sarti dongunun devam etme kosuluna gore 
		 ayarlayin.
		*/
		Scanner scan =new Scanner(System.in);
		//s variable'ina 10 dan buyuk her deger verilebilir.
		int  j =20;
		do {
			if(j<=10) {
				System.out.println("Kaybettiniz");
			}
			System.out.println("Bir sayi giriniz");
			 j=scan.nextInt();
		}while(j<=10);
		System.out.println("Kazandiniz");
		
		
		
		
		
		scan.close();
		
		
		
		
	}

}

