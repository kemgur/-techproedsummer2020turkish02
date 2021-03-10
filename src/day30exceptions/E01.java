package day30exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E01 {

	/*exception: Istisnayi hatalardir.
	 * Temelde iki tur exception vardir. Compile Time and Run time exception
	 * Checked Exception == Compile time excepsion: Bu tarz exceptionlar mutlaka handle edilmelidir.
	 (Lastigi patlayan araba ile yola devam edilemez. Gidecegimiz yere gecte kalmis olsak mutlaka tamir etmeliyiz.)
	 
	 1) FileNotFoundException(Dosya bulunamadi hatasi):Dosya bulunamadigi zaman bu hata olusur.
	    // Thrown when code tries to reference a file that does not exist.
	     Kod, var olmayan bir dosyaya başvurmaya çalıştığında atılır.
	     
	 2) IOException(input:iceri - output: disari)
	    // Thrown when there's a problem reading or writing a file.
	     (Bir dosyayı okurken veya yazarken bir sorun olduğunda atılır.)
	     
	*** They must be handled or declared.(Ele alınmalı veya beyan edilmelidir.)
	*** Keep in mind that FileNotfoundException is a subclass of IOException
        (FileNotfoundException'ın IOException'ın bir alt sınıfı olduğunu unutmayın.)
             
	 3) try-catch blocks=> okunakli bir hata turudur. 
	    "try-catch blocks" is better, because:
	    1) It is more readable.
	    2) it gives message to user after running.(Calıştırdıktan sonra kullanıcıya mesaj verir.)
	 
	 Checked Exceptionlar iki turlu handle edilir:
	 1) Method isminden sonra "throws" keyword kullanilir.
	 2) try-catch block kullanilir. Bu kod cok kullanislidir cunku readable'dir.
	 
	 
	 
	 Kod yazarken kirmizi alt cizgi almadigimiz halde
	  kodu calistirdiktan sonra konsolda  kirmizi  mesaj
	  alirsak buna "Run Time Exception" denir.
	 a)  AritmaticException bir Run Time Exeption'dir.
	  Bir sayiyi 0 a bolmek iyi bir ornektir
	  
	 b) null atanmis bir String'in length'ini bulmak isterseniz
	   NullPointerException alirsiniz
	  
	 */
	public static void main(String[] args) throws FileNotFoundException {
	
		
			FileInputStream file = new FileInputStream("C/ogrenci.txt");
	
		
		
		
		

	}

}
