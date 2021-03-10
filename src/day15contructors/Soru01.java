package day15contructors;

public class Soru01 {

	String name = "Emily";
	int age = 20;
	
	Soru01(String name,int age){
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args) {
		//Obje uretelim
		Soru01 st =new Soru01("Pakize", 18);// = sonraki kisim cosntructor
		System.out.print(st.name +" ");
		System.out.println(st.age +" yasindadir benim icin.");
		
	}

}
