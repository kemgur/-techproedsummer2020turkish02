package day25encapsulation;

public class E03 {

	private byte yas = 23;
	private float borc = 6500.0f;
	private String name = "Kemal Dogru";
	private boolean zengin = true;
	
	public static void main(String[] args) {
		

	}

	public byte getYas() {
		return yas;
	}

	public void setYas(byte yas) {
		this.yas = yas;
	}

	public String getName() {
		return name;
	}

	public void setBorc(float borc) {
		this.borc = borc;
	}
   
	//Java boolean'larin icin getter olustururken method ismini "is" ile baslar.
	//Setter'larda set kullanmaya devam eder.
	public boolean isZengin() {
		return zengin;
	}

	public void setZengin(boolean zengin) {
		this.zengin = zengin;
	}

}
