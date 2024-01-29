package hafta5;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Adres implements Serializable {
	@Id
	@GeneratedValue
	private Long num;
	private String cadde;
	private String ilce;
	@OneToOne(mappedBy = "adres")
	private Ogrenci ogrenci;

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getCadde() {
		return cadde;
	}

	public void setCadde(String cadde) {
		this.cadde = cadde;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}
}
