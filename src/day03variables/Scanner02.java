package day03variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		//1) Kullanicidan tam ismini alin
		//2) Kullanicidan yasini alin
		//3) Kullanicidan isminin ilk harfini alin
		//4) Kullanicinin cocuk sayisini byte ile aliniz
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Isminizi giriniz");
		String tamIsim = scan.nextLine();
		System.out.println(tamIsim);
		
		System.out.println("Yasinizi giriniz");
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("isminizin ilk harfini giriniz");
		char ilkHarf = scan.next().charAt(0);
		System.out.println(ilkHarf);
		
		System.out.println("Lutfen cocuk sayisini giriniz");
		byte cocukSayisi = scan.nextByte();
		System.out.println(cocukSayisi);
		
		scan.close();
		

	}

}
