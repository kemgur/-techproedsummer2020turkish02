package day21arraylists;

public class Test04 {

	public static void main(String[] args) {
		int arr [][]= {{1,2},{3},{4,5,6}};
		int x=1;
		for(int i =0;i< arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {// Bu for dongusu array in icerisindeki sayilari ifade eder
				x=x*arr[i][j];//720
			}
		}
			System.out.println(x);	//720
		


	}

}
