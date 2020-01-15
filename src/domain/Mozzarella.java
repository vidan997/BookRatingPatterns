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
public class Mozzarella extends Prilozi {

    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public String vratiOpis() {
        return super.vratiOpis() + "Mozzarella\n"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double vratiCenu() {
        return super.vratiCenu() + 100;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Mozzarella";
    }
    
    
}
