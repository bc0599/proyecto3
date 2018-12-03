/**
 * 
 */
package com.bcm.textadven;

/**
 * @author Betsabe
 *
 */
public class JugadorX implements RegularPlayer{

	/**
	 * 
	 * 
	 */
	private String nombre;
	
	 public JugadorX(String s) {
		// TODO Auto-generated constructor stub
		 nombre=s;
	}

	@Override
	public void coñazo() {
		
		System.out.println("le das un coñazo al enemigo.");
		
	}

	@Override
	public void huir() {
		// TODO Auto-generated method stub
		
		System.out.println("corres lejos del enemigo, ten cuidado.");
		
	}

	@Override
	public void recogercosas() {
		// TODO Auto-generated method stub
		System.out.println("Recogiste el elemento.");
		
	}

	@Override
	public void palyerprintsetup() {
		// TODO Auto-generated method stub

		
	}
	
	public void playersapear() { 
		System.out.println("sapeas a tu enemigo con Carmen.");

}

	

	@Override
	public void comandoinvalido() {
		// TODO Auto-generated method stub
		System.out.println("comando invalido.");
		
	}

	@Override
	public void iralpatio() {
		// TODO Auto-generated method stub
		System.out.println("estas en el patio.");

		
	}

	@Override
	public void iralcuarto() {
		// TODO Auto-generated method stub
 	   System.out.println("estas en tu cuarto.");
		
	}

	@Override
	public void iravirginia() {
		// TODO Auto-generated method stub
		System.out.println("estas en virginia.");

		
	}

	@Override
	public void iraalicia() {
		// TODO Auto-generated method stub
		System.out.println("estas en alicia");
		
		
	}

	@Override
	public void iralcuartodecarmen() {
		// TODO Auto-generated method stub
		
		System.out.println("estas en el cuarto de carmen.");
		
	}

	@Override
	public void iralestacionamiento() {
		// TODO Auto-generated method stub
       System.out.println("estas en el estacionamiento.");
		
	}

	@Override
	public void iralacocinachela() {
		// TODO Auto-generated method stub

		System.out.println("estas en el cocina de chela.");
		
	}

	@Override
	public void iralacocinacarmen() {
		// TODO Auto-generated method stub
	
		System.out.println("estas en la cocina de carmen.");
		
	}

	@Override
	public void domir() {
		// TODO Auto-generated method stub
		System.out.println("te vas a dormir, el dia termina");
		
	}

	@Override
	public void musica() {
		// TODO Auto-generated method stub
		System.out.println("pones musica a volumen normal.");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Actualmente es domingo en la noche, acabas de llegar de Ciudad Ojeda :)"
				+ "Tu objetivo es sobrevivir en la residencia una semana sin que te boten o te mate algun residente, suerte");
		
	}

	@Override
	public void subirvolumen() {
		// TODO Auto-generated method stub
		System.out.println("pones la cancion a todo volumen.");
		
	}

	@Override
	public void sentarsemesa() {
		// TODO Auto-generated method stub
		System.out.println("te sientas en la mesa junto con las demas personas.");
		
	}

	@Override
	public void verchela() {
		// TODO Auto-generated method stub
		System.out.println("ves a chela.");
	}

	@Override
	public void esperar() {
		// TODO Auto-generated method stub
		System.out.println("esperas que pase el peligro");
		
	}

	@Override
	public void playerhelpday1() {
		// TODO Auto-generated method stub
		System.out.print("Hoy es domingo,todas las puertas de la residencia estan cerradas, puedes ir a ");
		
	}

	@Override
	public void playerhelpday2() {
		// TODO Auto-generated method stub
		System.out.print("Hoy es lunes, puedes ir al  ");
		
	}

	@Override
	public void playerhelpday3() {
		// TODO Auto-generated method stub
		System.out.print("Hoy es martes, puedes ir a la  ");
		
	}

	@Override
	public void playerhelpday4() {
		// TODO Auto-generated method stub
		System.out.print("Hoy es miercoles,puedes ir a la  ");
		
	}

	@Override
	public void playerhelpday5() {
		// TODO Auto-generated method stub
		System.out.print("Hoy es jueves, el ultimo dia, puedes ir a  ");
		
		
	}

}
