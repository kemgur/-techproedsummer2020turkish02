package day32interface;

public class Honda implements Car , Klima { //Bir class'i bir interface'in child'i yapmak icin "extends" yerine "implements" keyword'u kullanilir.
								   // implements: uygulamak, yapmak, saglamak anlamina gelir.


	/*
	 1)Bir class'i bir interface'in child'i yapmak icin "implements" keyword kullaniriz.
	 
	 2)Abstract class kullanarak abstraction yaparsak bir class'a 1'den fazla parent
	   koyamayiz cunku Java multiple inheritance'a musaade etmez. Bu yuzden interface
	   kullaniriz ve bir class icin 1'den fazla parent olusturarak calisabiliriz. 
	  
	 3) 1'den fazla interface'i  bir class icin parent yaptiginizda, 
	    parent olan interface'lerde ayni isimli method'lari kullanabilirsiniz
	    ama ayni isimli parentlerin return type'lari ayni olmak zorundadir. 
	    Ayni olmazsa CTE alirsiniz.
	      
	  4)1'den fazla interface'i  bir class icin parent yaptiginizda, 
	     parent olan interface'lerde ayni isimli variable'lar kullanabiliriz. 
	     Ancak, hangi variable'i kullanacagimiza interface ismini yazarak biz karar vermeliyiz.
	     Aksi takdirde Java hangisini kullanacagina karar veremez, bu yuzden CTE alirsiniz.
	 */
	
	public static void main(String[] args) {
		
		Honda honda = new Honda();
		honda.antiBakteri();
		honda.isitma();
		honda.wheel();
		honda.teker();
		honda.engine();
		System.out.println(Klima.i);//honda.i bu sekilde de cagirabiliriz ama "i" static oldugu icin sadece "i" seklindede yazabiliriz
		//i Car interface'inde olusturuldu.
		

	}

	@Override
	public void engine() {
		System.out.println("1.6 VTEC Diesel");
		
	}

	@Override
	public void wheel() {
		System.out.println("suni deri");
		
	}

	@Override
	public void teker() {
		System.out.println("16 inch alasim");
		
	}

	@Override
	public void isitma() {
		System.out.println("Isitma var");
		
	}

	@Override
	public void antiBakteri() {
		System.out.println("99% bakteri koruma");
		
	}

	@Override
	public void fiyat() {
		System.out.println("Ozellige gore degisir");
		
	}

}
