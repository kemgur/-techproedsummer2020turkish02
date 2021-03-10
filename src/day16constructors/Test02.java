package day16constructors;

public class Test02 {

	int price = 20000;
	int year = 2020;
	String make = "Honda";
	
	public static void main(String[] args) {
		
		Test02 hondaAraba = new Test02();
		System.out.println(hondaAraba.price);//20000
		System.out.println(hondaAraba.year-3);//2017
		System.out.println(hondaAraba.make.replace("H", "K"));//Konda


	}

}
