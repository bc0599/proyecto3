package com.bcm.textadven;

public class Persona {

	private Estado state;
	
	public void setEstado (Estado e) {
		
		this.state=e;
		
	}
	
	public void ejecutaraccion() {
		
		state.ejecutaraccion();
		
	}
	
}
