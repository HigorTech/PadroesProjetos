package FabricadeBBD;

public class BemCasadoPrototype  extends DocesPrototype{
	
	protected  BemCasadoPrototype(BemCasadoPrototype  bemCasadoPrototype) {
		this.sabor=  bemCasadoPrototype.sabor;
	}
		
		public BemCasadoPrototype(){
			
			sabor="Undefined";
		}


	@Override
	public String exibirinfo() {
		// TODO Auto-generated method stub
		return "Doce do tipo Bem Casado Sabor "+getSabor();
	}

	@Override
	public DocesPrototype clonar() {
		// TODO Auto-generated method stub
		return new BemCasadoPrototype(this);
	}

}
