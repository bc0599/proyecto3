package com.bcm.textadven;

public class Boss {

    private static Boss Carmen;
    
    private Boss() {
        
    }
    
    public static Boss getInstance() {
    	
    	if(Carmen==null) {
    		Carmen=new Boss();
    	}
    	
    	return Carmen;
    }
    
    public static void deposito() {
    	
    	System.out.println("Carmen te aumenta el deposito, pierdes 5 HP.");
    	
    }
    
    public static void dolares() {
    	
    	System.out.println("Carmen pide dolares, tienes que llevarlos en efectivo.");
    }
    
    public static  void chela() {
    	
    	System.out.println("Carmen se distrae puteando a Chela.");
    	
    }
    
    public static void botaomen() {
    	
    	System.err.println("Carmen te bota de la residencia.");
    	System.err.println("GAME OVER.");
    	
    }
    
    public static void travesura() {
    	
    	System.out.println("Carmen te agarra en el cuarto de otro.");
    	
    }
    
	
}
