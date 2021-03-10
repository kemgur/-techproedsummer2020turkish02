package day15contructors;

public class Araba {

	int yil= 2019;
	String marka = "Toyota";
	String model = "Rav4";
	int fiyat = 20000;
	
	Araba(){// Default Consntructor
		
	}
	Araba(String model,int fiyat){  // Parametreli Consntructor
		this.model = model;
		this.fiyat = fiyat;	 
	}
	Araba(String marka,String model,int fiyat){
		this.marka = marka;
		this.model = model;
		this.fiyat = fiyat;
	}
	public static void main(String[] args) {
	
		Araba a1 = new Araba();// Default Consntructordan uretilen obje
		
		System.out.println("Fiyat: "+a1.fiyat);//Fiyat: 20000
		System.out.println("Marka: "+a1.marka);//Marka: Toyota
		System.out.println("Model: "+a1.model);//Model: Rav4
		System.out.println("Yil: "+a1.yil);//Yil: 2019
		a1.hizlanma(7);
		a1.tuketim();
		
		System.out.println("======================================");
		 
		Araba a2 = new Araba("Corolla", 12000);
		System.out.println("Fiyat: "+a2.fiyat);//Fiyat: 12000
		System.out.println("Marka: "+a2.marka);//Marka: Toyota
		System.out.println("Model: "+a2.model);//Model: Corolla
		System.out.println("Yil: "+a2.yil);//Yil: 2019
		a2.hizlanma(5);
		a2.tuketim();
		
		System.out.println("======================================");
		//Arabanin fiyatini , marka ve modelini degisitirebilen
		//bir cosntructor uretiniz
		Araba a3 = new Araba("Honda", "Civic", 10000);
		
		System.out.println("Fiyat: "+a3.fiyat);//Fiyat: 12000
		System.out.println("Marka: "+a3.marka);//Marka: Toyota
		System.out.println("Model: "+a3.model);//Model: Corolla
		System.out.println("Yil: "+a3.yil);//Yil: 2019
		a3.hizlanma(3);
		a3.tuketim();
		

	}
	public void hizlanma(int i) {
		System.out.println(i +" sn'de 100km/sa ulasir");
	}
	public void tuketim() {
		System.out.println("km'de 0.1 do lar yakar");
		
	}
	

}
