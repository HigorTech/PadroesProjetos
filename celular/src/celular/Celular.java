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
public class Celular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaDeCelulares fab = new FabricaApple();
        
        FabricaDeCelulares f = new FabricaSamsung();
        
        FabricaDeCelulares x = new FabricaXiaomi();
        
        FabricaDeCelulares fm = new FabricaMotog();
        
        FabricaDeCelulares ml = new FabricaCaterpilar();
        
        CelularDeRico celu = fab.criarCelularRico();
        celu.exibirInfoCelularDeRico();
        
         CelularDeRico celu1 = ml.criarCelularRico();
        celu1.exibirInfoCelularDeRico();
        
        CelularPopular cel = f.criarCelularPopular();
        cel.exibirInfoCelularPopular();
        
        CelularPopular celu2 = ml.criarCelularPopular();
        celu2.exibirInfoCelularPopular();
        
        CelularDeRico cee = x.criarCelularRico();
        cee.exibirInfoCelularDeRico();
        
        CelularPopular cp = fm.criarCelularPopular();
        cp.exibirInfoCelularPopular();
        System.out.println("");
        
        
        CelularPopular ce = fab.criarCelularPopular();
        ce.exibirInfoCelularPopular();
        
        CelularDeRico c = f.criarCelularRico();
        c.exibirInfoCelularDeRico();
       
        CelularPopular ce1 = x.criarCelularPopular();
        ce1.exibirInfoCelularPopular();
        
        CelularDeRico co  = fm.criarCelularRico();
        co.exibirInfoCelularDeRico();
        
        
        
        
        
    }
    
}
