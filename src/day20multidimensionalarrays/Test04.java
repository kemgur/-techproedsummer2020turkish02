package day20multidimensionalarrays;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		
		// Array elemanlarini kucukten buyuge siralayip, tersini yazdirma
		
		int arr[]= {2,11,0,23,7};
		
		Arrays.sort(arr);
		
		for (int i = 4; i >=0; i--) {
		
		System.out.print(arr[i] +" ");
			
		}
		
		
	}

}
