/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.Aderezo;
import Adicionales.Crema;
import Adicionales.Frutilla;
import Postres.*;
import Procesos.*;
import Leche.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        LecheEntera leche = new LecheDeslactosada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        Aderezo crema= new Crema();
        Aderezo frutilla= new Frutilla();
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        helado_vainilla.anadirAderezo(helado_vainilla, crema);
        helado_vainilla.anadirAderezo(helado_vainilla, frutilla);
        System.out.println(helado_vainilla);
//        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        ManejadorDePrecios manejador= new ManejadorDePrecios();
        System.out.println(manejador.showPrecioFinal(helado_vainilla.getPrecioParcial(),helado_vainilla.getAderezos()));
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        pastel_chocolate.quitarAderezo(pastel_chocolate, crema);
        pastel_chocolate.anadirAderezo(pastel_chocolate, frutilla);
        System.out.println(pastel_chocolate);
//        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        System.out.println(manejador.showPrecioFinal(pastel_chocolate.getPrecioParcial(),pastel_chocolate.getAderezos()));
        
        
    }
}
