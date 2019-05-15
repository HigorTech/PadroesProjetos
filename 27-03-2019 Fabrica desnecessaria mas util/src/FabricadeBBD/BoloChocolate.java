package FabricadeBBD;

public class BoloChocolate implements FabricaBolos {

	@Override
	public bolosimples criaBoloSimples() {
		// TODO Auto-generated method stub
		return new BoloChocolateComum();
	}

	@Override
	public bolofesta criarBoloFesta() {
		// TODO Auto-generated method stub
		return new BoloBrigadeiro();
	}

	@Override
	public bolosemfarinha criarBoloSFarinha() {
		// TODO Auto-generated method stub
		return new BoloChocolateSFarinha();
	}

	@Override
	public boloanjo criarBoloAnjo() {
		// TODO Auto-generated method stub
		return new BoloChocolateAnjo();
	}

}
