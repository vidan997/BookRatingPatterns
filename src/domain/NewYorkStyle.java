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
public class NewYorkStyle extends Pizza{
    
    @Override
    public String vratiOpis() {
        return "Ova pica je spremljena New York nacinom. \n Prilozi: \n";
    }

    @Override
    public double vratiCenu() {
        return 200;
    }

    @Override
    public String toString() {
        return "NewYork Style";
    }
    
    
    
}
