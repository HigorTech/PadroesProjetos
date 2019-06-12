
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		FabricaMotorola smartphone = FabricaMotorola.getInstancia();
		
		smartphone.linha="G";
		smartphone.modelo="7 Plus";
		
		System.out.println("Fabrica da Motorola \n Linha: "+smartphone.linha + "\n Modelo: "+smartphone.modelo);
		System.out.println("\n");
		
		FabricaSamsung smartphone2 = FabricaSamsung.getInstancia();
		
		smartphone2.linha="S";
		smartphone2.modelo="S10";
		
		
		System.out.println("Fabrica da Samsung \n Linha: "+smartphone2.linha + "\n Modelo: "+smartphone2.modelo);

	}

}
