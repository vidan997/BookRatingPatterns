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
public abstract class Prilozi extends Pizza implements  Cloneable{

    protected Pizza tempPizza;

    public Prilozi(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    @Override
    public String vratiOpis() {
        return tempPizza.vratiOpis();
    }

    @Override
    public double vratiCenu() {
        return tempPizza.vratiCenu();
    }

    public void setNext(Pizza pizza) {
        tempPizza = pizza;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    
    
    
}
