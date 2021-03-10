package day31abstraction;

public abstract class Otel {


	/*
	 1) abstract class'i final yapamayiz, cunku final class'larin child classlari olamaz.
	 Halbuki biz abstract class'lari child classlari olsun ve child class'lari bazi seyleri 
	 yapmaya mecbur biraksinlar diye olusturuyoruz.
	 Bu celiskiden dolayi java, abstract classlarin final olmasina izin vermez, CTE verir.
	 
	 2) abstract methodlarda final olamaz. Cunku final olurlarsa override edilemezler,
	  halbuki biz abstract methodlari override yapmak icin olusturuyoruz.
	  
	  3) abstract methodlar da private olamazlar. Cunku private olurlarsa override edilemezler,
	  halbuki biz abstract  methodlari override yapmak icin olustururuz. 
	  
	  4) abstract methodlar static olamazlar.
	  
	  5) abstrac classlardan obje uretilemez.
	 */
	 
		/*
		 1) Bir otelde tek kisilik , aile ve kral odasi var.
		 2) Butun odalarda kahvalti servisi olmali
		 3) Kral dairesinde cay servisi olmali, diger odalarda istege bagli olmali
		 4) Wifi servisi tum odalarda istege bagli olmali
		 5) Aile odasina ek yatak konmali, diger odalarda olmamali.
		 */

	/*
	 1) Ortak olan methodlari parent'a koyun.
	 2) Ortak olan methodlardan mecbur olanlari parent'ta absract yapin.
	 3) Ortak olan methodlardan istege bagli olanlari concrete method yapin.
	 4) Ortak olmayan methodlari asla parente koymayin.
	 
	 */
	
	
	public abstract void kahvalti(); 
	
	
	public void cay() {
		System.out.println("7/24 cay servisi");
	}
	
	
	public void wifi() {
		System.out.println("7/24 wifi servisi");
	}
	
	
}
