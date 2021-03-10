package day24accessmodifierstringbuilder;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name");

		String day = scan.next();

		char ch1 = day.charAt(1);
		char ch2 = day.charAt(3);
		System.out.println("" + ch1 + ch2); 
		System.out.println(ch1 + ch2); 
		
scan.close();
	}

}
