/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.controller;

import domain.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ui.MainForm;
import ui.comp.TableModelPrilozi;

/**
 *
 * @author vidan
 */
public class Controller {

    private final MainForm main;
    private TableModelPrilozi table;
    private Pizza pizza;

    public Controller(MainForm main) {
        this.main = main;
        povezi();
    }

    public void pokreni(){
        main.setVisible(true);
    
    }
    
    public void povezi() {
        table = new TableModelPrilozi();
        main.getTblPrilozi().setModel(table);
        postaviOsluskivace();
    }

    private void postaviOsluskivace() {
        javax.swing.JComboBox cmbTesto = main.getCmbTesto();
        cmbTesto.removeAllItems();
        cmbTesto.addItem(new ClassicPizza());
        cmbTesto.addItem(new NewYorkStyle());

        javax.swing.JTextField txtCena = main.getTxtCena();
        javax.swing.JTable tblPrilozi = main.getTblPrilozi();

        javax.swing.JButton btnNaruci = main.getBtnNaruci();
        javax.swing.JButton btnDodaj = main.getBtnDodaj();

        tblPrilozi.setModel(table);

        cmbTesto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizza = (Pizza) cmbTesto.getSelectedItem();
                table.promeni();
            }
        });

        btnDodaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = tblPrilozi.getSelectedRow();
                Prilozi prilog;
                try {
                    prilog = table.uvecaj(row);
                    prilog.setNext(pizza);
                    pizza = prilog;
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                }

                txtCena.setText(pizza.vratiCenu() + "");
            }
        });

        btnNaruci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    pizza = controller.Controller.getInstance().savePizza(pizza);
                    JOptionPane.showMessageDialog(main, "ID: [" + pizza.getId() + "]\n" + pizza.vratiOpis(), "Narucena", WIDTH);

                } catch (Exception ex) {
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.exit(1);
            }
        });
    }
}
