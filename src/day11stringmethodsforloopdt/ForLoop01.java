package day11stringmethodsforloopdt;

public class ForLoop01 {

	public static void main(String[] args) {
		//Loop: Dongu demektir.Bir seyi tekrar tekrar yapmaktir
		
		//Ekrana 10 defa "Java" yazdiralim
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		
		//Yukaridaki isi for-loop kullanarak kisaca yapabilir siniz.
		//Baslangic  Condition(kosul)  Artirma/Azaltma
		for(  int i =1      ;      i<=10           ;    i++               ) {
			System.out.println("Java");
		}
		for(int i =10; i>=0; i--) {
			System.out.println("Java candir");
			
		}
		
		//Ekrana 1 to 7 yazdirin
		
		for(int i=1; i<=7; i++){
			System.out.print(i);//1234567
			
		}
		System.out.println();
		
		//Ekrana 4 ten 1 e kadar tam sayilari yazdirin
		for(int i =4; i>=1; i-- ) {
			System.out.print(i);//
		}
		System.out.println();
		//Ekrana ilk 3 cift sayma sayisini yazdirin
		//1.yol
		for(int i =2; i<=6; i+=2) {
			System.out.print(i);	
			
		}System.out.println();
		
		//2.yol
		for(int i=1; i<=6;i++ ) {
			if(i%2==0) {
				System.out.print(i);
				
			}
			System.out.println();
		}
		//Ekrana ilk 100 pozitif cift sayma sayisini kullanin.
		/* Loop'larin oncesinde bir variable oluturup onu loop'un icinde 
		 kullanirsaniz bu variable'lara "Flag" denir. 
		 Asagidaki soruda sayma variable'i bir flag'tir
		 */
		
		int sayma =0;
		
		for(int i =1; sayma<=100; i++) {
			if(i%2==0) {
				System.out.print(i +" ");
				sayma++;
			}
			
		}

	}

}
