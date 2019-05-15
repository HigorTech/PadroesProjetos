package FabricadeBBD;


public class FactoryBiscoito {
	
	
	public Biscoito getBiscoito(String sabor, String tipo) {
		if(tipo.equals("R")) 
			return new Recheado(sabor);
		if (tipo.equals("W")) 
			return new Wafer(sabor);
		if (tipo.equals("C")) 
			return new Cracker(sabor);
		if (tipo.equals("M")) 
			return new Maisena(sabor);
		return null;
		
	}

}
