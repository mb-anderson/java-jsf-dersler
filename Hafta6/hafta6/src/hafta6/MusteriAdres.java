package hafta6;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class MusteriAdres {
	@Id
	@GeneratedValue
	private Long id;
	private String cadde;
	private String sokak;
	@OneToOne(mappedBy = "adres")
	private Musteri musteri;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCadde() {
		return cadde;
	}

	public void setCadde(String cadde) {
		this.cadde = cadde;
	}

	public String getSokak() {
		return sokak;
	}

	public void setSokak(String sokak) {
		this.sokak = sokak;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

}
