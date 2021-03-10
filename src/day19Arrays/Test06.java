package day19Arrays;

import java.util.Arrays;

public class Test06 {

	public static void main(String[] args) {
		// Foor loop kullanarak array'a elemam atamasi yapilir.
		
		int arr[]=new int[5];//arrayi olusturduk
		
		int count = 1; //count olusturduk
		
		for (int i = 0; i < 5; i++) {//for loop olusturduk
			
			arr[i]=count;// her array indexine counter degerini eleman olarak atayabiliyoruz
			
			count +=2; 
			
			
			
		}
		System.out.println(Arrays.toString(arr));//[1, 3, 5, 7, 9]

	}

}
