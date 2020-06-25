/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author adrig
 */
public class Crema extends Aderezo{
    
    public Crema(){
    
		super();
		setNombre();
	
    }
    
    @Override
    public void setNombre() {
        nombre="Crema";
    }

    @Override
    public String toString() {
       return super.toString();
    }
    
}
