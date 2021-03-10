package day32interface;

public interface Car {
	
	/*
	 1) Interface class degildir, interface interface'dir.
	 2) Abstract clas'larin icine conrete method'lar koyabilirdik
	 ama interface'lerin icine (bazi ozel durumlar haric) conrete
	 method koyamayiz. Yani; interface'ler sadece abtract method icerebilir
	 Bu yuzden interface kullanimi" full abstraction" olarak adlandirilir.
	 Abstrac class kullanimina "partial abstraction" denir.
	 
	 3) Interface 'in icine yapilmasi zorunlu olan seyleri koyariz.
	 
	 4) Intierface 'ler iclerindeki methodlari default olarak "abstract" 
	 kabul ederler. Bu yuzden method olustururken abstract keyword kullanmak
	 istege baglidir.
	 Asagidaki motor() methodunda abstract keyword kullanmadik problem olmadi
	 direksiyon() methodunda abstract keyword kullandik yine problem olmadi.
	 
	 5) Interface icine concrete method koyarsaniz CTE verir.
	 
	 6) Interface'teki methodlar default olarak "public" olurlar.
	 
	 7)Interface'teki variable'lerin access modifier'lari default olarak "static" olurlar.
	 
	 8) interface 'lerden obje uretilmez.
	 
	 9) interface'lerde variable olusturdugumuzda mutlaka deger atamasi yapilmalidir(asagment)(initialize)
	 
	 */
	        int i =12; //final variable.
			public final static int i1 = 12;
			//int i =12; == public final static int i = 12;

	public void engine();//interface 'in icerisindeki tum methodlar abstract oldugu icin methodun basina abstract yazilmaz.
	                     // Yazarsakta sorun cikarmaz. Default olarak "abstract" kabul eder.
	public abstract void wheel ();
	
	//teker() hem public'dir hem de abstract'tir.
	//void teker(); = public void teker(); == abstract void teker(); == public abstract void teker();
	void teker();
	
	void fiyat();
	
	
	
	
}
