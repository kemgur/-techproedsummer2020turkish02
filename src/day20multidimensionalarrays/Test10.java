package day20multidimensionalarrays;

import java.util.Arrays;

public class Test10 {

	public static void main(String[] args) {
		
		char arr[] = new char[4];
		
		arr[0]='A';
		arr[2]='E';
		arr[3]='M';
		
		System.out.println(Arrays.toString(arr));//[A,  , E, M]
		
		//Note: char'larin default value'su hic bir seydir. " "" " seklindedir. 
		// charlarda default degeri hic bir seydir ve iki virgul bir araya gelir.
	}

}
 