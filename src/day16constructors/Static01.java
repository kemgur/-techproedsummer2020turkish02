package day16constructors;

public class Static01 {

	String isim = "Ali Can";
	static int yas;
	
	public static void main(String[] args) {
		
		Static01 obj = new Static01();
		System.out.println(obj.isim);//Ali Can //yapilan islem dogru. Static olmayan variable obje uzerinden cagrilmistir.
		System.out.println(obj.yas);//0 // sari alt cizgi hatasi alinir. Java bu drumdan hoslanmaz. 
		//Cunku yas zaten static bir variabledir. Static variable obje uzerinden cagrilarak yol uzatilmis. Mantik hatasi yapilmistir.
		//Ama kod calisir hata vermez.
		System.out.println(yas);//0 boyle yapmak javanin hosuna gider.

		
	}

}
