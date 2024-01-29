package hafta7;
import javax.persistence.Embeddable;

@Embeddable
public class AdresBilgileri {

	private String cadde;
	private String Sokak;

	public String getCadde() {
		return cadde;
	}

	public void setCadde(String cadde) {
		this.cadde = cadde;
	}

	public String getSokak() {
		return Sokak;

	}

	public void setSokak(String sokak) {
		Sokak = sokak;

	}

}

