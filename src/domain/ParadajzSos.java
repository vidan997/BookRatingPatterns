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
public class ParadajzSos extends Prilozi{

    public ParadajzSos(Pizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public double vratiCenu() {
        return super.vratiCenu() + 50.00; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiOpis() {
        return super.vratiOpis() + "Paradajz sos\n"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Paradajz sos";
    }
    
    
    
}
