/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celular;

/**
 *
 * @author Rafael
 */
public class FabricaMotog implements FabricaDeCelulares{

    @Override
    public CelularPopular criarCelularPopular() {
       return new CelularMotoG4();
    }

    @Override
    public CelularDeRico criarCelularRico() {
       return new CelularMotog7PLUS();
    }
    
}
