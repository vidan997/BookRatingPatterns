/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domain.OpstiDomenskiObjekat;
import domain.Pizza;

/**
 *
 * @author vidan
 */
public class SOUbaciNarudzbinu extends OpstaSistemskaOperacija {

    public SOUbaciNarudzbinu(OpstiDomenskiObjekat odo) {
        super(odo);
    }

    @Override
    public void izvrsenjeOperacije() throws Exception {
        odo = dbbr.insert(odo);
        Pizza item = (Pizza) odo;
        dbbr.insert(item);
    }

}
