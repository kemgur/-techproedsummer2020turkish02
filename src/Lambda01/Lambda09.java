 package Lambda01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda09 {

	/*
	 1.Husus"
	 1) Files{} classi text dosyalarini okumamizi saglar.
	 2) Files clasindaki lines() methodu  Paths{} classina gider
	 3) Path classindaki get() methodunu kullanarak file textine gider ve giris yapar/
	 4) lines() methodu file'a giris yaptiktan sonra her bir line' i aliyor ve stream haline getiriyor
	 5) forEach() methodu stream'den her bir satiri birer birer alip ekrana yazdiriyor.
	 
	 2.Husus:
	   1)lines() methodundan alinan satirlar map() methodu kullanilarak update edilebilir.
	   2) map() methodundaki String:: methodu kullanilarak buyuk harfe cevirdik 
	 */
	public static void main(String[] args) throws IOException {
		
		//FileForLambda dosyasini okuyunuz. (Consolaya yazdirin)
		//forEach() methodu Pagesin icerisindeki file dosyasini bulup yazdirdi.
		Files.lines(Paths.get("src/Lambda01/FileForLambda")).forEach(System.out::println);
		
		
		//FileForLambda dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle yazdiriniz)
		Files.lines(Paths.get("src/Lambda01/FileForLambda")).map(String::toUpperCase).forEach(System.out::println);
		
		
		//FileForLambda dosyasindaki ilk satiri kucuk harflerle okuyunuz.(Console'a kucuk harflerle yazdiriniz)
		//1.Yol
		Files.lines(Paths.get("src/Lambda01/FileForLambda")).limit(1).map(String::toLowerCase).forEach(System.out::println);
		//Burda limit() methodunu kullanarak sadece 1. satiri ekrana yazdirabiliriz.
		//map() methodunun icerisindeki String:: methodunu kullanarak ekrarana yazdirabiliriz.

		//2.Yol
		System.out.println(Files.lines(Paths.get("src/Lambda01/FileForLambda")).findFirst());
		// Ilk cumleyi yazdirmamk icin java tarafindan olusturulmus bir method var. findFirst() methodu
		//limit() methoduyla birden cok cumle alabiliriz fakat findeDirst() ile sadece bir cumleyi alabiliriz.
		
		//FileForLambda dosyasinda "Lambda" kelimesinin kac satirda gectigini ekrana yazdiran programi yaziniz
		System.out.println(Files.lines(Paths.get("src/Lambda01/FileForLambda")).filter(t->t.contains("Lambda")).count());//2
		
		
		
		//FileForLambda dosyasinda tum farkli kelimeleri bir listin icinde ekrana yazdiriniz
		System.out.println(Files.
				lines(Paths.get("src/Lambda01/FileForLambda")).
				//lines() methodu ile java stream seklinde 5 satiri bize verir.
				map(t->t.split(" ")).
				//split() methodu kelimelerine ayirir.Split() methodu calistiginda Array uretir.
				flatMap(Arrays::stream).//stream dondurur.
				//flatMap() Array'lerdik tum kelilemeleri birer birer stream seklinde dizer.
				distinct().
				//distinct() methodu tekrarli olanlari bir kez alir.
				collect(Collectors.toList()));
				// map() methodindaki split() methoduna ihtiyacimiz olacak. 		
	
			//FileForLambda dosyasindaki tum kelimeleri natural order olarak yazdiriniz.
		Files.
				lines(Paths.get("src/Lambda01/FileForLambda")).
				map(t->t.split(" ")).
				flatMap(Arrays::stream).
				sorted().
				forEach(System.out::println);
				//map() methodu kelimeleri almamizi saglar.
				//flatMap() methodu split ile kelimelere ayrilmis her bir aemani tek tek ceker.
	
	
		//ODEV:
		//FileForLambda dosyasinda "Lambda" kelimesinin kac kere gectigini buyuk harf kucuk harf onemsemeden 
		//ekrana yazdiran programi yaziniz
		System.out.println(Files.lines(Paths.get("src/Lambda01/FileForLambda")).
				map(t->t.toLowerCase().split(" ")).
				//split() array return eder. Line lari kelimelere cevirir.
				flatMap(Arrays::stream).
				filter(t->t.equals("lambda")).count());//11

		
		//FileForLambda dosyasinda icinde m harfi gecen kelimelerin sayilarini ekrana yazdiran bir program yaziniz.
		System.out.println(Files.lines(Paths.get("src/Lambda01/FileForLambda")).
				map(t->t.split(" ")).
				flatMap(Arrays::stream).
				filter(t->t.contains("m")).
				count());
		
		
		//FileForLambda dosyasinda kac farkli harf kullanildigini gosteren program yaziniz. 
		System.out.println(Files.
		lines(Paths.get("src/Lambda01/FileForLambda")).
		map(t->t.replaceAll("\\W", "").split("")).
		flatMap(Arrays::stream).
		distinct().//Ayni olanlarin sadece birini alir.
		count());//24
		
		
		//FileForLambda dosyasinda kac farkli kelime kullanildigini gosteren program yaziniz. 
		System.out.println(Files.
		lines(Paths.get("src/Lambda01/FileForLambda")).
		map(t->t.replaceAll("[.!?,\\-]", "").split(" ")).
		flatMap(Arrays::stream).
		distinct().
		count());//5
		//Bu kelimeleri yazdirmak icin forEach() methodu kullanmaliyiz.
		Files.
				lines(Paths.get("src/Lambda01/FileForLambda")).
				map(t->t.replaceAll("[.!?,\\-]", "").replaceAll(".", "").split(" ")).
				flatMap(Arrays::stream).
				distinct().
				forEach(System.out::println);
		
	}

	

}
