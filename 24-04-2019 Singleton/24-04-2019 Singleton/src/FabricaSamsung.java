
public class FabricaSamsung {
	public static FabricaSamsung instancia;
		protected String modelo;
		protected String linha;
		
		protected FabricaSamsung() {
			
		}
		
		public static FabricaSamsung getInstancia() {
			if(instancia==null){
				instancia = new FabricaSamsung();
			} return instancia;
			
		}
		
		
	

}
