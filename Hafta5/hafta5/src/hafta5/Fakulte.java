package hafta5;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Fakulte {
	@Id
	@GeneratedValue
	private Long num;
	private String ad;
	@OneToMany(mappedBy = "fakulte")
	private List<Ogrenci> ogrenci = new ArrayList<Ogrenci>();

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public List<Ogrenci> getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(List<Ogrenci> ogrenci) {
		this.ogrenci = ogrenci;
	}

}
