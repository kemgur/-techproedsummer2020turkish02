package day12forVeWhileloop;

public class ForLoop01 {

	public static void main(String[] args) {
		// Ilk 30 sayma sayisinin toplamini ekrana yazdiran program yaziniz
		
		int sum = 0; //Flag: for dongusunun ustunde olusturulur.
		
		for(int i =1; i<=30; i++) {
			
			sum = sum+i;
			
		}
		//Sadece final sonucu gormek isterseniz System.out.println(sum); ifadesini
		//for-loop'un disina yaziniz.(Genellikle bu kullanilir)
		//Her loop'dan sonraki toplami gormek isterseniz System.out.println(sum);
		//ifadesini for-loop'un icine yaziniz.
		System.out.println(sum);
		
		
		//**********************************************************************
		// Ilk 40 sayma sayisinin toplamini ekrana yazdiran program yaziniz
		
		int sum1 =0;
		for(int i =1; i <=40; i++) {
			
			sum1=sum1+i;
			
		}
		
		System.out.println(sum1);
		
		//**********************************************************************
		
		//Ilk 10 sayma sayisinin carpimini ekrana yazdiran programi yaziniz.
		//Matematikte 1x2x3x4x5 ifadesine 5 fakoryel denir ve 5! ile gosterilir.
		//Mesela; 7! = 1x2x3x4x5x6x7
		//INTERVIEW SORUSU Faktoryel hesabini yapan bir program yaziniz
		int product =1;
		for(int i =1; i<=10; i++) {
			
			product = product*i;
		}
		System.out.println(product);
		
		//**********************************************************************
		//100 ile 200 arasindaki 3 ile bolunebilen sayilarin toplamini bulan bir 
		//program yaziniz
		//(Find the sum of numbers between 100 and 200 that can be divided by 3)
		int sum2 =0;
		for(int i=101; i<200; i++) {
			if(i%3==0) {
				sum2=sum2+i;
			}
		
		}
		System.out.println(sum2);
		
		
	}

}

