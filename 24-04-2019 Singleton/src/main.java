
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		FabricaMotorola smartphone = FabricaMotorola.getInstancia();
		
		smartphone.linha="G";
		smartphone.modelo="7 Plus";
		
		System.out.println("Fabrica da Motorola \n Linha: "+smartphone.linha + "\n Modelo: "+smartphone.modelo);
		

	}

}
