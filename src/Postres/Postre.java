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

    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;

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
        return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }

    

    /**
     * @author Alexis Poveda
     * 
     * 2. Clases Procesos.OperacionesAderezo y Postre. ¿Es necesaria la clase
     * OperacionesAderezo?. Se puede incluir dentro de postre un método para agregar
     * un aderezo y para quitar un aderezo.
     * 
     */

    public static void anadirAderezo(Postre postre, Aderezo aderezo) {
        postre.getAderezos().add(aderezo);
    }

    public static void quitarAderezo(Postre postre, Aderezo aderezo) {
        postre.getAderezos().remove(aderezo);
    }

}
