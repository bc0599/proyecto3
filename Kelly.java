package com.bcm.textadven;

public class Kelly extends JugadorDecorador {

	public Kelly(RegularPlayer player) {
		// TODO Auto-generated constructor stub
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
		System.out.println("Huyes como princesa de la escena");
		getPlayer().huir();
		
	}

	@Override
	public void recogercosas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void palyerprintsetup() {
		// TODO Auto-generated method stub
		int playerhp=1500;
		System.out.println("Vives en Alicia, una parte de la casa de la residencia. Las cucarachas podrian volarte en la cara.");
		String playerweapon = "Telefono, Drama, Llanto, Sapear ";
		System.out.println("HP="+playerhp);
		System.out.println("Arma:" + playerweapon);
		
	}

	@Override
	public void playersapear() {
		// TODO Auto-generated method stub
		getPlayer().playersapear();
		
	}

	public void telefono() {
		// TODO Auto-generated method stub
		System.out.println("atacas a tu enemigo con tu telefono.");
	}

	public void llanto() {
		
		System.out.println("empiezas a llorar.");
		
	}
	
	public void drama() {
		
		System.out.println("atacas a tu enemigo con tu drama y show");
		
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
		System.out.println("te acuestas en tus sabanas pinky.");
		getPlayer().domir();
		
	}

	@Override
	public void musica() {
		// TODO Auto-generated method stub
		getPlayer().musica();
		System.out.println("escuchas canciones de Justin Bieber.");
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
		System.out.println("al cuarto");
	}

	@Override
	public void playerhelpday2() {
		// TODO Auto-generated method stub
		getPlayer().playerhelpday2();
		System.out.println("al patio");
		
	}

	@Override
	public void playerhelpday3() {
		// TODO Auto-generated method stub
		getPlayer().playerhelpday3();
		System.out.println("cocina de chela.");
	}

	@Override
	public void playerhelpday4() {
		// TODO Auto-generated method stub
		
		getPlayer().playerhelpday4();
		System.out.println("cocina de carmen.");
		
	}

	@Override
	public void playerhelpday5() {
		// TODO Auto-generated method stub
		getPlayer().playerhelpday5();
		System.out.println("cuarto de carmen.");
		
	}

}
