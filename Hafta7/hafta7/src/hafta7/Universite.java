package hafta7;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Universite {
	@Id
	@GeneratedValue
	private int id;
	private String fakulte_adi;
	private String universite_adi;
	@OneToOne
	private Musteri musteri;
	public Musteri getMusteri() {
		return musteri;
	}
	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFakulte_adi() {
		return fakulte_adi;
	}
	public void setFakulte_adi(String fakulte_adi) {
		this.fakulte_adi = fakulte_adi;
	}
	public String getUniversite_adi() {
		return universite_adi;
	}
	public void setUniversite_adi(String universite_adi) {
		this.universite_adi = universite_adi;
	}
	
}
