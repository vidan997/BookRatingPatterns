/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import ui.MainForm;
import ui.controller.Controller;
/**
 *
 * @author vidan
 */
public class Main {
    public static void main(String[] args) {
        MainForm main = new MainForm();
       Controller con = new Controller(main);
       con.pokreni();
    }
}
