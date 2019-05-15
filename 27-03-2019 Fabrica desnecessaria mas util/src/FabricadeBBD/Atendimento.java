package FabricadeBBD;

import java.util.Scanner;

public interface Atendimento {
	
	
	
	public static void inicioAtendimento(){
		System.out.println(" -------------------\n");
		System.out.println("Seja Bem Vindo a Padaria desnecessariamente criada, mas util. o que voce quer?");
		System.out.println("\n");
		System.out.println("1 - Bolo\n2 - Biscoisto\n3 - Doces\n");
		
		Atendimento.logicaOne();
		
		
		}
	
	public static void FimAtendimento() {
		System.out.println(" -------------------\n");
		System.out.println("Muito Obrigado e volte Sempre!!");
		
		
		
	}

	
	
	
	
	/////////////////////////////Inicio-Primeira-Pergunta/////////////////////////////////////
	
	
	public static void primeiraPerguntaBolo() {
		System.out.println("Certo!, Agora qual Tipo de Bolo voce deseja?\n1 - Simples\n2 - Festa\n3 - Sem Farinha\n4 - Bolo Anjo");
		Atendimento.logicaBolo();
		
		
	}
	
	public static void primeiraPerguntaBiscoito() {
		System.out.println("Certo!, Agora qual Tipo de Biscoito voce deseja?\n1 - Wafer\n2 - Maisena\n3 - Recheado\n4 - Cracker");
		Atendimento.logicaBiscoito();
	}
	
	public static void primeiraPerguntaDoce() {
		System.out.println("Certo!, Agora qual Tipo de Doce voce deseja?\n1 - CupCake\n2 - Bem Casado\n3 - Gelado\n4 - Frutas");
		Atendimento.logicaDoce();
	}
	
	
	
	
	//////////////////////////////////-Fim-/////////////////////////////////////////////
	
	
	
	/////////////////////////////////inicio-tipos-bolos///////////////////////////////////////////////////
	
//	public static void perguntaTipoBolo() {
//		System.out.println("Certo!, Agora qual Sabor  voce deseja?\n1 - Chocolate\n2 - Morango\n3 - Brigadeiro\n4 - Cenoura");
//	}
	
	
	public static void boloComun() {
		FabricaBolos fabrica = new BoloChocolate();
		bolosimples bolo = fabrica.criaBoloSimples();
		bolo.exibirBoloSimples();
		Atendimento.FimAtendimento();
	}
	public static void boloFesta() {
		FabricaBolos fabrica = new BoloChocolate();
		bolofesta bolo2 = fabrica.criarBoloFesta();
		bolo2.exibrBoloFesta();
		Atendimento.FimAtendimento();
		
	}
	public static void boloAnjo() {
		FabricaBolos fabrica = new BoloChocolate();
		boloanjo bolo3 = fabrica.criarBoloAnjo();
		bolo3.exibirBoloAnjo();
		Atendimento.FimAtendimento();
		
	}
	public static void boloSemfarinha() {
		FabricaBolos fabrica = new BoloChocolate();
		bolosemfarinha bolo4 = fabrica.criarBoloSFarinha();
		bolo4.exibirBoloSFarinha();
		Atendimento.FimAtendimento();
		
		
	}
	
