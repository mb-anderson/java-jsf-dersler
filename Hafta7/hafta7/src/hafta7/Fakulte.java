package hafta7;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity

public class Fakulte {
	@Id
	@GeneratedValue
	private int id;
	private String fakulte_adi;
	private String bolum_adi;
	@OneToOne
	private Musteri musteri;
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
	public String getBolum_adi() {
		return bolum_adi;
	}
	public void setBolum_adi(String bolum_adi) {
		this.bolum_adi = bolum_adi;
	}
	
}
