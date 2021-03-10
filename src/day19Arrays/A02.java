package day19Arrays;

import java.util.Arrays;

public class A02 {

	public static void main(String[] args) {
	
		//split : bir Stringi parcalara ayirmak.
		 //split: bolmek, ayirmak , yarmak, ayrilmak anlamlarina gelir
		 
		 String str ="Ipek topu at, topu at Ipek";//virgulden kesebiliriz.
		 
		 String strArray[] = str.split(","); //String arasindaki virgulden keserek islem yaptik.
		 
		 System.out.println(Arrays.toString(strArray));//[Ipek topu at,  topu at Ipek]
		  // Virgulden sonra 2 bosluk olur. Biri stringden gelen digeri de 
		 //split methodunu uygularken java koyar.  

		 
		 //str Sringinde kac kelime var?
			String sArray[] = str.split(" ");// Kelimeler arasindaki bosluklardan keserek islem yaptik
			System.out.println(Arrays.deepToString(sArray));//[Ipek, topu, at,, topu, at, Ipek]
			System.out.println(sArray.length);//6
			//Bosluklara gore kesim yapsam ve elde ettigim arrayin length'ine baksam
			//Stringte kac kelime oldugunu bulabilirim.
			
			
			
		String tArray[]=str.split("");//Bu kod space dahil tum carakterleri ayirir. 
		System.out.println(Arrays.toString(tArray));//[I, p, e, k,  , t, o, p, u,  , a, t, ,,  , t, o, p, u,  , a, t,  , I, p, e, k]
		// Her carakterden sonra bir virgul ve bir bosluk birakir. Bu javanin gramer kuralidir.
		//
	}

}
