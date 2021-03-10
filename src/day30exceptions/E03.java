package day30exceptions;

public class E03 {

	public static void main(String[] args) {
		
		// Bolme islemi yapan bir program yazalim.
		int num1 = 12;
		int num2 = 0;
		
		try {
			
		System.out.println(num1/num2);//java.lang.ArithmeticException aldik nasil handl edecegiz.
		
		}catch(ArithmeticException e) {
			System.out.println("Sifir ile bolme yapilmaz.");
		}

		//ArithmeticException Run Time Exception'dir. Matematik kurallarina uygun olmayan bir islem
		//yapildiginda bu exception alinir.
		
		//try 'dan sonra birden cok catch kullanilabilir. 
		//Ama ustteki catch, alttaki catch'in child'i olmalidir.
		//catch'ler specific'ten genele dogru olmalidir.
		
	}

}
