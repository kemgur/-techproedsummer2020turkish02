package day32interface;

public interface Klima {

	int i =15;
	
	void isitma();// public void isitma();
	
	void antiBakteri();
	
	void fiyat();
	
	/*
	 1) interface icinde  body'si olan bir method uretmek isterseniz 
	 *  ya "default" veya "static" keywordlardan birini kullanmaniz gerekir.
	 
	 2) "default" veya "static"keyword'lardan birini kullanirsaniz mutlaka method 
	 body'si kullanmaniz gerekir aksi halde CTE aliriz.
	 	public static void fresh();==> olmaz
	 	public default void fresh(); ==> olmaz
	 	
	 3)	"default" veya "static"keyword'lardan birini kullanarak olusrutudugunuz 
	 body'li methodlari child class'larin override etme zorunlulugu yoktur. Cunku onlar concrite method'tur.
	 
	 */
	public static void sogutma() {
		 System.out.println("Iyi sogutur");	 
	 }
	 public default void fresh() {
		 System.out.println("temiz hava");
	 }
	 /*
	   "default" veya "static" kullandigimizda mutlaka method body'si kullanmaliyiz. 
	   Aksi hande CTE aliriz
	  */
}
