package day15contructors;

public class Soru02 {

	String name;
	int age ; 
	String phone;
	
	Soru02(){
		
	}
	Soru02(String name,int age,	String phone){
		this.phone = phone;
		this.name = name;
		// yas a bir atama yapilmadigi icin ) yazdirdi
	}
	public static void main(String[] args) {
		
		Soru02 s1 = new Soru02();
		Soru02 s2 = new Soru02("John", 25,"551 587 6333");
		
		System.out.println(s2.name + ", "+ s2.age +", "+ s2.phone);//John, 0, 551 587 6333
		
		

	}

}
