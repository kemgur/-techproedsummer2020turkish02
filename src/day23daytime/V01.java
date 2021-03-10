package day23daytime;

public class V01 {

	  /*
    Varargs : (Variable Arguments) Varargs normalde bir array'dir. Ama uzunlugu kullanicinin
              girdigi deger sayisina gore buyur.
              
              Not: Varargs dipsiz bir kuyu gibidir icine ne atarsaniz sonsuza kadar kabul eder.
              
              1)Varargs'dan sonra baska parametre kullanilamaz.Varargs method parantezi 
                icerisinde her zaman en son parametre olmalidir.
              2)Varargs sonda olduktan sonra Varargs'in oncesinde Varargs olmayan parametreler 
                kullanilabilir.
              3)Bir method parantezinin icinde sadece bir tane varargs kullanabilirsiniz.    
              
              4) varargs bir arraydir ve bos olabilir. 
                         
    */
	public static void main(String[] args) {
		
		add(3,5);//8
		add(3, 5, 7);//15
		add(3,5,7,8,9,11,13);//56
		product(2,3);//6

	}
	
//	public static void add(int s1, int s2) {// Toplama methodu
//		System.out.println(s1 + s2);
//	}
//
//	public static void add(int s1, int s2 ,int s3) {// Toplama methodu
//		System.out.println(s1 + s2 +s3);
//	}
	//Asagida olusturulan varargs methodu sayesinde yukaridaki methodlar calismadan
	//her turlu toplama islemi varargs methodu sayesinde yapilabilir.
	
	 public static void add(int...x) {// ...(uc nokta) varargs methodu ildugunu gosterir.
		 int sum = 0;
		 for(int w: x) {
			 sum=sum + w;
			 
		 }
		 System.out.println(sum);
	 }
		 // Tum methodlar acikken oncelikle ustteki methodlar calisir. Cunlu data type lar tamamen uyuyor.
		 
		 //Ne kadar sayi girirlirse girilsin ekrana carpimini yazdirin
		 public static void product(int... y) {//varang ta uc nokta data typeden sonra yazilir.once yazilirsa hatadir 
		        int product = 1;
		        for(int w : y) {
		            product = product * w;
		        }
		        System.out.println(product);
		    }
		 //varang ta uc nokta data typeden sonra yazilir.once yazilirsa hatadir 
		 //varargs'dan sonra baska parametre kabul etmez.
		 
		 
	 }
//Homework: Kelimenin harflerini alip onlari giris sirasina gore birlestirerek ekrana basan 
//          bir program yaziniz. Varargs kullanmalisiniz. 
	  


