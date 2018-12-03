package com.bcm.textadven;

import java.util.Random;
import java.util.Scanner;


public class Maiiiiiin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona=new Persona();
		
		NewGame game= new NewGame();
		
		Muerte muerte= new Muerte();
		
		Muriendo muriendo= new Muriendo();
		
		RegularPlayer player=new JugadorX("Diego");
		player=new Diego(player);
		
		RegularPlayer player1=new JugadorX("La Kenyeli");
		player1=new Kelly(player1);
		
		RegularPlayer player2=new JugadorX("Mariney");
		player2=new Mariney(player2);
		
		RegularPlayer player3=new JugadorX("Gustavo");
		player3=new Gustavo(player3);
		
		Boss carmen=Boss.getInstance();
		
		System.out.print("Eres un estudiante foraneo, desesperado por encontrar residencia");
		System.out.println(" encontraste la residencia Carmen Adela, y debido a que eres un iluso pagaste el trimestre completo.");
		System.out.println(" Un grave, muy grave error");

		Scanner c=new Scanner(System.in);		
		
		String comando;
		
		persona.setEstado(game);
		persona.ejecutaraccion();

		System.out.println("Elige tu personaje: Diego, La Kenyeli");
		
		comando=c.nextLine();
		
		if(comando.contains("Diego")) {

			int playerhp=2000;
			int bosshp=100;
			
			player.palyerprintsetup();
			comando=c.nextLine();
			
			if(comando.contains("continuar")) {
				
				player.start();
				
				comando=c.nextLine();
				
				if(comando.contains("ayuda")) {
					
					player.playerhelpday1();
					comando=c.nextLine();
					
				}
				
				if(comando.contains("ir al cuarto")) {
					
					player.iralcuarto();
					comando=c.nextLine();
					
					if(comando.contains("dormir")) {
						
						player.domir();
						comando=c.nextLine();
						
						if(comando.contains("siguiente dia")) {
							
							comando=c.nextLine();
							
							if(comando.contains("ayuda")) {
								
								player.playerhelpday2();
								comando=c.nextLine();
								
								if(comando.contains("ir al estacionamiento")) {
									
									player.iralestacionamiento();
									System.out.println("te sientas en la mesita a pensar, pero de repente llega carmen y te llama.");
									comando=c.nextLine();
									
									if(comando.contains("ir con carmen")) {
										
										player.iralcuartodecarmen();
										Boss.dolares();
										comando=c.nextLine();
										
										if(comando.contains("coñacear")) {
											
											player.coñazo();
											Boss.botaomen();
											comando=c.nextLine();
											
										}
										
                                        if(comando.contains("atacar con drama")) {
											
											((Diego) player).drama();
											System.out.println("Carmen no le importa tu drama, te cobrara los dolares y eres pobre.");

											comando=c.nextLine();
											
											if(comando.contains("negarse")) {
												
												Boss.botaomen();
												
												
											}
											else {
												
												Boss.botaomen();
											}
                                        }
											
										if(comando.contains("atacar con instastories")) {
											
											do {
											
											  ((Diego) player).instastories();
											  System.out.println("Carmen se arrecha y te ataca con su joroba");
											  Random aleatorio = new Random(System.currentTimeMillis());
											  // Producir nuevo int aleatorio entre 0 y 99
											  int intAleatorio = aleatorio.nextInt(100);
											  int intAleatorio2=aleatorio.nextInt(10);

											  playerhp=playerhp-intAleatorio;
											  System.out.println("HP="+playerhp);
											  bosshp=bosshp-intAleatorio2;
											  System.out.println("Carmen HP="+bosshp);
											
											  if(playerhp==0) {
												
												persona.setEstado(muerte);
												persona.ejecutaraccion();
												Boss.botaomen();
												
											}
											
											  if(playerhp==10) {
												
												persona.setEstado(muriendo);
												persona.ejecutaraccion();
											}
											
											
											  if(bosshp<=0) {
												
												System.out.println("has derrotado a carmen esta vez, pero volvera.");
												
											}
											  comando=c.nextLine();
											
											
											}while(comando.contains("seguir atacando"));
											
											if(comando.contains("huir")) {
												
												player.huir();
												comando=c.nextLine();
												
												if(comando.contains("ir al cuarto")) {
													
													player.iralcuarto();
													comando=c.nextLine();
													
													if(comando.contains("musica")) {
														
														player.musica();
														comando=c.nextLine();
														
														if(comando.contains("dormir")) {
															
															player.domir();
															comando=c.nextLine();
															
															if(comando.contains("siguiente dia")) {
																comando=c.nextLine();
																
																if(comando.contains("ayuda")) {
																	
																	player.playerhelpday3();
																	comando=c.nextLine();
																	
                                                                    if(comando.contains("ir a la cocina de chela")) {
																		
																		player.iralacocinachela();
																		comando=c.nextLine();
																		
																		if(comando.contains("robar la nevera")) {
																			
																			System.out.println("Abres la nevera y te robas los aguacates.");
																			System.out.println("Chela te ve.");
																			comando=c.nextLine();
																			
																			if(comando.contains("atacar con instatories")) {
																				
																				int chelahp=175;
																
																					do {
																					
																					  ((Diego) player).instastories();
																					  System.out.println("Chela se arrecha y te ataca con su tablet.");
																					  Random aleatorio = new Random(System.currentTimeMillis());
																					  // Producir nuevo int aleatorio entre 0 y 99
																					  int intAleatorio = aleatorio.nextInt(200);
																					  int intAleatorio2=aleatorio.nextInt();
																					  playerhp=playerhp-intAleatorio;
																					  System.out.println("HP="+playerhp);
																					  chelahp=bosshp-intAleatorio2;
																					  System.out.println("Chela HP="+chelahp);
																					
																					  if(playerhp==0) {
																						
																						persona.setEstado(muerte);
																						persona.ejecutaraccion();
																						Boss.botaomen();
																						
																					}
																					
																					  if(playerhp==10) {
																						
																						persona.setEstado(muriendo);
																						persona.ejecutaraccion();
																					}
																					
																					
																					  if(chelahp<=0) {
																						
																						System.out.println("has derrotado a chela esta vez, pero volvera.");
																						
																					}
																					  comando=c.nextLine();
																					
																					
																					}while(comando.contains("seguir atacando"));
																					
																					if(comando.contains("huir")) {
																						
																						player.huir();
																						comando=c.nextLine();
																						
																						if(comando.contains("ir al cuarto")) {
																							
																							player.iralcuarto();
																							comando=c.nextLine();
																							
																							if(comando.contains("musica")) {
																								
																								player.musica();
																								comando=c.nextLine();
																								
																								if(comando.contains("subir volumen")) {
																									
																									player.subirvolumen();
																									System.out.println("leoner odia tu musica, te tira una cachapa");
																									playerhp=playerhp-5;
																									comando=c.nextLine();
																									
																									if(comando.contains("coñazo")) {
																										
																										int leonerhp=200;
																										
																										do {
																										
																										  player.coñazo();
																										  System.out.println("le das un coñazo a leoner pero eres muy debil.");
																									
																								     	  leonerhp=leonerhp-20;
																										  System.out.println("Leoner HP="+leonerhp);
																										  System.out.println("HP="+playerhp);
																										
																										  if(playerhp==0) {
																											
																											persona.setEstado(muerte);
																											persona.ejecutaraccion();
																											Boss.botaomen();
																											
																										}
																										
																										  if(playerhp==10) {
																											
																											persona.setEstado(muriendo);
																											persona.ejecutaraccion();
																										}
																										
																										  if(leonerhp<=0) {
																											
																											System.out.println("has derrotado a tu enemigo.");
																											
																										}
																					
																										  comando=c.nextLine();
																										
																										}while(comando.contains("seguir atacando"));
																										
																										if(comando.contains("huir")) {
																											
																											player.huir();
																											comando=c.nextLine();
																											
																											if(comando.contains("ir al cuarto")) {
																												
																												player.iralcuarto();
																												comando=c.nextLine();
																												
																												if(comando.contains("dormir")) {
																													
																													player.domir();
																													comando=c.nextLine();
																													if(comando.contains("siguiente dia")) {
																														
																														comando=c.nextLine();
																														if(comando.contains("ayuda")){
																															
																															player.playerhelpday4();
																															comando=c.nextLine();
																															
                                                                                                                            if(comando.contains("ir a la cocina de carmen")){
																														    	
																														    	player.iralacocinacarmen();
																														    	comando=c.nextLine();
																														    	if(comando.contains("robar chocolates de la nevera")) {
																														    		
																														    		System.out.println("Mientras robas los chocolates Carmen te ve. Te tira una chancleta");
																														    		comando=c.nextLine();
																														    	}
																														    	
																																if(comando.contains("atacar con instastories")) {
																																	
																																	bosshp=500;
																																	
																																	do {
																																	
																																	  ((Diego) player).instastories();
																																	  Boss.deposito();
																																	  playerhp=playerhp-50;
																																	  System.out.println("HP="+playerhp);
																																	  bosshp=bosshp-70;
																																	  System.out.println("Carmen HP="+bosshp);
																																	
																																	  if(playerhp==0) {
																																		
																																		persona.setEstado(muerte);
																																		persona.ejecutaraccion();
																																		Boss.botaomen();
																																		
																																	}
																																	
																																	  if(playerhp==10) {
																																		
																																		persona.setEstado(muriendo);
																																		persona.ejecutaraccion();
																																	}
																																	
																																	
																																	  if(bosshp==0) {
																																		
																																		System.out.println("has derrotado a carmen esta vez, pero volvera.");
																																		
																																	}
																																	  comando=c.nextLine();
																																	
																																	
																																	}while(comando.contains("seguir atacando"));
																																	
																																	if(comando.contains("huir")) {
																																		
																																		player.huir();
																																		comando=c.nextLine();
																																		
																																		if(comando.contains("ir al cuarto")) {
																																			
																																			player.iralcuarto();
																																			comando=c.nextLine();
																																			
																																			if(comando.contains("musica")) {
																																				
																																				player.musica();
																																				comando=c.nextLine();
																																				
																																				if(comando.contains("subir volumen")) {
																																					
																																					player.subirvolumen();
																																					System.out.println("rafa odia tu musica, te tira un yesquero");
																																					playerhp=playerhp-5;
																																					comando=c.nextLine();
																																					
																																					if(comando.contains("coñazo")) {
																																						
																																						int rafahp=100;
																																						
																																						do {
																																						
																																						  player.coñazo();
																																						  System.out.println("le das un coñazo a rafa pero eres muy debil.");
																																					
																																						  rafahp=rafahp-2;
																																						  System.out.println("Rafa HP="+rafahp);
																																						  System.out.println("HP="+playerhp);
																																						
																																						  if(playerhp==0) {
																																							
																																							persona.setEstado(muerte);
																																							persona.ejecutaraccion();
																																							Boss.botaomen();
																																							
																																						}
																																						
																																						  if(playerhp==10) {
																																							
																																							persona.setEstado(muriendo);
																																							persona.ejecutaraccion();
																																						}
																																						
																																						  if(rafahp==0) {
																																							
																																							System.out.println("has derrotado a tu enemigo.");
																																							
																																						}
																																	
																																						  comando=c.nextLine();
																																						
																																		 				}while(comando.contains("seguir atacando"));
																																						
																																						if(comando.contains("huir")) {
																																							
																																							player.huir();
																																							comando=c.nextLine();
																																							
																																							if(comando.contains("ir al cuarto")) {
																																								
																																								player.iralcuarto();
																																								comando=c.nextLine();
																																								
																																								if(comando.contains("dormir")) {
																																									
																																									player.domir();
																																			
																																									System.out.println("se acabo el dia.");
																																									comando=c.nextLine();
																																									
																																									if(comando.contains("siguiente dia")) {
																																										
																																										comando=c.nextLine();
																																										
																																										if(comando.contains("ayuda")) {
																																											
																																											player.playerhelpday5();
																																											comando=c.nextLine();
																																											
																																											if(comando.contains("ir al cuarto de carmen")) {
																																												
																																												player.iralcuartodecarmen();
																																												comando=c.nextLine();
																																												
																																												if(comando.contains("atacar con instastories")) {
																																												
																																												   bosshp+=1300;
																																												   Boss.dolares();
																																												   do {
																																												        Random aleatorio = new Random(System.currentTimeMillis());
																																											
																																												        int intAleatorio = aleatorio.nextInt(300);
																																												        int intAleatorio2=aleatorio.nextInt(150);
																																												      
																																												        playerhp=playerhp-intAleatorio;
																																												        bosshp=bosshp-intAleatorio2;
																																												
																																												        System.out.println("HP="+playerhp);
																																												        System.out.println("Carmen HP=" +bosshp);
																																												
																																												        if(playerhp==0) {
																																													
																																													     persona.setEstado(muerte);
																																													     persona.ejecutaraccion();
																																													     Boss.botaomen();
																																													
																																												}
																																												
																																												        if(playerhp==10) {
																																													
																																													     persona.setEstado(muriendo);
																																													     persona.ejecutaraccion();
																																												}
																																												
																																												
																																												        if(bosshp<=0) {
																																													
																																													     System.out.println("CARMEN WILL RETURN.");
																																													
																																												}
																																												
																																												
																																												        comando=c.nextLine();
																																												
																																												}while(comando.contains("seguir atacando"));
																																												
																																												
																																											}
																																												if(comando.contains("atacar con drama")) {
																																													
																																													   bosshp+=1000;
																																													   
																																													   do {
																																														   Boss.chela();
																																													       Random aleatorio = new Random(System.currentTimeMillis());
																																												
																																													        int intAleatorio = aleatorio.nextInt(200);
																																													        int intAleatorio2=aleatorio.nextInt(100);
																																													      
																																													        playerhp=playerhp-intAleatorio;
																																													        bosshp=bosshp-intAleatorio2;
																																													
																																													        System.out.println("HP="+playerhp);
																																													        System.out.println("Carmen HP=" +bosshp);
																																													
																																													        if(playerhp==0) {
																																														
																																														     persona.setEstado(muerte);
																																														     persona.ejecutaraccion();
																																														     Boss.botaomen();
																																														
																																													}
																																													
																																													        if(playerhp==10) {
																																														
																																														     persona.setEstado(muriendo);
																																														     persona.ejecutaraccion();
																																													}
																																													
																																													
																																													        if(bosshp<=0) {
																																														
																																														     System.out.println("CARMEN WILL RETURN.");
																																														
																																													}
																																													
																																													
																																													        comando=c.nextLine();
																																													
																																													}while(comando.contains("seguir atacando"));
																																													
																																													
																																												}
																																												
																																												if(comando.contains("mandar camion de guajiros")) {
																																													
																																													do {
																																														  Boss.deposito();
																																													      Random aleatorio = new Random(System.currentTimeMillis());
																																												
																																													      int intAleatorio = aleatorio.nextInt(300);
																																													      int intAleatorio2=aleatorio.nextInt(100);
																																													      
																																													      playerhp=playerhp-intAleatorio;
																																													      bosshp=bosshp-intAleatorio2;
																																													
																																													      System.out.println("HP="+playerhp);
																																													      System.out.println("Carmen HP=" +bosshp);
																																													
																																													      if(playerhp==0) {
																																														
																																														     persona.setEstado(muerte);
																																														     persona.ejecutaraccion();
																																														     Boss.botaomen();
																																														
																																													}
																																													
																																													      if(playerhp==10) {
																																														
																																														     persona.setEstado(muriendo);
																																														     persona.ejecutaraccion();
																																													}
																																													
																																													
																																													      if(bosshp<=0) {
																																														
																																														     System.out.println("CARMEN WILL RETURN.");
																																														
																																													}
																																													
																																													
																																													      comando=c.nextLine();
																																													
																																													}while(comando.contains("seguir atacando"));
																																													
																																									
																																													
																																												}
																																											}
																																											
																																										}
																																										
																																									}
																																									
																																								}
																																								
																																							}
																																							
																																						}
																																						
																																					}
																																					


																																				}
																																				
																																			}
																																			
																																		}
																																	}
																																}
																														    }
																															
																															
																														}
																														
																													}
																													
																												}
																												
																											}
																											
																										}
																										
																									}
																									


																								}
																								
																							}
																							
																						}
																					}
																				}
																				
																			}
																			
																			
																		}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if(comando.contains("La Kenyeli")) {

			int playerhp=1500;
			int bosshp=100;
			
			player1.palyerprintsetup();
			comando=c.nextLine();
			
			if(comando.contains("continuar")) {
				
				player1.start();
				
				comando=c.nextLine();
				
				if(comando.contains("ayuda")) {
					
					player1.playerhelpday1();
					comando=c.nextLine();
					
				}
				
				if(comando.contains("ir al cuarto")) {
					
					player1.iralcuarto();
					comando=c.nextLine();
					
					if(comando.contains("dormir")) {
						
						player1.domir();
						comando=c.nextLine();
						
						if(comando.contains("siguiente dia")) {
							
							comando=c.nextLine();
							
							if(comando.contains("ayuda")) {
								
								player1.playerhelpday2();
								comando=c.nextLine();
								
								if(comando.contains("ir al patio")) {
									
									player1.iralestacionamiento();
									System.out.println("te sientas en la mesita a pensar, pero de repente llega carmen y te llama.");
									comando=c.nextLine();
									
									if(comando.contains("ir con carmen")) {
										
										player1.iralcuartodecarmen();
										Boss.dolares();
										comando=c.nextLine();
										
										if(comando.contains("llorar")) {
											
											((Kelly) player1).llanto();
											System.out.println("Carmen no tiene guarderia, odia a los llorones");
											Boss.botaomen();
											comando=c.nextLine();
											
										}
										
                                        if(comando.contains("atacar con drama")) {
											
											((Kelly) player1).drama();
											System.out.println("Carmen no le importa tu drama, te cobrara los dolares y eres pobre.");

											comando=c.nextLine();
											
											if(comando.contains("negarse")) {
												
												Boss.botaomen();
												
												
											}
											else {
												
												Boss.botaomen();
											}
                                        }
											
										if(comando.contains("atacar con el telefono")) {
											
											do {
											
											  ((Kelly) player1).telefono();
											  System.out.println("Carmen se arrecha y te ataca con su joroba");
											  Random aleatorio = new Random(System.currentTimeMillis());
											  // Producir nuevo int aleatorio entre 0 y 99
											  int intAleatorio = aleatorio.nextInt(100);
											  int intAleatorio2=aleatorio.nextInt(100);

											  playerhp=playerhp-intAleatorio;
											  System.out.println("HP="+playerhp);
											  bosshp=bosshp-intAleatorio2;
											  System.out.println("Carmen HP="+bosshp);
											
											  if(playerhp==0) {
												
												  persona.setEstado(muerte);
												  persona.ejecutaraccion();
												  Boss.botaomen();
												
											}
											
											  if(playerhp==10) {
												
												  persona.setEstado(muriendo);
												  persona.ejecutaraccion();
											}
											
											
											  if(bosshp<=0) {
												
												  System.out.println("has derrotado a carmen esta vez, pero volvera.");
												
											}
											  comando=c.nextLine();
											
											
											}while(comando.contains("seguir atacando"));
											
											if(comando.contains("huir")) {
												
												player1.huir();
												comando=c.nextLine();
												
												if(comando.contains("ir al cuarto")) {
													
													player1.iralcuarto();
													comando=c.nextLine();
													
													if(comando.contains("musica")) {
														
														player1.musica();
														comando=c.nextLine();
														
														if(comando.contains("dormir")) {
															
															player1.domir();
															comando=c.nextLine();
															
															if(comando.contains("siguiente dia")) {
																comando=c.nextLine();
																
																if(comando.contains("ayuda")) {
																	
																	player.playerhelpday3();
																	comando=c.nextLine();
																	
                                                                    if(comando.contains("ir a la cocina de chela")) {
																		
																		player1.iralacocinachela();
																		comando=c.nextLine();
																		
																		if(comando.contains("robar la nevera")) {
																			
																			System.out.println("Abres la nevera y te robas los aguacates.");
																			System.out.println("Chela te ve.");
																			comando=c.nextLine();
																			
																			if(comando.contains("atacar con drama")) {
																				
																				int chelahp=175;
																
																					do {
																					
																					  ((Kelly) player1).drama();
																					  System.out.println("Chela se arrecha y te ataca con su tablet.");
																					  Random aleatorio = new Random(System.currentTimeMillis());
																					  // Producir nuevo int aleatorio entre 0 y 99
																					  int intAleatorio = aleatorio.nextInt(200);
																					  int intAleatorio2=aleatorio.nextInt();
																					  playerhp=playerhp-intAleatorio;
																					  System.out.println("HP="+playerhp);
																					  chelahp=bosshp-intAleatorio2;
																					  System.out.println("Chela HP="+chelahp);
																					
																					  if(playerhp==0) {
																						
																						persona.setEstado(muerte);
																						persona.ejecutaraccion();
																						Boss.botaomen();
																						
																					}
																					
																					  if(playerhp==10) {
																						
																						persona.setEstado(muriendo);
																						persona.ejecutaraccion();
																					}
																					
																					
																					  if(chelahp<=0) {
																						
																						System.out.println("has derrotado a chela esta vez, pero volvera.");
																						
																					}
																					  comando=c.nextLine();
																					
																					
																					}while(comando.contains("seguir atacando"));
																					
																					if(comando.contains("huir")) {
																						
																						player1.huir();
																						comando=c.nextLine();
																						
																						if(comando.contains("ir al cuarto")) {
																							
																							player1.iralcuarto();
																							comando=c.nextLine();
																							
																							if(comando.contains("musica")) {
																								
																								player1.musica();
																								comando=c.nextLine();
																								
																								if(comando.contains("subir volumen")) {
																									
																									player1.subirvolumen();
																									System.out.println("mariney odia tu musica, te tira una arepa");
																									playerhp=playerhp-5;
																									comando=c.nextLine();
																									
																									if(comando.contains("coñazo")) {
																										
																										int leonerhp=200;
																										
																										do {
																										
																										  player1.coñazo();
																										  System.out.println("le das un coñazo a mariney pero eres muy debil.");
																									
																										  leonerhp=leonerhp-20;
																										  System.out.println("Mariney HP="+leonerhp);
																										  System.out.println("HP="+playerhp);
																										
																										  if(playerhp==0) {
																											
																											persona.setEstado(muerte);
																											persona.ejecutaraccion();
																											Boss.botaomen();
																											
																										}
																										
																										  if(playerhp==10) {
																											
																											persona.setEstado(muriendo);
																											persona.ejecutaraccion();
																										}
																										
																										  if(leonerhp<=0) {
																											
																											System.out.println("has derrotado a tu enemigo.");
																											
																										}
																					
																										  comando=c.nextLine();
																										
																										}while(comando.contains("seguir atacando"));
																										
																										if(comando.contains("huir")) {
																											
																											player1.huir();
																											comando=c.nextLine();
																											
																											if(comando.contains("ir al cuarto")) {
																												
																												player1.iralcuarto();
																												comando=c.nextLine();
																												
																												if(comando.contains("dormir")) {
																													
																													player1.domir();
																													comando=c.nextLine();
																													if(comando.contains("siguiente dia")) {
																														
																														comando=c.nextLine();
																														if(comando.contains("ayuda")){
																															
																															player1.playerhelpday4();
																															comando=c.nextLine();
																															
                                                                                                                            if(comando.contains("ir a la cocina de carmen")){
																														    	
																														    	player.iralacocinacarmen();
																														    	comando=c.nextLine();
																														    	if(comando.contains("robar cafe de la nevera")) {
																														    		
																														    		System.out.println("Mientras robas el cafe Carmen te ve. Te tira una cucaracha.");
																														    		comando=c.nextLine();
																														    	}
																														    	
																																if(comando.contains("atacar con telefono")) {
																																	
																																	bosshp=500;
																																	
																																	do {
																																	
																																	  ((Kelly) player1).telefono();
																																	  Boss.deposito();
																																	  playerhp=playerhp-50;
																																	  System.out.println("HP="+playerhp);
																																	  bosshp=bosshp-70;
																																	  System.out.println("Carmen HP="+bosshp);
																																	
																																	  if(playerhp==0) {
																																		
																																		persona.setEstado(muerte);
																																		persona.ejecutaraccion();
																																		Boss.botaomen();
																																		
																																	}
																																	
																																	  if(playerhp==10) {
																																		
																																		persona.setEstado(muriendo);
																																		persona.ejecutaraccion();
																																	}
																																	
																																	
																																	  if(bosshp<=0) {
																																		
																																		System.out.println("has derrotado a carmen esta vez, pero volvera.");
																																		
																																	}
																																	  comando=c.nextLine();
																																	
																																	
																																	}while(comando.contains("seguir atacando"));
																																	
																																	if(comando.contains("huir")) {
																																		
																																		player1.huir();
																																		comando=c.nextLine();
																																		
																																		if(comando.contains("ir al cuarto")) {
																																			
																																			player.iralcuarto();
																																			comando=c.nextLine();
																																			
																																			if(comando.contains("musica")) {
																																				
																																				player1.musica();
																																				comando=c.nextLine();
																																				
																																				if(comando.contains("subir volumen")) {
																																					
																																					player1.subirvolumen();
																																					System.out.println(" Emmanuel odia tu musica, te tira un yesquero");
																																					playerhp=playerhp-5;
																																					comando=c.nextLine();
																																					
																																					if(comando.contains("coñazo")) {
																																						
																																						int rafahp=100;
																																						
																																						do {
																																						
																																						  player1.coñazo();
																																						  System.out.println("le das un coñazo a Emmanuel pero eres muy debil.");
																																					
																																						  rafahp=rafahp-2;
																																						  System.out.println("Emmanuel HP="+rafahp);
																																						  System.out.println("HP="+playerhp);
																																						
																																						  if(playerhp==0) {
																																							
																																							persona.setEstado(muerte);
																																							persona.ejecutaraccion();
																																							Boss.botaomen();
																																							
																																						}
																																						
																																						  if(playerhp==10) {
																																							
																																							persona.setEstado(muriendo);
																																							persona.ejecutaraccion();
																																						}
																																						
																																						  if(rafahp==0) {
																																							
																																							System.out.println("has derrotado a tu enemigo.");
																																							
																																						}
																																	
																																						  comando=c.nextLine();
																																						
																																						}while(comando.contains("seguir atacando"));
																																						
																																						if(comando.contains("huir")) {
																																							
																																							player1.huir();
																																							comando=c.nextLine();
																																							
																																							if(comando.contains("ir al cuarto")) {
																																								
																																								player1.iralcuarto();
																																								comando=c.nextLine();
																																								
																																								if(comando.contains("dormir")) {
																																									
																																									player1.domir();
																																			
																																									System.out.println("se acabo el dia.");
																																									comando=c.nextLine();
																																									
																																									if(comando.contains("siguiente dia")) {
																																										
																																										comando=c.nextLine();
																																										
																																										if(comando.contains("ayuda")) {
																																											
																																											player1.playerhelpday5();
																																											comando=c.nextLine();
																																											
																																											if(comando.contains("ir al cuarto de carmen")) {
																																												
																																												player1.iralcuartodecarmen();
																																												comando=c.nextLine();
																																												
																																												if(comando.contains("atacar con instastories")) {
																																												
																																												   bosshp+=1300;
																																												   Boss.dolares();
																																												   do {
																																												      Random aleatorio = new Random(System.currentTimeMillis());
																																											
																																												      int intAleatorio = aleatorio.nextInt(300);
																																												      int intAleatorio2=aleatorio.nextInt(150);
																																												      
																																												      playerhp=playerhp-intAleatorio;
																																												      bosshp=bosshp-intAleatorio2;
																																												
																																												      System.out.println("HP="+playerhp);
																																												      System.out.println("Carmen HP=" +bosshp);
																																												
																																												      if(playerhp==0) {
																																													
																																													     persona.setEstado(muerte);
																																													     persona.ejecutaraccion();
																																													     Boss.botaomen();
																																													
																																												}
																																												
																																												      if(playerhp==10) {
																																													
																																													     persona.setEstado(muriendo);
																																													     persona.ejecutaraccion();
																																												}
																																												
																																												
																																												      if(bosshp<=0) {
																																													
																																													     System.out.println("CARMEN WILL RETURN.");
																																													
																																												}
																																												
																																												
																																												      comando=c.nextLine();
																																												
																																												}while(comando.contains("seguir atacando"));
																																												
																																												
																																											}
																																												if(comando.contains("atacar con drama")) {
																																													
																																													   bosshp+=1000;
																																													   
																																													   do {
																																														   Boss.chela();
																																													      Random aleatorio = new Random(System.currentTimeMillis());
																																												
																																													      int intAleatorio = aleatorio.nextInt(200);
																																													      int intAleatorio2=aleatorio.nextInt(100);
																																													      
																																													      playerhp=playerhp-intAleatorio;
																																													      bosshp=bosshp-intAleatorio2;
																																													
																																													      System.out.println("HP="+playerhp);
																																													      System.out.println("Carmen HP=" +bosshp);
																																													
																																													      if(playerhp==0) {
																																														
																																														     persona.setEstado(muerte);
																																														     persona.ejecutaraccion();
																																														     Boss.botaomen();
																																														
																																													}
																																													
																																													      if(playerhp==10) {
																																														
																																														     persona.setEstado(muriendo);
																																														     persona.ejecutaraccion();
																																													}
																																													
																																													
																																													      if(bosshp<=0) {
																																														
																																														     System.out.println("CARMEN WILL RETURN.");
																																														
																																													}
																																													
																																													
																																													      comando=c.nextLine();
																																													
																																													}while(comando.contains("seguir atacando"));
																																													
																																													
																																												}
																																												
																																												if(comando.contains("mandar camion de guajiros")) {
																																													
																																													do {
																																														  Boss.deposito();
																																													      Random aleatorio = new Random(System.currentTimeMillis());
																																												
																																													      int intAleatorio = aleatorio.nextInt(300);
																																													      int intAleatorio2=aleatorio.nextInt(100);
																																													      
																																													      playerhp=playerhp-intAleatorio;
																																													      bosshp=bosshp-intAleatorio2;
																																													
																																													      System.out.println("HP="+playerhp);
																																													      System.out.println("Carmen HP=" +bosshp);
																																													
																																													      if(playerhp==0) {
																																														
																																														     persona.setEstado(muerte);
																																														     persona.ejecutaraccion();
																																														     Boss.botaomen();
																																														
																																													}
																																													
																																													      if(playerhp==10) {
																																														
																																														     persona.setEstado(muriendo);
																																														     persona.ejecutaraccion();
																																													}
																																													
																																													
																																													      if(bosshp<=0) {
																																														
																																														     System.out.println("CARMEN WILL RETURN.");
																																														
																																													}
																																													
																																													
																																													      comando=c.nextLine();
																																													
																																													}while(comando.contains("seguir atacando"));
																																													
																																									
																																													
																																												}
																																											}
																																											
																																										}
																																										
																																									}
																																									
																																								}
																																								
																																							}
																																							
																																						}
																																						
																																					}
																																					


																																				}
																																				
																																			}
																																			
																																		}
																																	}
																																}
																														    }
																															
																															
																														}
																														
																													}
																													
																												}
																												
																											}
																											
																										}
																										
																									}
																									


																								}
																								
																							}
																							
																						}
																					}
																				}
																				
																			}
																			
																			
																		}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
	}
}