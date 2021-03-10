package day29polimorphismexceptions;

import java.io.FileInputStream;//io: input-output kutuphanesinden inport edildi.
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

	/*
	 1) No exceptoin: hic bir sorun yok
	 2) Handling Exception: Hata var ama duzeltilebilir
	 3) Throwing Exception: Hatayi duzeltemeyiz. Yardim isteriz.
	 
	  FileNotFoundException: Path yanlissa ve dosya silinmisse bu sorunu cozer.
	  IOException:  FileNotFoundException'un parentidir, input ve output ile ilgili tum sorunlari cozer.
	 */
	 
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis =null;
		
		try {//try/catch kullanmanin avantaji, teknik olmayan insanlara mesaj vermemizi saglar.
		
		fis = new FileInputStream("src/day29polimorphismexceptions/TextFile");//file in adresini okuyan bir constructor
		//Bu obje sadece file'a ulasmak icindir.
		int k = 0;
		
		while((k = fis.read())!=-1) {
			System.out.print((char) k);
			
		}
	
		
		}catch(IOException e) {
			System.out.println("Ya path yanlis ya dosya silinmis, ya da dosya okunmayacak halde");
			//Ya path yanlis ya dosya silinmis, ya da dosya okunmayacak halde
		
		}finally {//Her halukarda calis, demektir.
			System.out.print(" finally block calisti");
			fis.close();// 
		}
		/*
		 finally{} block, try/catch lardan sonra kullanilir.
		 Exception olsa da olmasa da finally block her halukarda calisir.
		 Calistigim dosyayi kapatmak icin finally block'i kullanirim.
		 */
	}

}
  