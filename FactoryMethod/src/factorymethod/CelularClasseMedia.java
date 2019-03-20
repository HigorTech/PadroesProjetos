package factorymethod;

public class CelularClasseMedia extends FabricaCelular{
	public CelularClasseMedia(String modelo) {
		this.modelo = modelo;
		System.out.println("O modelo do celular Ã© de classe média " + this.modelo);
	}

}
