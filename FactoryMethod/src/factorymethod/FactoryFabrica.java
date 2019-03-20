/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Rafael
 */
public class FactoryFabrica {
    public FabricaCelular getFabricaCelular(String marca, String modelo){
        if (marca.equals("apple"))
            return new CelularRico(modelo);
        if (marca.equals("xiaomi"))
            return new CelularPobre(modelo);
        if (marca.equals("Motorola"))
        	return new CelularClasseMedia(modelo);
        
         return null;
    }
       
   
}