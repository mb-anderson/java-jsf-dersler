package hafta6;

import java.util.List;

import javax.faces.component.html.HtmlInputText;
import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class HumanBean {
	private String adi;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public HtmlInputText getAdDegeri() {
		return adDegeri;
	}

	public void setAdDegeri(HtmlInputText adDegeri) {
		this.adDegeri = adDegeri;
	}

	private HtmlInputText adDegeri;

	public void kaydet2() {
		System.out.println(adi);
		System.out.println(adDegeri.getValue());
		adDegeri.setDisabled(true);
	}

	public List<Human> getHumanList() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("from hafta6.Human").getResultList();
	}

	public List<Ogrenci> getOgrenciList() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("from hafta6.Ogrenci").getResultList();
	}

	public List<Ogretmen> getOgretmenList() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("from hafta6.Ogretmen").getResultList();
	}
	
	public List<Okul> getOkulList() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("from hafta6.Okul").getResultList();
	}

	public void kaydet() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setAd("Adana");
		ogrenci.setDers("Java");
		ogrenci.setOgrenciId(123);
		ogrenci.setSoyad("Kozan");
		en.persist(ogrenci);
		Ogretmen ogretmen = new Ogretmen();
		ogretmen.setAd("Sinan");
		ogretmen.setSicilNo(12345);
		ogretmen.setSoyad("TOKLU");
		ogretmen.setVerilenDers("Kurumsal JAVA");
		en.persist(ogretmen);
		Okul okul = new Okul();
		okul.setAd("Gazi");
		okul.setOkulAdi("Gazi Universitesi");
		okul.setSehir("Ankara");
		okul.setSoyad("Cankaya");
		en.persist(okul);
		en.getTransaction().commit();
	}
}
