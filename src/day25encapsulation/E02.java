package day25encapsulation;

public class E02 {

	public static void main(String[] args) {
		
		E01 obj = new E01();
		//obj.getSifre(); //Once E1 clasindan obje olusturduk.
		//Sonra o obje sayesinde diger clastaki methoddan sifreyi alabildik.
		System.out.println(obj.getSifre());//1234
		System.out.println(obj.getIsim());//Ali Can
		System.out.println(obj.getCh());//A
		
		obj.setSifre(98765);// Bu classin icerisindeki sifreyi degistirdik.
		//Bunun icin setSifre() methodunu kullandik.
		System.out.println(obj.getSifre());//98765
		
		obj.setCh('Z');
		System.out.println(obj.getCh());//Z
		
		obj.setIsim("Fenerbahce");
		System.out.println(obj.getIsim());//Fenerbahce
		
		
		E03 ob = new E03();
		System.out.println(ob.getName());//Kemal Dogru
		System.out.println(ob.getYas());//23
		
		ob.setBorc(2300.24f);//Borc degistirildi ama okuyamiyoruz cunku getter yok.
		
		ob.setYas((byte) 25) ;
		System.out.println(ob.getYas());//25
		
		
		
		
		
	}

	
	

}
