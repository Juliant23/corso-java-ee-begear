package base;


public class TestaIlVerso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Cane c1 = new Oscar();
		Cane c2 = new Sky();
		
		Gatto g1 = new Mirtillo();
		Gatto g2 = new Saetta();
		
		Gallo gal1 = new Gallo();
		
		
		c1.faiIlVerso();
		c1.dimostraAffetto();
		
		c2.faiIlVerso();
		c2.dimostraAffetto();
		
		g1.faiIlVerso();
		g1.dimostraAffetto();
		
		g2.faiIlVerso();
		g2.dimostraAffetto();

		gal1.faiIlVerso();
	}

}
