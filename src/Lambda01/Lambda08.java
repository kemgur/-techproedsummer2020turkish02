package Lambda01;

import java.math.BigInteger;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lambda08 {

	public static void main(String[] args) {
		
		System.out.println(sum1(20));
		System.out.println(sum2(20));
		System.out.println(sum3(20));
		System.out.println(sum3Cift(20));
		System.out.println(sumIlkXCift(20));
		System.out.println(sumIlkXCift2(20));
		System.out.println(sumIlkXTek(20));
		System.out.println(sumIlkXTek2(20));
		kuvvet2Yazdir(5);
		System.out.println();
		istenenSayininKuvvetYazdir(3,6);
		System.out.println();
		System.out.println(istenenSatininIstenenKuvveti(3,6));
		System.out.println(istenenSayininFaktoriyeli(5));//OptionalInt[120] 
		System.out.println();
		System.out.println(factorialBigInteger(50));//30414093201713378043612608166064768844377641568960512000000000000
		
		
		
	}

	//1'den x'a kadar tamsayilari toplayan bir program yaziniz
	//Structured Programming
	public static int sum1(int x) {
		int sum =0;
		for (int i = 0; i <= x; i++) {
			sum = sum +i;
		}
		return sum;
	}
	//Functional Programming
	public static int sum2(int x) {
		//IntStream.range() bu methoda baslangic ve bitis degerleri verilirse aradaki sayilari list olarak kullanir
		return IntStream.range(1, x+1).sum();
		//range() methodunda birince parametre dahil, 2.parametre harictir.Bundan doalyi bir fazlasini aldik.
		
	}
	public static int sum3(int x) {
		return IntStream.rangeClosed(1, x).sum();
		//rangeClosed(1, x) methodunda ise baslangic ve bitis degerleri dahildir.
	}
	
	//1'den x'a kadar cift tamsayilari toplayan bir program yaziniz
	public static int sum3Cift(int x) {
		return IntStream.rangeClosed(1, x).filter(t->t%2==0).sum();
	}
	
	//Ilk x cift sayiyi toplayan program yaziniz
	//1.yol
	public static int sumIlkXCift(int x) {
		return IntStream.rangeClosed(1, 2*x).filter(t->t%2==0).sum();
		
	}
	//2.yol
	public static int sumIlkXCift2(int x) {
	return IntStream.iterate(2, t->t+2).limit(x).sum();
	}
	
	//ilk x pozitif tek sayiyi toplayan programi yaziniz.
	//1.yol: Recommended
	public static int sumIlkXTek(int x) {
		return IntStream.iterate(1, t->t+2).limit(x).sum();
		
	}
	 //2.Yol
	public static int sumIlkXTek2(int x) {
		return IntStream.rangeClosed(1, 2*x-1).filter(t->t%2!=2).sum();
		
	}
	//2'nin ilk bes kuvvetini elrana yazdiran programi yazdirin==> 2 4 8 16 32. . . .
	public static void kuvvet2Yazdir(int x) {
		IntStream.iterate(2, t->t*2).limit(x).forEach(Lambda01::printEl);
		
	}
	//istenilen bir sayinin ilk x kuvvetini elrana yazdiran programi yazdirin==> 2 4 8 16 32. . . 
	public static void istenenSayininKuvvetYazdir(int a, int x) {
		IntStream.iterate(a, t->t*a).limit(x).forEach(Lambda01::printEl);
		
	}
	//istenilen bir sayinin istene kuvvetini ekrana yazdiran programi yazdirin
	public static int istenenSatininIstenenKuvveti(int a, int x) {
		return IntStream.iterate(a, t->t*a).limit(x).reduce(0,(m,n)->n);
	}
	//Istenilen bir sayisinin faktorial'ini hesaplayan program yaziniz. %! = 5x4x3x2x1
	public static OptionalInt istenenSayininFaktoriyeli(int x) {
		return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact);//bu method da olabilir ==> reduce(1, (m,n)->m*n)
		
	}
	//Buyuk sayilari calisabilmek icin BigInteger (methodu kullanilir.)
	public static BigInteger factorialBigInteger (int x) {
		return IntStream.rangeClosed(1, x).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
		//mapToObg() methodu buyuk sayilarla calisilirken mutlaka kullanimali.
		//mapToObg() methodu Stream'dan gelen salilari alir object'e cevirir.
	}
	
		
	
	 
}
