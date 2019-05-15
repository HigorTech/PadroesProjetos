package FabricadeBBD;

public class GeladoPrototype extends DocesPrototype{
	 
	protected  GeladoPrototype(GeladoPrototype  geladoPrototype) {
		this.sabor=  geladoPrototype.sabor;
	}
		
		public GeladoPrototype(){
			
			sabor="Undefined";
		}
	

	@Override
	public String exibirinfo() {
		// TODO Auto-generated method stub
		return "Doce do tipo Gelado Sabor "+getSabor();
	}

	@Override
	public DocesPrototype clonar() {
		// TODO Auto-generated method stub
		return new GeladoPrototype(this);
	}

}
