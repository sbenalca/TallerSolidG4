/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

/**
 *
 * @author Sebastián Benalcázar
 */
public class Helado extends Postre {

    public Helado(String sabor) {
        super(sabor);
        super.setPrecioParcial(7.85);
    }

	@Override
	public String toString() {
		return "Helado " + super.toString();
	}
	
}
