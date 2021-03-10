package day30exceptions;

public class TryCatch03 {
	/*THROW ILE THROWS KEYWORD'LARIN FARKI
	 1) throw, method body'si icine yazilir, throws method parantezi ile curly brace'in arasina yazilir()throws{)
	 2) throw'u method body'si icerisinde exception almak istedigin her yerde kullanabilirsin.
	 	throws ise method isminden ve parantezinden sonra sadece bir kez kullanilabilir.
	 3) 1 throw sadece 1 exception uretebilir, 1 throws ise birden cok exception uretebilir.
	 Example:")throws NullPointerException, ArithmeticException {" mumkun.
	 4)  throw icin sintex==>     throw new NullPointerException;
	 	 throws icin exception==> throws NullPointerException, 
	 */

	public static void main(String[] args) {
	
		System.out.println(exceptions());//beforecatchfinallydone


	}

	@SuppressWarnings("finally")//annotation(ek aciklama)
	public static String exceptions() {
		String result = "";
		String v = null;//Bu durumlarda length() methodu calismaz.
		try {
			try {
				result = result + "before";//before
				v.length();//NullPointerException aliriz
				result = result + "after";//Ust satirda hata aldigimiz icin bu satiri java okumaz.Exception a gider.
				
			}catch(NullPointerException e) {
				result = result + "catch";//beforecatch
				throw new RuntimeException();
				//throw, istedigimiz zaman exception atmamizi saglar.
				//Burda exception atti ama onu yakalacak catch methodu yok. Exception havada kaldi.
				//Bundan sonra finally{} block calisir.
				
			}finally {
				result = result + "finally";//beforecatchfinally
				throw new Exception();//bu trow'un attigi exception'i alt satirdaki catch yakalayacak.
			}
		}catch(Exception e) {
			result = result + "done";//beforecatchfinallydone
		}
		return result;//beforecatchfinallydone

	}
	
}
