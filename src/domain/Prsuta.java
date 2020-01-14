/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author vidan
 */
public class Prsuta extends Prilozi{

    public Prsuta(Pizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public String vratiOpis() {
        return super.vratiOpis()+ "Prsuta\n"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double vratiCenu() {
        return super.vratiCenu() + 250; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Prsuta";
    }
    
    
    
}
