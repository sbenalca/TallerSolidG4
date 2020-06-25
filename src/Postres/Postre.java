/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Sebastián Benalcázar García
 */
public class Postre {

    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;

    public Postre(String sabor) {
        aderezos = new ArrayList<>();
        this.sabor = sabor;
        this.precioParcial = 0;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }

    public void setAderezos(ArrayList<Aderezo> aderezos) {
        this.aderezos = aderezos;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    @Override
    public String toString() {
        return "{sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos.toString() + '}';
    }

    /**
     * @author Alexis Poveda
     * 
     * 2. Clases Procesos.OperacionesAderezo y Postre. ¿Es necesaria la clase
     * OperacionesAderezo?. Se puede incluir dentro de postre un método para agregar
     * un aderezo y para quitar un aderezo.
     * 
     */

    public void anadirAderezo(Aderezo aderezo) {
    
		this.getAderezos().add(aderezo);
    
	}

    public Aderezo quitarAderezo(Aderezo aderezo) {
		
		int index = this.getAderezos().indexOf(aderezo);
        
		return (this.getAderezos().remove(index));
    
	}

}
