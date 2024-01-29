package hafta6;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("33")
public class Ogrenci extends Human{
	private Integer ogrenciId;
	private String ders;

	public Integer getOgrenciId() {
		return ogrenciId;
	}

	public void setOgrenciId(Integer ogrenciId) {
		this.ogrenciId = ogrenciId;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}
}
