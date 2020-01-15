/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.*;
import java.util.ArrayList;
import java.util.List;
import so.OpstaSistemskaOperacija;
import so.SOUbaciNarudzbinu;

/**
 *
 * @author vidan
 */
public class Controller {
    
    private static Controller instance;
    private final List<Prilozi> prilozi;
    
    private Controller() {
        prilozi = new ArrayList<>();
        prilozi.add(new Sunka(null));
        prilozi.add(new Sampinjoni(null));
        prilozi.add(new Prsuta(null));
        prilozi.add(new Mozzarella(null));
        prilozi.add(new ParadajzSos(null));
    }

    public static Controller getInstance(){
        if(instance==null){
            instance=new Controller();
        }
        return instance;
    }

    public List<Prilozi> vratiPriloge() {
        return prilozi;
    }

    public Pizza savePizza(Pizza pizza) throws Exception {
        OpstaSistemskaOperacija so=new SOUbaciNarudzbinu(pizza);
        so.opsteIzvrsenje();
        return (Pizza)so.getOdo();
    }
    
    
}
