package day36collectionsmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Map02Ornek {

	public static void main(String[] args) {
		

		/*
		 Size verilen bir yazida hangi kelimenin kac kez
		  kullanildigini gosteren kodu yaziniz.
		 */

			String s = "Java ogrenmek zevkliydi. "
					+ "Java ogrenmek kolay ama tekrar gerekiyor. "
					+ "Java tekrari zevkliydi ama vaktim yoktu.";
			
			String kelime[] =s.split(" ");
			System.out.println(Arrays.toString(kelime));
			
			HashMap<String, Integer> hm = new HashMap<>();
			

			for(String w: kelime) {//Bu kisim yaninda nokta varsa calisir.
			
				if(w.contains(".")) {//Yaninda nokta(.) olan kelimeler varsa;
					
					w = w.replace(".", "");//O noktalari kaldir ve yerine hicbir sey koy dedik.
					
					if(!hm.containsKey(w)) {//hm'in key'lerinin arasinda "zevkliydi" var mi? 
						hm.put(w, 1);//Yoksa ekle.
					}else {
						hm.put(w, hm.get(w)+1);
					}
					
			}else {//Bu kisim yaninda nokta yoksa calisir.
						if(!hm.containsKey(w)) {//Map'a bak "Java" var mi? =>Yoksa false olur ama "!" ile true olur.
							hm.put(w, 1);//true ise hash'in icerisine koy ve value'sini 1 yap.
						}else {
							hm.put(w, hm.get(w)+1);// Java'nin value'sini al
						}//get() methonu incele.
						
					}
					
				}
				
			
			System.out.println(hm);//{Java=3, ama=2, tekrari=1, kolay=1, gerekiyor=1, tekrar=1, yoktu=1, zevkliydi=2, vaktim=1, ogrenmek=2}

	}

}
