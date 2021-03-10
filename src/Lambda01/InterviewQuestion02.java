package Lambda01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InterviewQuestion02 {

	/*
	 Sure: 10 dakika
Verilen bir String'de hangi kelimenin kac kere kullanildigini gosteren bir program yaziniz
Ornegin; "This is a string. This program is counting words in a string." 
String'inde output asagidaki gibi olmalidir.
{counting=1, a=2, in=1, words=1, This=2, is=2, string.=2, program=1}
Collapse
	 */
	public static void main(String[] args) {
		String s = "Ali, Ali, Veli, Hasan, Ali";
		
		String kelime[] = s.split(" ");//[Ali,, Ali,, Veli,, Hasan,, Ali]
		System.out.println(Arrays.toString(kelime));//
		
		List<String> kelimeList = new ArrayList<String>();
		
		for(String w: kelime) {
			w = w.replaceAll("\\W", "");
			kelimeList.add(w);
		}
		System.out.println(kelimeList);
		
		HashMap<String , Integer> kelimeSayilari = new HashMap<>();
		//Map'leri eleman saymada kullaniriz.(// We use maps to count elements.)
		
		for (int i = 0; i <kelimeList.size(); i++) {
			if(kelimeSayilari.containsKey(kelimeList.get(i))) {
				int sayi =kelimeSayilari.get(kelimeList.get(i));
				kelimeSayilari.put(kelimeList.get(i), sayi+1);
				
			}else {
				kelimeSayilari.put(kelimeList.get(i), 1);
			}
			
		}
		System.out.println(kelimeSayilari);
	}

}
