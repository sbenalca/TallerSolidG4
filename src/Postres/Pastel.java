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
public class Pastel extends Postre {

    public Pastel(String sabor) {
        super(sabor);
        super.setPrecioParcial(15.55);
    }

	@Override
	public String toString() {
	
		return "Pastel " + super.toString();
	
	}

	
	
}
