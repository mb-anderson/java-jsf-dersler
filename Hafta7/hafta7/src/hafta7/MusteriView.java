package hafta7;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class MusteriView {
	private Musteri musteri = new Musteri();
	private List<Musteri> liste = new ArrayList<Musteri>();
	private String kullaniciAdi;
	private String sifre;
	private String arama;


	public String getArama() {
		return arama;
	}

	public void setArama(String arama) {
		this.arama = arama;
	}

	public String giris() {
		if (kullaniciAdi.equalsIgnoreCase("Burak") && sifre.equalsIgnoreCase("mb1234")) {
			return "dogru";
		} else
			return "yanlis";
	}

	public void kaydet() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(musteri.getFakulte());
		en.persist(musteri.getUniversite());
		en.persist(musteri);
		en.getTransaction().commit();
		musteri = new Musteri();
	}
	public void ara() {
		musteri = new Musteri();
	}
	public void sil() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.remove(musteri);
		en.getTransaction().commit();
		musteri = new Musteri();
	}

	public void guncelle() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.merge(musteri);
		en.getTransaction().commit();
		musteri = new Musteri();
	}

	public List<Musteri> getKayitListesi() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("From Musteri").getResultList();

	}
	public List<Musteri> getKayitListesia() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("From Musteri where ad like :isim").setParameter("isim", arama).getResultList();

	}
	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri rezervasyon) {
		this.musteri = rezervasyon;
	}

	public List<Musteri> getListe() {
		return liste;
	}

	public void setListe(List<Musteri> liste) {
		this.liste = liste;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	
}
