package day04Scanner;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Herhangi bir karacter giriniz");
		char ch = scan.next().charAt(0);
		
		System.out.println("  "+ ch +"  ");
		System.out.println(" " + ch + " " + ch + " ");
		System.out.println(ch + " " + ch + " " + ch);
		
		scan.close();
	}

}
