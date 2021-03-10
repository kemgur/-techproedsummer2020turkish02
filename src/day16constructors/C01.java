 package day16constructors;

public class C01 {

	int i = 12; // (gorunum)instance(obje) variable
	//instance variable uretilen her objede yer alacagi icin daha cok yer kaplar.
	
	static int k = 13;//static(clas) variable. Bir variable static ise klasa asilmis demektir.
	//Static variable, her objenin kullanabilecegi ortak variable'dir.(Gokteki ay gibi, herkes gorebilir)
	//Static variable ne zaman kullaniriz?
	//Her degisikligi herkes gorsun istersek o zaman static variable kullanabiriz
	//Sabika kaydi, isim degisiklikleri, vb.  
	public static void main(String[] args) {
		
		C01 obj1 = new C01();
		obj1.i=20;
		System.out.println(obj1.i);
		obj1.k=30;
		System.out.println(obj1.k);//30
		
		C01 obj2 =  new C01();
		System.out.println(obj2.i);
		System.out.println(obj2.k);//30 obj1'den k'yi degistirdim obj2 de de degisti. 
		//Staticler bu sekuldedir
		
		/*
		 1)static variable'lar class'lara aittir ve diger adi 
		 class variable'dir.Instance variable'lar object'lere
		 aittir ve diger adi object variable'dir
		 
		 2)static variable'lardaki degisiklikler kim tarafindan
		 yapilirsa yapilsin butun object'ler tarafindan gorulur.
		 Instance variable'larda ise degisiklikler sadece o instance variable
		 hangi object'e ait ise onun tarafindan gorulur.
		 
		 3)static variable'lar class'lar olusturulurken Java tarafindan olusturulur
		 Instance variable'lar ise object'ler olusturulurken olusturulur.
		 
		 4)1 class, class icinde 1 tane static ve 1 tane de instance variable var.
		 Bu class'dan 10 object olusturulursa 1 tane static variable ve 10 tane 
		 instance variable uretilmis demektir. 	 
		 
		 5) Static variable'lara baska claslardan Class ismi kullanilarak ulasilabilir,
		 fakat intance variablelara baska claslardan ulasabilmek icin Object olusturmak gerekir.
		 
		 6) Static olmayan variable veya methodlar static methodlar icersinde kullanilamazlar.
		 Ama static olmayan variable ve methodlari obje uzerinden kullanmak isterseniz java buna musade eder.
		 
		 7)
		  
		*/

	}

}
