package day03variables;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);// Scanner: class   scan: obje => Bir clastan olusturan objedir.
		System.out.println("Tam isminizi giriniz"); //Obje olusturulurken new kullanilir. 
		String tamIsim = scan.nextLine(); //next => Kullanicinin girdigi ilk kelimeyi alir. nextLine kullanilmali
		
		System.out.println(tamIsim);
		
		
		scan.close();//scan kullandigimizda close ile kapatmayi unutmayalim.
		

	}

}
