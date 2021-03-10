package day05incrementdecrement;

public class ConcatenationSoru01 {

	public static void main(String[] args) {
		
		int numA = 2;
		int numB = 3;
		String str1 ="Cok";
		String str2 ="Calis";
		// Ektrana " Cok Calis 1" yazdirin
		System.out.println(str1 +" "+ str2 +" "+ (numB-numA));//Cok Calis 1
		
		// Ektrana "5 Cok Calis" yazdirin
		System.out.println((numB+numA) +" "+ str1 +" "+ str2);//5 Cok Calis
		
		System.out.println(numA + numB + str1);//5Cok
		
		int n1 = 2;
		int n2 = 3;
		String s1 = "Study";
		
		//Ekrana "61 Study-1" yazdirin
		System.out.println((n1*n2)+""+(n2-n1)+" "+s1 +(n1-n2));
		
//		boolean isTrue = 5+2==7;
//		System.out.println(isTrue);//true
		
//		boolean isFalse = 5+21==7;
//		System.out.println(isFalse);//false
//
//		boolean isTruee = 5+2!=7;
//		System.out.println(isTrue);//true
//		
//		boolean isFalsee = 5+21!=7;
//		System.out.println(isFalse);//false
	}

}
