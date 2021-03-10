package day06ifstatementdt;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int num = scan.nextInt();
		
		if(num>=10 && num<=99) {
			System.out.println("Iki basamakli");
			
		}else {
			System.out.println("Iki basamakli degil");
		}
		
scan.close();
	}

}