	public static void biscoitoWafer() {
		FactoryBiscoito biscoito = new FactoryBiscoito();
		biscoito.getBiscoito("Chocolate","W");
		Atendimento.FimAtendimento();
		
	}
public static void biscoitoMaisena() {
	FactoryBiscoito biscoito2 = new FactoryBiscoito();
	biscoito2.getBiscoito("Ao leite","M");
	Atendimento.FimAtendimento();
		
	}
public static void biscoitoRechado() {
	FactoryBiscoito biscoito3 = new FactoryBiscoito();
	biscoito3.getBiscoito("Morango","R");
	Atendimento.FimAtendimento();
	
}
public static void biscoitoCracker() {
	FactoryBiscoito biscoito4 = new FactoryBiscoito();
	biscoito4.getBiscoito("Agua e Sal","C");
	Atendimento.FimAtendimento();
}
public static void doceCupCake() {
	CupCakePrototype prototipodoces = new CupCakePrototype();
	DocesPrototype doce = prototipodoces.clonar();
	doce.setSabor("Morango");
	System.out.println(doce.exibirinfo());
	Atendimento.FimAtendimento();

	
}

public static void doceBemCasado(){
	BemCasadoPrototype prototipodoces1 = new BemCasadoPrototype();
	DocesPrototype doce1 = prototipodoces1.clonar();
	doce1.setSabor("Chocolate");
	System.out.println(doce1.exibirinfo());
	Atendimento.FimAtendimento();
	
}

public static void doceGelado() {
	GeladoPrototype prototipodoces2 = new GeladoPrototype();
	DocesPrototype doce2 = prototipodoces2.clonar();
	doce2.setSabor("Brigadeiro");
	System.out.println(doce2.exibirinfo());
	Atendimento.FimAtendimento();
	

	
}
public static void doceFrutas() {
	FrutasPrototype prototipodoces3 = new FrutasPrototype();
	DocesPrototype doce4 = prototipodoces3.clonar();
	doce4.setSabor("Laranja");
	System.out.println(doce4.exibirinfo());
	Atendimento.FimAtendimento();
	
}
	

	
	
	////////////////////////////////////////////Fim//////////////////////////////////////////////////////////////
	
	//////////////////////////////////////////inicio-logica/////////////////////////////////////////////////////////////
	
	public static void logicaOne(){
int valor;
		
		Scanner teclado = new Scanner(System.in);
		
		valor = teclado.nextInt();
		if(valor==1) {
			Atendimento.primeiraPerguntaBolo();
		}else
			if (valor==2) {
				Atendimento.primeiraPerguntaBiscoito();
		}else
			if(valor==3) {
				Atendimento.primeiraPerguntaDoce();
				} else
				System.out.println("Valor digitado é invalido!\n Por Favor, Tente novamente:");
		Atendimento.logicaOne();
		

	}
	
	public static void logicaBolo() {
		int valor;
				
				Scanner teclado = new Scanner(System.in);
				
				valor = teclado.nextInt();
				if(valor==1) {
					Atendimento.boloComun();
				}else
					if (valor==2) {
						Atendimento.boloFesta();
				}else
					if(valor==3) {
						Atendimento.boloSemfarinha();
				} else
					if(valor==4) {
						Atendimento.boloAnjo();
						
				}else
							
						System.out.println("Valor digitado é invalido!\n Por Favor, Tente novamente:");
				Atendimento.logicaBolo();
				

			}
	
	public static void logicaBiscoito() {
		int valor;
				
				Scanner teclado = new Scanner(System.in);
				
				valor = teclado.nextInt();
				if(valor==1) {
					Atendimento.biscoitoWafer();
				}else
					if (valor==2) {
						Atendimento.biscoitoMaisena();
				}else
					if(valor==3) {
						Atendimento.biscoitoRechado();
				} else
					if(valor==4) {
						Atendimento.biscoitoCracker();
						
				}else
							
						System.out.println("Valor digitado é invalido!\n Por Favor, Tente novamente:");
				Atendimento.logicaBiscoito();
				

			}
	
	public static void logicaDoce() {
		int valor;
				
				Scanner teclado = new Scanner(System.in);
				
				valor = teclado.nextInt();
				if(valor==1) {
					Atendimento.doceCupCake();
				}else
					if (valor==2) {
						Atendimento.doceBemCasado();
				}else
					if(valor==3) {
						Atendimento.doceGelado();
				} else
					if(valor==4) {
						Atendimento.doceFrutas();
						
				}else
							
						System.out.println("Valor digitado é invalido!\n Por Favor, Tente novamente:");
				Atendimento.logicaDoce();
	
//	public static void logicaSaborBolo() {
//		int valor;
//				
//				Scanner teclado = new Scanner(System.in);
//				
//				valor = teclado.nextInt();
//				if(valor==1) {
//					
//				}else
//					if (valor==2) {
//						Atendimento.boloFesta();
//				}else
//					if(valor==3) {
//						Atendimento.boloSemfarinha();
//				} else
//					if(valor==4) {
//						Atendimento.boloAnjo();
//						
//				}else
//							
//						System.out.println("Valor digitado é invalido!\n Por Favor, Tente novamente:");
//				Atendimento.logicaSaborBolo();
//				
//
//			}
}}
