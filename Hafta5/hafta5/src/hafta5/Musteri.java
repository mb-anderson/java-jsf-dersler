package hafta5;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Formula;

@Entity
@NamedQuery(name = "AdGelsin", query = "select m, ma from Musteri m join m.adres ma where ad like :isim")
public class Musteri {
	@Id
	@GeneratedValue
	private Long id;
	private String ad;
	private String soyad;
	private Integer maas = 1000;
	@Formula("maas*12")
	private Integer yillikGetiri;
	@OneToOne
	private MusteriAdres adres = new MusteriAdres();

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

	public Integer getMaas() {
		return maas;
	}

	public void setMaas(Integer maas) {
		this.maas = maas;
	}

	public Integer getYillikGetiri() {
		return yillikGetiri;
	}

	public void setYillikGetiri(Integer yillikGetiri) {
		this.yillikGetiri = yillikGetiri;
	}

	public MusteriAdres getAdres() {
		return adres;
	}

	public void setAdres(MusteriAdres adres) {
		this.adres = adres;
	}
}
