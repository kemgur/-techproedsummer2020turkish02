package day35collections;

public class Ts01 {

	

	public static int print() {

		return 3;

	}

	public static String print(int i) {

		return "5";

	}

	public static void print(String j) {

		System.out.println(j);

	

		}


	public static void main(String[] args) {
		
		String str = print(8) + print();

		print(str);
}
}