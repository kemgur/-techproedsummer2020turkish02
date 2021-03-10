package day20multidimensionalarrays;

public class Mda02 {

	public static void main(String[] args) {
		
		//soru: integer multidimensional array olusturun
		//ve tum elemanlarinin toplamini ekrana yazdirin
		
		int mdai [][]= {{1,2},{3},{4,5,6}};
		
		//1.yol: Hard coding:(
		System.out.println(mdai[0][0] +mdai[0][1] +mdai[1][0] +mdai[2][0] +mdai[2][1] +mdai[2][2]);//21
		
		//2.yol: 
		// Dynamic coding: ))
		int sum = 0;
		for (int i = 0; i < mdai.length; i++) {
			
			for (int j = 0; j < mdai[i].length; j++) {
				
				sum = sum + mdai[i][j];
				
			}
			
		}
		System.out.println(sum);//21
	}

}
