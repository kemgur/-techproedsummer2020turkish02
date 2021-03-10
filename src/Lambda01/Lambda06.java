package Lambda01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lambda06 {

	public static void main(String[] args) {
		
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
		
		List<Course> courseList = new ArrayList<>();
		courseList.add(courseTurkishDay);
		courseList.add(courseTurkishNight);
		courseList.add(courseEnglishDay);
		courseList.add(courseEnglishNight);
		
		
		System.out.println(avgScrBuyuk92(courseList));//true
		System.out.println(ogrSayi120Az(courseList));//true
		System.out.println(sezonSpring(courseList));//true
		System.out.println(ogrSayiKursRev(courseList));
		System.out.println(avgScoreIlk3(courseList));
		System.out.println(ogrSayiIkinciAz(courseList));//[Spring/ English Day/ 95/ 132]
		

	}

	    //Average score'larin tamaminin 92 den buyuk olup olmadigini kontrol eden
	    //bir program yaziniz. //tamamini isteyen sorularda aklimiza allMatch(), methodu gelmeli.
		public static boolean avgScrBuyuk92(List<Course> courseList) {
			return courseList.stream().allMatch(t->t.getAverageScore()>92);		
		}
		
		//Ogrenci sayilarinin hicbirinin 120'den az olmadigini kontrol eden bir program yaziniz
		public static boolean ogrSayi120Az(List<Course> courseList) {
			return courseList.stream().noneMatch(t->t.getNumberOfStudents()<120);
		}
		
		//Kurs sezonlarinin herhangi birinin "Spring" olup olmadigin kontrol eden program yaziniz
		public static boolean sezonSpring(List<Course> courseList) {
			return courseList.stream().anyMatch(t->t.getSeason().equals("Spring"));
		}
		
		//Kurslari ogrenci sayilarina gore buyukten kucuge siralayiniz
		public static List<Course> ogrSayiKursRev(List<Course> courseList){
			return courseList.
					stream().
					sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).
					collect(Collectors.toList());   
					// collect() methodunun icerisindeki Collector methodunun icersinde 
					// toList(), methodu var bu method list halindeki variable'lari listeler.
					//Sonucu bir list'in icersinde gormek isteesek bu methodu kullanabiliriz.
		}
		
		//Kurslari average score'larina gore buyukten kucuge siralayiniz ve ilk 3'unu gosteriniz
		public static List<Course> avgScoreIlk3(List<Course> courseList){
			 return courseList.
			 stream().
			 sorted(Comparator.comparing(Course::getAverageScore).reversed()).
			 limit(3).
			 collect(Collectors.toList());	
		}
		
		//Kurslardan ogrenci sayisi en az olan ikinci kursu ekrana yazdiriniz
		public static List<Course> ogrSayiIkinciAz(List<Course> courseList) {
		return courseList.
				stream().
				sorted(Comparator.comparing(Course::getNumberOfStudents)).
				limit(2).//Ilk iki elementi alir
				skip(1).//1. elemani pass gecer.
				collect(Collectors.toList());//list'in icine koyar.
				//[Spring/ English Day/ 95/ 132]
			
			
		}
		
		
		
		
}
