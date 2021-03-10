package day24accessmodifierstringbuilder;

public class Sb01 {

	/*
	 Gabage Collector(Cop toplayici): Belirli araliklarla Heap memoriyi kontrol eder. Hic kullanilmayacak String'leri siler.
	 String builder Class: String classi her degistirdigimizde java, yeni bir string olusturur 
	 Bu yuzden String'ler "immutable"(degistirilemez). Bu durumda birden cok String java da
	 yer kaplar. 
	 String builder ise bir stringde degisiklik yaptigimizda yeni bir string olusturmaz,
	  ayni string uzerinde degisikligi yapar. Bu duruma "mutable"(degistirilebilir) denir.
	  
	 */
	public static void main(String[] args) {
	
		//StringBuilder ile String olusturmak icin 3 farkli yol vardir.
		//1.Yol
		// Once bos obje olustururlur sonra ona String ekleyebiliriz.
		StringBuilder stb1 = new StringBuilder();
		stb1.append("Java");
		System.out.println(stb1);//Java

		stb1.append("Kolaydir");
		System.out.println(stb1);//JavaKolaydir

		//2.yol
		StringBuilder stb2 = new StringBuilder(5);
		//Ben bir String olusturacagim ve bu 5 karakterli olacak, demektir.
		//tc kimlik numaralari ve telefon numaralari icin String builder kullanabilir.
		stb2.append("Ali");//
		System.out.println(stb2);//Ali
		//5 karakterli dedim ama 3 karakterli gonderdim. Java bunu StringBuilder'da sorun etmez. 
		//Kalan 2 karakteri hemen siler.
		stb2.append("Kazandi");
		System.out.println(stb2);//AliKazandi
		//Basta ben 5 karakterli dedim ama 10 karakterli gonderdim.
		//StringBuilder bu durumu anlar ve sorun etmez, hemen Stringi 10 karaktere cikarir.
		
		//3.yol
		StringBuilder stb3 = new StringBuilder("Java");//Son kisim constructor'dir. Constructor'lar parametre kabul eder.
		//Olusturdugun String'i bastan soyluyorsunuz. Benim String'im "Java" dir,diye.
		//En yaygin kullanilan budur. 
		System.out.println(stb3);//Java
		
		/* Soru:
		 1) Bir String olusturun
		 2) Bu sitring'e ekleme yapin
		 3) Bu String'in belli bir bolumunu yazdirin.
		 */
		StringBuilder stb4 = new StringBuilder("Ankara'nin");
		stb4.append(" Baglari");
		System.out.println(stb4);//Ankaranin Baglari
		System.out.println(stb4.substring(2, 18));//kara'nin Baglari
		//Ayni satirda birden cok append kullanabiliriz.
		stb4.append(" buklum").append(" buklum").append(" yollari");//Ankara'nin Baglari buklum buklum yollari
		System.out.println(stb4);// Bu duruma Method Chain (method zinciri)denir
		
		
		System.out.println(stb4.charAt(3));//a => 3.indexteki harfi verir.
		System.out.println(stb4.delete(2, 4));//Anra'nin Baglari buklum buklum yollari
		//delete(), methodu sadece StringBuilder() clasinda vardir
		
		//stb4.getClass(); methodu hangi stb4 objesinin hangi class'tan olusturuldugunu gosterir.
		//stb4 objesini StringBuilder clasindan olusturdugumuz icin consolda 
		//StringBuilder kutuphanesini verir.
		System.out.println(stb4.getClass());//class java.lang.StringBuilder

		//indexOf() methodu, String'de aradiginiz kelimenin ilk harfini bulur ve 
		//onun ilk indexini consola yazdirir.
		System.out.println(stb4);
		System.out.println(stb4.indexOf("Bag"));//9
		
		//insert(), methodu araya bir karakter yerlestirmemizi saglar.
		stb4.insert(4, ",");
		System.out.println(stb4);//Anra,'nin Baglari buklum buklum yollari
		 
		stb4.lastIndexOf("a");//a'nin son gorumunu bulup, indexini ekrana yazdirir.
		System.out.println(stb4.lastIndexOf("a"));//36
		
		//length(), methodu stringin uzunlugunu verir.
		System.out.println(stb4.length());//39
		
		//replace(), methodu string'teki char ve kilemeleri indexine gore degistirir.
		System.out.println(stb4.replace(10, 20, "Kemal"));//Anra,'nin Kemalklum buklum yollari
		//delete te yapmis oluyoruz.
		
		//reverse(), methodu bir stringi tersten yazdirmamizi saglar.
		System.out.println(stb4);//Anra,'nin Kemalklum buklum yollari
		System.out.println(stb4.reverse());//iralloy mulkub mulklameK nin',arnA
		
		//for loop ile tekrar terseten yazdirabiliriz.
		String s = "";
		for (int i = stb4.length()-1; i >=0 ; i--) {
			s= s+ stb4.charAt(i);
			
		}
		System.out.println(s);//Anra,'nin Kemalklum buklum yollari
		
		//Javada set(), update etmek, degistirmek anlamina gelir.
		//setCharAt(), methodu indexi verilen char'lari degistirir.
		stb4.setCharAt(6, 'X');// index 6'daki karakteri degistir, dedik
		System.out.println(stb4);//iralloX mulkub mulklameK nin',arnA
		
		
		//capacity() ve length() Farki
		StringBuilder stb5 = new StringBuilder(9);//capasite: 9
		stb5.append("Java");//
		/*
		 capacity() ve length() Farki
		 1) Belirlenen kapasiteyi gecerseniz kapasite belirlenen kapasitenin 
		 2 katinin 2 fazlasi olabilir.Belirlenen kapasitenin 2 katinin 2 fazlasinida 
		 gecerseniz , java kapasite ile length'i birbirine esitler.
		 */
		System.out.println(stb5.capacity());//9
		System.out.println(stb5.length());//4
	
		//Onemli Not:
		StringBuilder stb6 = new StringBuilder("Java Kolaydir");
		stb6.append("X");
		System.out.println(stb6);//Java KolaydirX
		
		//substring(); string classinin methodudur,bu yuzden StringBuilder'i update edemez.
		stb6.substring(8);
		System.out.println(stb6);//Java KolaydirX 
		
		
		
		
	}

}
