package day19Arrays;

import java.util.Arrays;

public class A03 {

	public static void main(String[] args) {
		/*
		 Array'ler heap memory'de yer alir. Bu arraylerin referanslari stack memoryde yer alir.
		 Stack memoryde yer alan referanlar karsilastirilirken "==" yerine "equal" methodu kullanilmali.
		 Object'lerde "==" kullanmayiz. "equals()" methodu kullaniriz.
		 "==" sadece primitive data type larda kullaniriz.
		 */
		int arr1[]= {1, 2, 3};
		int arr2[]= {1, 2, 3};
		
		if(arr1  == arr2) {
			System.out.println("Same");
			
		}else {
			System.out.println("Not same");//Not same
			
		}
//2.yol ve dogru yol:
		int arr3[]= {1, 2, 3};
		int arr4[]= {1, 2, 3};
		
		if(Arrays.equals(arr3, arr4)) {
			System.out.println("Same");//Same
			
		}else {
			System.out.println("Not same");
			
		}

	}

}
