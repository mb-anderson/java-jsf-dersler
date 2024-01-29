package hafta7;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "musteri")
public class Musteri implements Serializable {
	@Id
	@GeneratedValue
	private int ID;
	private String ad;
	private String soyad;
	private String cinsiyet;
	private int yas;
	private String sehir;
	private String otel;
	private String odaTipi;
	@Embedded
	private AdresBilgileri adres = new AdresBilgileri();
	@OneToOne
	private Fakulte fakulte = new Fakulte();
	@OneToOne
	private Universite universite = new Universite();
	public AdresBilgileri getAdres() {
		return adres;
	}

	public void setAdres(AdresBilgileri adres) {
		this.adres = adres;
	}

	public Fakulte getFakulte() {
		return fakulte;
	}

	public void setFakulte(Fakulte fakulte) {
		this.fakulte = fakulte;
	}

	public Universite getUniversite() {
		return universite;
	}

	public void setUniversite(Universite universite) {
		this.universite = universite;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public String getOtel() {
		return otel;
	}

	public void setOtel(String otel) {
		this.otel = otel;
	}

	public String getOdaTipi() {
		return odaTipi;
	}

	public void setOdaTipi(String odaTipi) {
		this.odaTipi = odaTipi;
	}

}
