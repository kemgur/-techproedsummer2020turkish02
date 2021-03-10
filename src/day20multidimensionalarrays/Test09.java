package day20multidimensionalarrays;

public class Test09 {

	public static void main(String[] args) {
		
		// Arrayda tekrar eden elemanlari bulma
		
		int arr[]= {3,2,3,4,4,5};
		
		int count =0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==3) { //Arrayde 3 kac kez tekrar etmis bulmus olduk.
				count++;
				
			}
			
		}
		
		System.out.println(count);
	}

}
