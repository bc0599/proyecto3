package com.bcm.textadven;

public abstract class JugadorDecorador implements RegularPlayer {
	
	private RegularPlayer player;

	public JugadorDecorador(RegularPlayer player) {
		// TODO Auto-generated constructor stub
		this.player=player;
	}
	
	protected RegularPlayer getPlayer() {
		return player;
	}

}
