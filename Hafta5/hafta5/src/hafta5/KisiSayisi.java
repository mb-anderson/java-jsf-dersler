package hafta5;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class KisiSayisi {
	@Id
	@GeneratedValue
	private Long numaram;
	private String deger;
	private String adana;

	public Long getNumaram() {
		return numaram;
	}

	public void setNumaram(Long numaram) {
		this.numaram = numaram;
	}

	public String getDeger() {
		return deger;
	}

	public void setDeger(String deger) {
		this.deger = deger;
	}

	public String getAdana() {
		return adana;
	}

	public void setAdana(String adana) {
		this.adana = adana;
	}

}
