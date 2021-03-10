package day30exceptions;

public class Example02 {

	public static void main(String[] args) {

		try {
			hop();
		}catch(Exception e){
			System.out.println(e.getMessage());// can not hop

		}	
		
	}

	private static void hop() {
		throw new RuntimeException("can not hop");

	}

}
