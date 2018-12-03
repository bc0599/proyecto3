package com.bcm.textadven;

public class Mariney extends JugadorDecorador {

	public Mariney(RegularPlayer player) {
		super(player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void coñazo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void huir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recogercosas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void palyerprintsetup() {
		// TODO Auto-generated method stub
		int playerhp=700;
		System.out.println("Vives en Alicia, una parte de la casa de la residencia. Las cucarachas podrian volarte en la cara.");
		String playerweapon = "Paso mariney, DSM5, Arepas, Sapear";
		System.out.println("HP="+playerhp);
		System.out.println("Arma:" + playerweapon);
		
	}

	@Override
	public void playersapear() {
		// TODO Auto-generated method stub
		System.out.print(" carmen te putea a ti porque te odia");
		getPlayer().playersapear();
		
	}
	public void pasomariney() {
		// TODO Auto-generated method stub
		System.out.println("atacas a tu enemigo con el paso mariney, una combinacion de neymar con bachata.");
		
	}
	
	public void DSM5() {
		
		System.out.println("atacas a tu enemigo con tu DSM5.");
		
	}
	
	public void arepas() {
		
		System.out.println("atacar a tu enemigo con arepas duras.");
		
	}

	@Override
	public void comandoinvalido() {
		// TODO Auto-generated method stub
		getPlayer().comandoinvalido();
	}

	@Override
	public void iralpatio() {
		// TODO Auto-generated method stub
		getPlayer().iralpatio();
	}

	@Override
	public void iralcuarto() {
		// TODO Auto-generated method stub
		getPlayer().iralcuarto();
	}

	@Override
	public void iravirginia() {
		// TODO Auto-generated method stub
		getPlayer().iravirginia();
	}

	@Override
	public void iraalicia() {
		// TODO Auto-generated method stub
		getPlayer().iraalicia();
	}

	@Override
	public void iralcuartodecarmen() {
		// TODO Auto-generated method stub
		getPlayer().iralcuartodecarmen();
	}

	@Override
	public void iralestacionamiento() {
		// TODO Auto-generated method stub
		getPlayer().iralestacionamiento();
	}

	@Override
	public void iralacocinachela() {
		// TODO Auto-generated method stub
		getPlayer().iralacocinachela();
	}

	@Override
	public void iralacocinacarmen() {
		// TODO Auto-generated method stub
		getPlayer().iralacocinacarmen();
	}

	@Override
	public void domir() {
		// TODO Auto-generated method stub
		getPlayer().domir();
	}

	@Override
	public void musica() {
		// TODO Auto-generated method stub
		getPlayer().musica();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		getPlayer().start();
	}

	@Override
	public void subirvolumen() {
		// TODO Auto-generated method stub
		getPlayer().subirvolumen();
	}

	@Override
	public void sentarsemesa() {
		// TODO Auto-generated method stub
		getPlayer().sentarsemesa();
	}

	@Override
	public void verchela() {
		// TODO Auto-generated method stub
		getPlayer().verchela();
	}

	@Override
	public void esperar() {
		// TODO Auto-generated method stub
		getPlayer().esperar();
		
	}

	@Override
	public void playerhelpday1() {
		// TODO Auto-generated method stub
		getPlayer().playerhelpday1();
		
	}

	@Override
	public void playerhelpday2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerhelpday3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerhelpday4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerhelpday5() {
		// TODO Auto-generated method stub
		
	}
	
	

}
