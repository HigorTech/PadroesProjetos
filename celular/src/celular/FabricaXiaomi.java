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
public class FabricaXiaomi implements FabricaDeCelulares{

    @Override
    public CelularPopular criarCelularPopular() {
        return new CelularXiaomi4A();
    }

    @Override
    public CelularDeRico criarCelularRico() {
        return new CelularXiaomi6();
    }
    
}
