package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		

		if(5>4) {
			System.out.println("Ali");//Ali
		}
		/*
		 Kullanicidan bir sayi alin bu sayi 3 'e bolunuyorsa 3'un kati yazdirin
		 #'e bolunmuyorsa ektana "3'e bolunmuyor yazdirin
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int s =scan.nextInt();
		
		if(s%3==0) {
			System.out.println("3'un kati");
			
		}
		if(s%3!=0) {
			System.out.println("3'un kati degil");
			
			
		}
	
	scan.close();
	
	}

}
