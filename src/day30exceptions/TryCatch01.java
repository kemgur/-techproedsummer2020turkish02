package day30exceptions;

public class TryCatch01 {

	/*
	 1) Bir kez "try" kullandigimizda alt kisimda birden cok "catch" kullanabiliriz
	 2) Yukaridaki "catch" her zaman alttaki "catch"in child'e olmalidir.
	 3) "catch" den sonra  finally{} block yazabiliriz. finally{} block her zaman calisir.
	 4) finally{} block try/catch'den sonra yazilmalidir, icine yazilmaz.
	 4) trc/catch calissada calismasada finally{} block her zaman calisir.
	 */
	

	/*INTERVIEW SORUSU
	 finally{} block her zaman calisir. 
	 final, finally ve finalize keyword'lerinin farki nedir. 
	 
	 1) finally{}(block) ==> try-catch block'tan sonra kullanilir
	 				  Exception olsada olmasa da calisir.
	 				  
	 2) final (keyword)    ==> Variable'larda final kullanilirsa, o variable'in degeri degistirilmez.
	                  Mesela pi sayisi, final pi sayisi yapildigi zaman degeri degistirilemez.
	                  orn: final String code: "pos" 
	                  
	                  Method'larda final  kullanilirsa, method bodyleri degistirilemez,
	                  dolayisiyla o method overriding yapilamaz.
	                  
	                  Class'larda final kullanilirsa, o class extends edilemez, 
	                  Inhertence mumkun degildir.
	                  public final class Animal{} ==> public class dog extends Animal{} OLMAZ.
	                  Final class'a child class extends edilemez ama final class birinin cocugu olabilir.
	                  
	3) finalize()(method)==> finalize() methodu, garbage collector'in imha edecegi datalari imha edilecek hale getirir.
	                  (Odadaki coplerin toplanip cop posetine konmasidir. Garbage Collector o copu siler) 
	                  	
	                  	garbage collector surekli calisir. Bir variable garbage collector tarafindan silinmeden once 
		                finalize edilmesi lazimdir. finalize edilmeden garbage collector hic bir seyi silmez.
		                   			  
		 */
	 
	public static void main(String[] args) {
	
		
 int num1 = 12;
 int num2 = 0;
 
 try {
    System.out.println(num1/num2);

    }catch(ArithmeticException e) {
    	
    	System.out.println("Sifir ile bolme yapilmaz");
    }
 
	}

}
