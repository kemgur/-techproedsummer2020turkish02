package day26passbyvalueinheritance;

public class PassByValue {////Degere gore gecmek, degeri gecir

	/*INTERVIEV'lerde sorulur
	  
	 * Java bir methoda bir variable'a ait degeri yollarken, 
	 o degerin kopyasini olusturur ve kopyayi methoda yollar.
	 * Method kendisine yollanan degeri degistirirken kopya degeri
	  degistirmis olur
	 * Java bu sayede variable'a ait orjinal korumus olur
	  
	 * Methodlar hep kopya ile calisir.Orjinale dokunmaz
	  
	  *Java pass by value kullanir ama pass by referans kullanmaz
	 */
	
	/* 
	Pass By Reference: Pass by refernece'da reference kopyalanip methoda yollanir ama orjinal
	 reference da kopya reference da ayni obje'yi gosterdiginden orjinal obje degismis olur. 
	(ONEMLI) Java orjinal objenin degismesini istemediginden pass by reference kullanmaz.
	 Primitivelerde de non-primitive'lerde de pass by value kullanir. 
	 */
	
	public static void main(String[] args) {
		int gomlek =100;
		
		indOgr(gomlek);//
		
		System.out.println(gomlek);//100
		System.out.println(indOgr(gomlek));//80
		System.out.println(askOgr(gomlek));//95

		String hazine = "Altin";
		hazineCal(hazine);
		System.out.println(hazine);
		System.out.println(hazineCal(hazine));
	}

	public static int indOgr(int gomlek) {//methodlar hep kopya ile calisir orjinal degere dokunmaz.
		
		return gomlek -20;//gomlek'in kopyasi
	}
	
	public static int askOgr(int gomlek) {
		 
		return gomlek -5;////gomlek'in kopyasi
	
}
	public static String hazineCal(String hazine) {
		return hazine +" calindi";
	}
	
	
	
}