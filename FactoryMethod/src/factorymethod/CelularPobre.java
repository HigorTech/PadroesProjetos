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
public class CelularPobre extends FabricaCelular{
    
    public CelularPobre(String modelo){
        this.modelo = modelo;
        System.out.println("O modelo do celular é de pobre:" + this.modelo);
        
    }
    
}
