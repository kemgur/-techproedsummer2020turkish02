package day30exceptions;

public class Example03 {

	public static void main(String[] args) {

		try {
			hop();
		}catch(Exception e){
			e.printStackTrace();//Bu methodu kullandigimizda hangi satirlarda exception aldigimizi detayli sekilde gorebiliriz.
			// Exception satirlarini olusum sirsasina gore gosterir.
//			java.lang.RuntimeException: can not hop
//			at day30exceptions.Example03.hop(Example03.java:17)
//			at day30exceptions.Example03.main(Example03.java:8)

			
		}	
		
	}

	private static void hop() {
		throw new RuntimeException("can not hop");
	}

}
