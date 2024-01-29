package hafta2;

public class sayacBean {
	private Integer sayac = 0;
	
	public Integer getSayac() {
		return sayac;
	}

	public void setSayac(Integer sayac) {
		this.sayac = sayac;
	}

	public void artir() {
		sayac++;
		System.out.println(sayac);
	}
}
