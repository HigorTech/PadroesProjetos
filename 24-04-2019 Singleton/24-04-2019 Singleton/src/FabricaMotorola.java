
public class FabricaMotorola {
	public static FabricaMotorola instancia;
	
	protected String modelo;
	protected String linha;
	
	protected FabricaMotorola() {
		
	}
	
	public static FabricaMotorola getInstancia() {
		if(instancia==null) {
			instancia = new FabricaMotorola();
		} return instancia;
	}


	
	
	
	
	
}
