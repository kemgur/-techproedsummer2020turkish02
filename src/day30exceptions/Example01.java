package day30exceptions;

public class Example01 {

	public static void main(String[] args) {
		
		try {
			hop();
		}catch(Exception e){
			System.out.println(e);//java.lang.RuntimeException: can not hop

		}	
		
	}

	private static void hop() {
		throw new RuntimeException("can not hop");
	}
}
