package hafta5;

import javax.persistence.Transient;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Ogrenci {
	@Id
	@GeneratedValue
	private Long num;
	private String ad;
	private String soyad;
	private Long ogrenciNumarasi;
	@Embedded
	private KisiSayisi kisiSayisi;
	@Transient
	private String flag;
	@ManyToOne
	private Fakulte fakulte = new Fakulte();
	@OneToOne
	private Adres adres = new Adres();

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

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Long getOgrenciNumarasi() {
		return ogrenciNumarasi;
	}

	public void setOgrenciNumarasi(Long ogrenciNumarasi) {
		this.ogrenciNumarasi = ogrenciNumarasi;
	}

	public KisiSayisi getKisiSayisi() {
		return kisiSayisi;
	}

	public void setKisiSayisi(KisiSayisi kisiSayisi) {
		this.kisiSayisi = kisiSayisi;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Fakulte getFakulte() {
		return fakulte;
	}

	public void setFakulte(Fakulte fakulte) {
		this.fakulte = fakulte;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

}
