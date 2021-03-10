package day16constructors;

public class Counter {

	int count = 0;
	
	Counter(){
		this.count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		
		Counter c1 = new Counter();//1
		Counter c2 = new Counter();//1
		Counter c3 = new Counter();//1
		//Her objenin isstance variable birbirinden bagimsiz olarak birer kez artmistir.
		
	}

}
