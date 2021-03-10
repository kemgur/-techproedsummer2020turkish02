package day13DoWhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin
		 Sayi cift sayi ise ekrana "Kazandiniz" yazdirin
		 Sayi tek sayi ise ekrana "Kaybettiniz" yazdirin ve yeni bir sayi isteyin
		 */
		

		Scanner scan = new Scanner(System.in);
		
		int i =12;
		
		do{
			if(i%2!=0) {
			System.out.println("Kaybettiniz");	
		    }
			
		    System.out.println("Bir sayi giriniz");
		    i =scan.nextInt();
		   
	    }while(i%2!=0);
		System.out.println("Kazandiniz");
		

		scan.close();
	}

}
