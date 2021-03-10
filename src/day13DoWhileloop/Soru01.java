package day13DoWhileloop;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan baslangic ve bitis degerlerini alin 
		 * ve baslangic degerinden baslayip bitis degerinde biten tum 
		 * tamsayilarin carpimini ekrana yazdirin
		 */
		//Enter start and end values
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start and end values");
		int s1 = scan.nextInt();
		int b1 = scan.nextInt();
		
		int product =1;
		while(s1<=b1) {
			product = product*s1;
			s1++;
			
		}
		System.out.println(product);
		
		scan.close();
		
	}

}
