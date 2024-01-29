import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Dersler {
	@Id
	@GeneratedValue
	private Long num;
	private String ad;

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

}
