package FabricadeBBD;

public class FrutasPrototype extends DocesPrototype{
	
	protected  FrutasPrototype(FrutasPrototype  frutasPrototype) {
		this.sabor=  frutasPrototype.sabor;
	}
		
		public FrutasPrototype(){
			
			sabor="Undefined";
		}

	@Override
	public String exibirinfo() {
		// TODO Auto-generated method stub
		return "Doce do tipo Frutas Sabor "+getSabor();
	}

	@Override
	public DocesPrototype clonar() {
		// TODO Auto-generated method stub
		return new FrutasPrototype(this);
	}
	

}
