package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda01 {

	public static void main(String[] args) {
		//Array'in icersinde baska bir array oldugu icin bu ismi almistir.

		//Multidimensional array nasil olusturulur?
		int mda[][]=new int[3][2];//multidimensionalarray
		
		//Multidimensional array'e deger atamasi nasil yapilir?
				mda[1][0]=7;
				
				System.out.println(Arrays.toString(mda));//[[I@15db9742, [I@6d06d69c, [I@7852e922]
				//Bu kodlara hash cod denir.
			
				System.out.println(Arrays.deepToString(mda));//[[0, 0], [7, 0], [0, 0]]
				//Arrays.deepToString(mda) methoduyla array in tum elemanlari yazdirilir.
				
		
				mda[2][0]=11;// 11 i atama islemi
				System.out.println(Arrays.deepToString(mda));//[[0, 0], [7, 0], [11, 0]]
		
				mda[0][1]=23;
				System.out.println(Arrays.deepToString(mda));//[[0, 23], [7, 0], [11, 0]]
		
				mda[0][0] = 10;
				mda[1][1] = 12;
				mda[2][1] = 55;
				System.out.println(Arrays.deepToString(mda));//[  [10, 23], [7, 12], [11, 55]]
	
				//Multidimensional array'lerde istenen bir elemani yazdirmak
				System.out.println(Arrays.toString(mda[0]));//[10, 23]
				System.out.println(Arrays.toString(mda[1]));//[7, 12]
				System.out.println(Arrays.toString(mda[2]));//[11, 55]
				
				System.out.println(mda[0][0]);//10
				System.out.println(mda[1][1]);//12
				System.out.println(mda[2][0]);//11
				
				//Multidimensional array olusturmanin kisa yolu nedir?
				char mdac[][]= {{'a','b','c','m'},{'d'},{'e','f'},{'g','h','i','k'}};
				System.out.println(Arrays.deepToString(mdac));//[[a, b, c], [d], [e, f], [g, h, i, k]]
	
				//Soru: Yukaridaki multidimensional array'deki ilk arrayin elemanlarinin ASCII degerleri
				//toplamini ekrana yazdiriniz
				
				//1. Yol:
				//Hard kod:
				System.out.println(mdac[0][0]+mdac[0][1]+mdac[0][2]);//294
				
				//2.yol
				//Flexible kod:
				int sum = 0;
				for (int i = 0; i < mdac[0].length; i++) {
					sum = sum + mdac[0][i];
					
				}
				System.out.println(sum);//403
				
				
	}

}
