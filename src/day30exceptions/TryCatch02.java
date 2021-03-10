package day30exceptions;

public class TryCatch02 {

	static String m;
	
	public static void main(String[] args) {
		
		String s = "";
		System.out.println(s.length());//0
		
		try {
			s+="t";
			
		}catch(Exception e) {
			s+="c";
			
		}finally {//her halukarda calisir. finally{} block'ta hata verme ihtimali varsa 
			// onun icine de try/catch yazabiliriz.
			s+="f";
		}
		s+="a";
		System.out.println(s);//tfa 
		
		String n = null;
		System.out.println(n.length());//NullPointerException
		// String'e null atandigi zaman veya
		// instance variable'a deger atamasi yapilmadigi zaman length() methodu calismaz.
		// NullPointerException yazdirir.
		
		//Asagidaki iki satirdaki kod da exception verir.
		System.out.println(n.length());//NullPointerException //RTE 
		System.out.println(m.length());//NullPointerException  //RTE

	}

	//throw ne is e yarar?
	//Istedigimiz herhangi bir yerde exception almamizi saglar.
    //(It allows us to get an exception wherever we want.)
}
