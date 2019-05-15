package FabricadeBBD;

public abstract class DocesPrototype {
	
	protected String sabor;
	
	public abstract String exibirinfo();
	
	public abstract DocesPrototype clonar();
	
	

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	
		
	}

