/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.comp;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import controller.Controller;
import domain.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vidan
 */
public class TableModelPrilozi extends javax.swing.table.AbstractTableModel {

    private List<Prilozi> prilozi;
    private int[] kolicinaPriloga = new int[]{0, 0, 0, 0, 0};
    private String[] columnNames = new String[]{"Prilog", "Kolicina"};
    
    public TableModelPrilozi() {
        prilozi = Controller.getInstance().vratiPriloge();
    }

    @Override
    public int getRowCount() {
        return prilozi.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public Object getValueAt(int x, int y) {
        Prilozi item = prilozi.get(x);
        switch (y) {
            case 0:
                return item.toString();
            case 1:
                return kolicinaPriloga[x];
            default:
                return "n/a";
        }
    }

    public Prilozi uvecaj(int y) throws CloneNotSupportedException {
        setValueAt(kolicinaPriloga[y] + 1, y, 1);
        fireTableDataChanged();
        return (Prilozi) prilozi.get(y).clone();
    }

    @Override
    public void setValueAt(Object aValue, int x, int y) {
        switch (y) {
            case 0:
                return;
            case 1:
                kolicinaPriloga[x]++;
            default:
                return;
        }
        
    }

    public void promeni() {
        for (int kol : kolicinaPriloga) {
            kol = 0;
        }
        fireTableDataChanged();
    }


}
