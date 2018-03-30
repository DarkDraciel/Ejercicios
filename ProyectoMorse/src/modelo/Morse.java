package modelo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Morse {


	public static void main(String[] args){
		System.out.println ("Por favor introduzca el texto o el código morse :");

		String salida;
		String cadena="";

		Scanner e = new Scanner (System.in);
		salida = e.nextLine (); 
		StringTokenizer st = new StringTokenizer(salida);
		//System.out.println(entrada.substring(0,1)+" 1");
		//String num[]= new String [salida];

		for (int i = 0; i < salida.length(); i++) {			
			if (salida.substring(i, i+1)!=" " && i>0){
				cadena+=" ";
			}
			if (salida.substring(i, i+1).equals(" ") && i>0){
				cadena+="   ";
			}
			if (salida.substring(i, i+1).equals("   ") && i>0){
				cadena+=" ";
			}

			//*****************************************************************************************
			String var="";
			while (st.hasMoreTokens()){
				var=st.nextToken();
				
				if (var.equals("   ")){
					cadena+=" ";
				}
				if (var.equals(".-")) {
					cadena+="A";	
				}
				else{

					if (var.equals("-...")) {
						cadena+="B";	
					}else{

						if (var.equals("-.-.")) {
							cadena+="C";	

						} else{
							if (var.equals("-..")) {
								cadena+="D";	
							}else{



								if (var.equals(".")) {
									cadena+="E";	
								}else{




									if (var.equals("..-.")) {
										cadena+="F";	
									}else{




										if (var.equals("--.")) {
											cadena+="G";	
										}else{




											if (var.equals("....")) {
												cadena+="H";	
											}else{





												if (var.equals("..")) {
													cadena+="I";	
												}else{



													if (var.equals(".---")) {
														cadena+="J";	
													}else{




														if (var.equals("-.-")) {
															cadena+="K";	
														}else{



															if (var.equals(".-..")) {
																cadena+="L";	
															}else{


																if (var.equals("--")) {
																	cadena+="M";	
																}else{




																	if (var.equals("-.")) {
																		cadena+="N";	
																	}else{





																		if (var.equals("---")) {
																			cadena+="O";	
																		}else{





																			if (var.equals(".--.")) {
																				cadena+="P";	
																			}else{




																				if (var.equals("--.-")) {
																					cadena+="Q";	
																				}else{




																					if (var.equals(".-.")) {
																						cadena+="R";	
																					}else{




																						if (var.equals("...")) {
																							cadena+="S";	
																						}else{




																							if (var.equals("-")) {
																								cadena+="T";	
																							}else{




																								if (var.equals("..-")) {
																									cadena+="U";	
																								}else{




																									if (var.equals("...-")) {
																										cadena+="V";	


																									}else{


																										if (var.equals(".--")) {
																											cadena+="W";	
																										}else{



																											if (var.equals("-..-")) {
																												cadena+="X";	
																											}else{


																												if (var.equals("-.--")) {
																													cadena+="Y";	
																												}else{



																													if (var.equals("--..")) {
																														cadena+="Z";	

																													} else{




																														if (var.equals("-----")) {
																															cadena+="0";	
																														}else{




																															if (var.equals(".----")) {
																																cadena+="1";	
																															}else{



																																if (var.equals("..---")) {
																																	cadena+="2";	
																																}else{


																																	if (var.equals("...--")) {
																																		cadena+="3";	
																																	}else{


																																		if (var.equals("....-")) {
																																			cadena+="4";	
																																		}else{




																																			if (var.equals(".....")) {
																																				cadena+="5";	
																																			}else{




																																				if (var.equals("-....")) {
																																					cadena+="6";	
																																				}else{




																																					if (var.equals("--...")) {
																																						cadena+="7";	

																																					}else{




																																						if (var.equals("---..")) {
																																							cadena+="8";	

																																						}else{


																																							if (var.equals("----.")) {
																																								cadena+="9";	
																																							}




																																						}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}

			}
			//**************************

			//--------------------------	

			if (salida.substring(i, i+1).equals("A") || salida.substring(i, i+1).equals("a")) {
				cadena+=".-";
			} else {
				if (salida.substring(i, i+1).equals("B") || salida.substring(i, i+1).equals("b")) {
					cadena+="-...";
				} else {
					if (salida.substring(i, i+1).equals("C") || salida.substring(i, i+1).equals("c")) {
						cadena+="-.-.";
					} else {
						if (salida.substring(i, i+1).equals("D") || salida.substring(i, i+1).equals("d")) {
							cadena+="-..";
						} else {
							if (salida.substring(i, i+1).equals("E") || salida.substring(i, i+1).equals("e")) {
								cadena+=".";
							} else {
								if (salida.substring(i, i+1).equals("F") || salida.substring(i, i+1).equals("f")) {
									cadena+="..-.";
								} else {
									if (salida.substring(i, i+1).equals("G") || salida.substring(i, i+1).equals("g")) {
										cadena+="--.";
									} else {
										if (salida.substring(i, i+1).equals("H") || salida.substring(i, i+1).equals("h")) {
											cadena+="....";
										} else {
											if (salida.substring(i, i+1).equals("I") || salida.substring(i, i+1).equals("i")) {
												cadena+="..";
											} else {
												if (salida.substring(i, i+1).equals("J") || salida.substring(i, i+1).equals("j")) {
													cadena+=".---";
												} else {
													if (salida.substring(i, i+1).equals("K") || salida.substring(i, i+1).equals("k")) {
														cadena+="-.-";
													} else {
														if (salida.substring(i, i+1).equals("L") || salida.substring(i,i+1).equals("l")) {
															cadena+=".-..";
														} else {
															if (salida.substring(i, i+1).equals("M") || salida.substring(i, i+1).equals("m")) {
																cadena+="--";
															} else {
																if (salida.substring(i, i+1).equals("N") || salida.substring(i, i+1).equals("n")) {
																	cadena+="-.";
																} else {

																	if (salida.substring(i, i+1).equals("O") || salida.substring(i, i+1).equals("o")) {
																		cadena+="---";
																	} else {

																		if (salida.substring(i, i+1).equals("P") || salida.substring(i, i+1).equals("p")) {
																			cadena+=".--.";
																		} else {
																			if (salida.substring(i, i+1).equals("Q") || salida.substring(i, i+1).equals("q")) {
																				cadena+="--.-";
																			} else {
																				if (salida.substring(i, i+1).equals("R") || salida.substring(i, i+1).equals("r")) {
																					cadena+=".-.";
																				} else {
																					if (salida.substring(i, i+1).equals("S") || salida.substring(i, i+1).equals("s")) {
																						cadena+="...";
																					} else {
																						if (salida.substring(i, i+1).equals("T") || salida.substring(i, i+1).equals("t")) {
																							cadena+="-";
																						} else {
																							if (salida.substring(i, i+1).equals("U") || salida.substring(i, i+1).equals("u")) {
																								cadena+="..-";
																							} else {
																								if (salida.substring(i, i+1).equals("V") || salida.substring(i, i+1).equals("v")) {
																									cadena+="...-";
																								} else {
																									if (salida.substring(i, i+1).equals("W") || salida.substring(i, i+1).equals("w")) {
																										cadena+=".--";
																									} else {
																										if (salida.substring(i, i+1).equals("X") || salida.substring(i, i+1).equals("x")) {
																											cadena+="-..-";
																										} else {
																											if (salida.substring(i, i+1).equals("Y") || salida.substring(i, i+1).equals("y")) {
																												cadena+="-.--";
																											} else {
																												if (salida.substring(i, i+1).equals("Z") || salida.substring(i, i+1).equals("z")) {
																													cadena+="--..";
																												} else {
																													if (salida.substring(i, i+1).equals("0")) {
																														cadena+="-----";
																													} else {
																														if (salida.substring(i, i+1).equals("1")) {
																															cadena+=".----";
																														} else {
																															if (salida.substring(i, i+1).equals("2")) {
																																cadena+="..---";
																															} else {
																																if (salida.substring(i, i+1).equals("3")) {
																																	cadena+="...--";
																																} else {
																																	if (salida.substring(i, i+1).equals("4")) {
																																		cadena+=".-";
																																	} else {
																																		if (salida.substring(i, i+1).equals("5")) {
																																			cadena+="....-";
																																		} else {
																																			if (salida.substring(i, i+1).equals("6")) {
																																				cadena+="-....";
																																			} else {
																																				if (salida.substring(i, i+1).equals("7")) {
																																					cadena+="--...";
																																				} else {
																																					if (salida.substring(i, i+1).equals("8")) {
																																						cadena+="---..";
																																					}else{
																																						if (salida.substring(i, i+1).equals("9")) {
																																							cadena+="----.";
																																						}
																																					}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
			//---------------------------



		}
		System.out.println(cadena);
	}
}










































