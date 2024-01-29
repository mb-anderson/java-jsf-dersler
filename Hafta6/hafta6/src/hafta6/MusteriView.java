package hafta6;

import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class MusteriView {
	private Musteri musteri = new Musteri();
	private String musteriAd;
	private String musteriSoyad;
	private Integer deger;

	public void kaydet() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(musteri.getAdres());
		en.persist(musteri);
		en.getTransaction().commit();
		musteri = new Musteri();
	}

	public List<Object[]> getListeNamedQuery() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createNamedQuery("AdGelsin").setParameter("isim", this.musteriAd).getResultList();
	}

	public List<Object[]> getListe() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("select m, ma from Musteri m join m.adres ma").getResultList();
	}

	public List<Object[]> getListeAra() {
		EntityManager en = EntityUtil.getEntityManager();
		return en
				.createQuery("select m, ma from Musteri m join m.adres ma where "
						+ "ad like :isim and soyad like :soyad and maas > :deger")
				.setParameter("isim", this.musteriAd + "%").setParameter("soyad", this.musteriSoyad + "%")
				.setParameter("deger", this.deger).getResultList();
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public String getMusteriAd() {
		return musteriAd;
	}

	public void setMusteriAd(String musteriAd) {
		this.musteriAd = musteriAd;
	}

	public String getMusteriSoyad() {
		return musteriSoyad;
	}

	public void setMusteriSoyad(String musteriSoyad) {
		this.musteriSoyad = musteriSoyad;
	}

	public Integer getDeger() {
		return deger;
	}

	public void setDeger(Integer deger) {
		this.deger = deger;
	}
}
