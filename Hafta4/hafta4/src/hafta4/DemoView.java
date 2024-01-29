package hafta4;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class DemoView {
	private Demo demo = new Demo();
	private List<Demo> listele = new ArrayList<Demo>();
	private String kullaniciAdi;
	private String sifre;

	public String giris() {
		if (kullaniciAdi.equals("Burak") && sifre.equals("12345"))
			return "dogru";
		else
			return "yanlis";
	}
	
	public void kaydet() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(demo);
		en.getTransaction().commit();
		demo = new Demo();
	}
	
	public void sil() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.remove(demo);
		en.getTransaction().commit();
		demo = new Demo();
	}
	
	public void duzenle() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.merge(demo);
		en.getTransaction().commit();
		demo = new Demo();
	}
	
	public List<Demo> getKayitListesi(){
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("from Demo").getResultList();
	}

	public Demo getDemo() {
		return demo;
	}

	public void setDemo(Demo demo) {
		this.demo = demo;
	}

	public List<Demo> getListele() {
		return listele;
	}

	public void setListele(List<Demo> listele) {
		this.listele = listele;
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
