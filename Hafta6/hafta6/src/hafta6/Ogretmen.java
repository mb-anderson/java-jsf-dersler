package hafta6;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("77")
public class Ogretmen extends Human {
	private Integer sicilNo;
	private String verilenDers;

	public Integer getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(Integer sicilNo) {
		this.sicilNo = sicilNo;
	}

	public String getVerilenDers() {
		return verilenDers;
	}

	public void setVerilenDers(String verilenDers) {
		this.verilenDers = verilenDers;
	}
}
