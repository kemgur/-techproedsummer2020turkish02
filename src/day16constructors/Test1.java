package day16constructors;

public class Test1 {

	static int i = 1;
	int k = 1;
	
	public static void main(String[] args) {
		

		for (int i =1; i<10 ; i++) {
			i = i +2;
			System.out.println(i);//3 6 9	
			//for'un icersindeki i local olarak olusturulan i dir.
		}
		System.out.println(i);//1 Bu i ise yukaridaki static olan i dir.
		System.out.println();
		
		for(int k = 1; k<10 ; k++) {
			k = k+2;
			System.out.println(k);
			//for'un icersindeki k local olarak olusturulan k dir.
			
		}
		//System.out.println(k); Bu kod CTE hatasi verir. Cunku yukaridaki k static degildir.
		//Static olmayan k variable'i static olan main method icerisinde kullanilamaz.
	}

}
