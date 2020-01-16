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
public abstract class Pizza implements OpstiDomenskiObjekat{

    protected Long id;
    
    public abstract String vratiOpis();
    public abstract double vratiCenu();
    
    @Override
    public String dajNaziveAtributa(){
        return "opis, cena";
    }
    
    @Override
    public String dajVrednostiAtributa(){
        return "'"+vratiOpis()+"', "+vratiCenu();
    }
    
    @Override
    public boolean isAutoincrement(){
        return true;
    }
    
    @Override
    public String dajNazivTabele(){
        return "pizza";
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    
    
    
}
