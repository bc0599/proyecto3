package com.bcm.textadven;

public class Gustavo  extends JugadorDecorador{

	public Gustavo(RegularPlayer player) {
		super(player);
		// TODO Auto-generated constructor stub
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
		int playerhp=2000;
		String playerweapon = "Mecate, Canaima, Peine, Sapear";
		System.out.println("Vives en Virginia, una parte de la casa de la residencia. De vez en cuando explota.");
		System.out.println("HP="+playerhp);
		System.out.println("Arma:" + playerweapon);
		
		
	}
	
	public void mecate() {
		
		System.out.println("atacas a tu enemigo con un mecate.");
		
	}
	
	public void canaima() {
		
		System.out.println("atacas a tu enemigo con tu canaima.");
		
	}
	
	public void peine() {
		
		System.out.println("atacas a tu enemigo con tu peine.");
		
	}

	@Override
	public void playersapear() {
		// TODO Auto-generated method stub
		getPlayer().playersapear();
		System.out.print("carmen bota a tu enemigo");
		
		
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
