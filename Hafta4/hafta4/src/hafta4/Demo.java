package hafta4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "malikane")
public class Demo {
	@Id
	@GeneratedValue
	private Long id;
	private String ad;
	private String soyad;
	private Integer yas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Integer getYas() {
		return yas;
	}

	public void setYas(Integer yas) {
		this.yas = yas;
	}
}
