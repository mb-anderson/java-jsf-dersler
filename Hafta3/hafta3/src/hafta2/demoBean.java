package hafta2;

import java.util.ArrayList;
import java.util.List;

public class demoBean {
	private Demo demo = new Demo();

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

	private List<Demo> listele = new ArrayList<Demo>();

	public void kaydet() {
		listele.add(demo);
		demo = new Demo();
	}

}
