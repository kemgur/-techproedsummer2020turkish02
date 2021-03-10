package day23daytime;

public class Test07 {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2},{3},{4,5,6}};
		int sum = 0;
		
		for(int []w : arr) {
			for(int z:w) {//multidimentiona arraylerin her bir elemanini sum'in icine koyabildik.
				sum = sum +z;
				
			}
			
		}
		System.out.println(sum);
	}

}
