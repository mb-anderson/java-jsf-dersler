package hafta2;

import java.util.ArrayList;
import java.util.List;

public class OgrenciBean {
	private Ogrenci ogrenci = new Ogrenci();
	private List<Ogrenci> liste = new ArrayList<Ogrenci>();

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	public void kaydet() {
		liste.add(ogrenci);
		ogrenci = new Ogrenci();

	}

	public void sil() {
		liste.remove(ogrenci);
		ogrenci = new Ogrenci();

	}

	public void guncelle() {
	}

	public void sec() {

	}

	public String giris() {
		if (ogrenci.getKullaniciAdi().equals("mali") && ogrenci.getSifre().equals("1234")) {
			return "DOGRU";
		}
		return "YANLIS";
	}

	public List<Ogrenci> getListe() {
		return liste;
	}

	public void setListe(List<Ogrenci> liste) {
		this.liste = liste;
	}
}
