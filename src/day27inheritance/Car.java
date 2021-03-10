package day27inheritance;

public class Car extends Vehicle {

	/*
	  1) super() ile parentten constructor
	    cagirirken parametrelere dikkat etmeliyiz
	    
	   2)Parent class'da olmayan bir contsructor'i super() ile cagirirsaniz 
	   CTE alirainiz
		
		this()==> class icerisindeki constructorlari parametrelere gore cagirmak icin kullanilir
		
		3) super() ve this() keywords ilk satirda yer almalidir
		ve sadece bir kez kullanilmalidir. Yoksa CTE verir.
		 
		 4) super() ve this() keywords ayni constructor'in icinde ayni zamanda var olamaz.
		 
		 5)Methodlar condtructor'a gore secilir. Contsructor hangi clastan uretildiyse once o class'a gider.
		  Aranan method, constructor'i kullanilan class'da
		  varsa o method kullanilir, yoksa ayni method parent'tan kullanilir.
		  
		  6) Method secerken constructor'lara bakin, variable secerken data type'larina bakin.
	 */
	
	public Car() {
		super(2);//Vehicle
		//super() bizi parent class'a yonlendirir.Once parent classtaki ciktilari aliriz.
		System.out.println("Car");//Car
	}
	
	public Car (String name) {
		this();//Bu classtaki parametresiz constructor'a git.
		System.out.println("Car");
	}
	
	public static void main(String[] args) {
		Car car = new Car("Honda"); 
		
//		Console: 
//		Vehicle
//		Car
//		Car

	}

}
 