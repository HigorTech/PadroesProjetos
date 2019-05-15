package FabricadeBBD;


public class CupCakePrototype extends DocesPrototype{
	
	
	protected  CupCakePrototype(CupCakePrototype  cupCakePrototype) {
		this.sabor=  cupCakePrototype.sabor;
	}
		
		public CupCakePrototype(){
			
			sabor="Undefined";
		}

	@Override
	public String exibirinfo() {
		// TODO Auto-generated method stub
		return "Doce do tipo CupCake Sabor "+getSabor();
	}

	@Override
	public DocesPrototype clonar() {
		// TODO Auto-generated method stub
		return new CupCakePrototype(this);
	}

}
