package com.bcm.textadven;

public class Diego extends JugadorDecorador {

	public Diego(RegularPlayer player) {
		super(player);
		
		
	}

	@Override
	public void coñazo() {
		// TODO Auto-generated method stub
		getPlayer().coñazo();
		
	}

	@Override
	public void huir() {
		// TODO Auto-generated method stub
		getPlayer().huir();
		
	}

	@Override
	public void recogercosas() {
		// TODO Auto-generated method stub
		getPlayer().recogercosas();
	}

	@Override
	public void palyerprintsetup() {
		// TODO Auto-generated method stub
		
		int playerhp=1000;
		String playerweapon = "Drama, Instastories, Guajiros, Sapear";
		System.out.println("Vives en Virginia, una parte de la casa de la residencia. De vez en cuando explota.");
		System.out.println("HP="+playerhp);
		System.out.println("Arma:" + playerweapon);

		
	}

	@Override
	public void playersapear() {
		// TODO Auto-generated method stub
		getPlayer().playersapear();
		System.out.print(" carmen te putea a ti porque te odia.");
		
		
	}


	

	public void drama() {
		System.out.println("atacas a tu enemigo con tu drama y show.");
	}
	
	public void guajiros() {
		
		System.out.println("mandas unos guajiros a matar a tu enemigo.");
	}
	
	public void instastories() {
		
		System.out.println("publicas un nude de tu enemigo en instagram.");
		
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
		System.out.println("bajas las escaleras y vas al patio, te ataca una rata mutante.");
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
		System.out.println("vas a alicia y ves a chela, la hermana de carmen.");
		
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
		System.out.println("pones cardi b.");
		
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
		System.out.println("chela no puede verte en alicia, si lo hace te sapeara con carmen.");
		
	}

	@Override
	public void esperar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerhelpday1() {
		// TODO Auto-generated method stub
		getPlayer().playerhelpday1();
		System.out.println("tu cuarto.");
		
	}

	@Override
	public void playerhelpday2() {
		// TODO Auto-generated method stub
		getPlayer().playerhelpday2();
		System.out.println("estacionamiento.");
		
	}

	@Override
	public void playerhelpday3() {
		// TODO Auto-generated method stub
		System.out.println("cocina de chela.");
		
	}

	@Override
	public void playerhelpday4() {
		// TODO Auto-generated method stub
		System.out.println("cocina de carmen.");
		
	}

	@Override
	public void playerhelpday5() {
		// TODO Auto-generated method stub
		System.out.println("cuarto de carmen.");
		
	}

}
