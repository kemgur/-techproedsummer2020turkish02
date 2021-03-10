package day23daytime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date01 {

	/*
	 1) Anlik tarihi almak	
	 2) Tarihi ilerletmeyi ve geriletmeyi ogrenecegiz
	 3) Tarihi farkli formatta yazmak
	 4) Tarihler uzerinde ayarlamalar yapabilmemiz icin java bir class olusturmus.
	 Bu classin adi: LocalDate 
	 */
	public static void main(String[] args) {
		
		//Burda sifirdan oble uretmiyoruz bu yuzden new kullanmiyoruz.. Java nin hazirladigi
		// hazir methodu kullaniyoruz.
		LocalDate ld = LocalDate.now();// now() methodu su anki tarihi verir.
		System.out.println(ld);//2021-02-08
		
		//275 gun sonrasinin tarihini ekrana nasil yazdirilir.
		//ld.plusDays() ilerideki gunlerin tarihini almak icin bu methodu kullabliriz.
		System.out.println(ld.plusDays(275));//2021-11-10
		System.out.println(ld.plusMonths(3));//2021-05-08
		System.out.println(ld.plusYears(3));//2024-02-08
		
		//Gecmis tarihler ekrana nasil yazdirilir.
		System.out.println(ld.minusDays(34));//2021-01-05
		System.out.println(ld.minusMonths(6));//2020-08-08
		System.out.println(ld.minusYears(5));//2016-02-08
		
		//Tarihleri nasil farkli formatta yazdirabiliriz?
		//How can we write the dates in different formats?
		// Format degistirmek icin java farkli bir class olusturmus.
		//To change the format, java has created a different class.
		//bu classi hem tarih  hem de zaman icin kullanabiliriz
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dtf.format(ld));	//08/02/2021
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");//MMM' ayin ilk 3 harfini yazar
		System.out.println(dtf1.format(ld));//08/Feb/2021	
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");//MMMM ayin tamamini yazar
		System.out.println(dtf2.format(ld));//08/February/2021	
		System.out.println(dtf2.format(ld.plusMonths(6)));//08/August/2021
		//ofPattern(); methodu ile gun, ay ve yilin sirasini degistirebiliriz.
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MM/dd/yy");
		System.out.println(dtf3.format(ld));//02/08/21
		//format(); methodu ile ofPattern() ile yapilan degisiklik uygulanir.
		
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("MMMM/d/yyyy");
		System.out.println(dtf4.format(ld));
		// d==> 10'dan kucuk gunler icin rakam yazdirir. gun iki basamakli tarih ise de java sikinti cikarmaz yazdirir.
		

		
	}

}
