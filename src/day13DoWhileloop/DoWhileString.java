package day13DoWhileloop;

import java.util.Scanner;

public class DoWhileString {

	public static void main(String[] args) {
		
/*
 Kullanicidan passwordu alip, passwordun "AliCan" olup olmadigini kontrol eden,
 password'u dogru ise ekrana "Dogru, password yanlis ise ekrana 
 ""Yanlis" ve "Passwordunuzu girin" yazdiran programlari yaziniz
 */
		
		//A
		/*Scanner scan = new Scanner(System.in);
		
		String password ="";
		
		do {
			System.out.println("Passwordunuzu giriniz");
			password =scan.nextLine();
			
			if(password.equals("AliCan")) {
				System.out.println("Dogru");
				
			}else {
				System.out.println("Yanlis");
			}
			
			
		 }while(!password.equals("AliCan"));
		*/
		//*********************************************
		
		Scanner scan1 = new Scanner(System.in);
		
		String password1 ="";
		do {
			System.out.println("Passwordunuzu giriniz");
			password1 =scan1.nextLine();
		
			if(!(password1.equals("AliCan"))) {
				System.out.println("Yanlis");
				
			}
			
		}while(password1.equals("AliCan"));
		System.out.println("Dogru");
		
		scan1.close();
		
		
	}

}
