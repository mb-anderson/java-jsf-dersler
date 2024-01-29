package hafta6;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "BolmeKolonu")
public class Human implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String ad;
	private String soyad;
	@Column(insertable = false, updatable = false)
	private String BolmeKolonu;

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

	public String getBolmeKolonu() {
		return BolmeKolonu;
	}

	public void setBolmeKolonu(String bolmeKolonu) {
		BolmeKolonu = bolmeKolonu;
	}
}
