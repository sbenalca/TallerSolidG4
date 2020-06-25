/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Adicionales.Aderezo;
import java.util.ArrayList;

import Postres.*;
/**
 *
 * @author darin
 * Se puede concluir utilizamos el principio de SIngle responsability, debido a que creamos una nueva clase para que desarrolle
 * una única responsabilidad en este caso sería el manejo de los precios
 */
public class ManejadorDePrecio {
     public static double calcularPrecioFinal(double precioParcial, ArrayList<Aderezo> aderezos) {
        double precioFinal;
        precioFinal = (precioParcial + (precioParcial * 0.12)) + (aderezos.size() * 0.50);
        return precioFinal;
    }

    public static String showPrecioFinal(Postre postre) {
        
		return "Precio Final: $ " 
			+ calcularPrecioFinal(postre.getPrecioParcial(), postre.getAderezos());

	}

}
