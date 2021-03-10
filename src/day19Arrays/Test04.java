package day19Arrays;

public class Test04 {

	public static void main(String[] args) {
		
		short arr[] = new short[4];
		
		arr[0]= 10;
		arr[1]=11;
		arr[2]=12;
		arr[3]=13;
		
		/*
		Asagidakilerden hangi ikisinin ekran ciktisi aynidir?
		
		A) System.out.println(arr[4]);//RTE verir. Cunku index 3 'te bitiyor
		
		B)  System.out.println(arr[3]);// 13
		
		C)  System.out.println(arr[arr.length-1]); // 13
		Aciklama: arr[arr.length-1] == arr[3] e esittlir.
		
		D) System.out.println(arr[arr.length+1])// CTE verir
		Cunku index 5 olan eleman yoktur. 
		
		CTE bir hata mesajidir ona ekran ciktisi diyemeyiz.
		Dogru cevap B ve C dir.

		 */
		
	}

}
