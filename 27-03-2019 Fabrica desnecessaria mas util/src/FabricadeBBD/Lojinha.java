package FabricadeBBD;

import java.util.Scanner;

import org.omg.CORBA.portable.IndirectionException;

public class Lojinha {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
//		int valor;
//		
//		Scanner teclado = new Scanner(System.in);
		
//		
		Atendimento.inicioAtendimento();
//		
		
//		valor = teclado.nextInt();
//		if(valor==1) {
//			Atendimento.primeiraPergunta();
//		}
		
		
		
		
		
		
		

		
		
		
//		FabricaBolos fabrica = new BoloChocolate();
//		bolosimples bolo = fabrica.criaBoloSimples();
//		bolofesta bolo2 = fabrica.criarBoloFesta();
//		boloanjo bolo3 = fabrica.criarBoloAnjo();
//		bolosemfarinha bolo4 = fabrica.criarBoloSFarinha();
//		
//		bolo.exibirBoloSimples();
//		bolo2.exibrBoloFesta();
//		bolo3.exibirBoloAnjo();
//		bolo4.exibirBoloSFarinha();
//		
//		System.out.println(" -------------------\n");
//		
//		
		FactoryBiscoito biscoito = new FactoryBiscoito();
		biscoito.getBiscoito("Chocolate","W");
		
		FactoryBiscoito biscoito2 = new FactoryBiscoito();
		biscoito2.getBiscoito("Ao leite","M");
		
		FactoryBiscoito biscoito3 = new FactoryBiscoito();
		biscoito3.getBiscoito("Morango","R");
		
		FactoryBiscoito biscoito4 = new FactoryBiscoito();
		biscoito4.getBiscoito("Agua e Sal","C");
//		
//		System.out.println(" -------------------\n");
//
//		CupCakePrototype prototipodoces = new CupCakePrototype();
//		BemCasadoPrototype prototipodoces1 = new BemCasadoPrototype();
//		GeladoPrototype prototipodoces2 = new GeladoPrototype();
//		FrutasPrototype prototipodoces3 = new FrutasPrototype();
//		
//		DocesPrototype doce = prototipodoces.clonar();
//		doce.setSabor("Morango");
//		System.out.println(doce.exibirinfo());
//		
//		
//		DocesPrototype doce1 = prototipodoces1.clonar();
//		doce1.setSabor("Chocolate");
//		System.out.println(doce1.exibirinfo());
//		
//		DocesPrototype doce2 = prototipodoces2.clonar();
//		doce2.setSabor("Brigadeiro");
//		System.out.println(doce2.exibirinfo());
//		
//		DocesPrototype doce3 = prototipodoces3.clonar();
//		doce3.setSabor("Manga");
//		System.out.println(doce3.exibirinfo());
//		
//		DocesPrototype doce4 = prototipodoces3.clonar();
//		doce4.setSabor("Laranja");
//		System.out.println(doce4.exibirinfo());
		
		
		
		
		
		
	}

}
