package SmartphoneFM;

public class Main {

	public static void main(String[] args) {
		
		
		FactorySmartphone alo = new FactorySmartphone();
		
//		String marca="S";
//		String modelo="Gran Prime";
		
		alo.getSmartphone("S", "GranPrime");
		
		
		
		FactorySmartphone alo2 = new FactorySmartphone();
		
		alo2.getSmartphone("A", "XS Max");
		
		
	}

}
