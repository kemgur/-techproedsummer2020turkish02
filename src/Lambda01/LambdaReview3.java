package Lambda01;

import java.util.stream.IntStream;

public class LambdaReview3 {

	public static void main(String[] args) {
		
		//ilk 10 , 7 ile bolunebilen ilk 10 sayiyiyi bulun
		
		System.out.println(IntStream.rangeClosed(1,70).filter(t->t%7==0).sum());//385
		
		System.out.println(IntStream.iterate(7, t->t+7).limit(10).sum());
		//iterate() methodu cok fonksiyonludur bilmek gerekir. 
		//iterate(7, t->t+7), baslangic noktasi olarak 7 yi alir. Sonra 7 ekleyerek devam eder. 
		//Ta ki limit() methoduyla ilk kac sayiyiyi alacagimizi bildirene kadar. 
		//sum() methoduyla bu 10 sayi toplanir.
	}

}
