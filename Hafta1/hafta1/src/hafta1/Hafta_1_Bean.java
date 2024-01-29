package hafta1;

public class Hafta_1_Bean {
private Hafta_1 hafta_1 = new Hafta_1();

public Hafta_1 getHafta_1() {
	return hafta_1;
}

public void setHafta_1(Hafta_1 hafta_1) {
	this.hafta_1 = hafta_1;
}

public void goster() {
	System.out.println(hafta_1.getAd());
	System.out.println(hafta_1.getSoyad());
	System.out.println(hafta_1.getYas());
}
}
