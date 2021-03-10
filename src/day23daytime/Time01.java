package day23daytime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time01 {

	public static void main(String[] args) {
		// Java time icin bir class olusturmus. Ismi LocalTime.
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);//17:33:46.023 en sondaki nanosecond'tur.
		
		//Zamanda ileri nasil gidilir?
		//How to go forward in time?
		System.out.println(lt.plusMinutes(10));//17:45:55.616
		System.out.println(lt.plusHours(6));//21:24:58.005
		//plusHours(); methodu zamani saat olarak ileri goturur.
		
		//Zamanda nasil geri gidilir
		System.out.println(lt.minusSeconds(100));//saniye olarak geri gider.
		
		//Time formati nasil degistirilir
			DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm");
			System.out.println(dtf1.format(lt));
				//"hh"  12 saatlik sistemi kullanir
				//"HH" 24 saatlik saat kullanilr.
				
			//Farkli ulkelerdeki yerel saati nasil yazdirabilirim
				System.out.println(LocalTime.now(ZoneId.of("Turkey")));//01:44:57.803
				System.out.println(LocalTime.now(ZoneId.of("Japan")));//07:46:08.562
				System.out.println(LocalTime.now(ZoneId.of("Europe/Moscow")));//01:46:08.562
	}

}
