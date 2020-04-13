/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista2;

/**
 *
 * @author ASUS
 */
public class Controlador implements ActionListener{
    
    private Vista2 view;
    
    private Modelo model;

    public Controlador(Vista2 view, Modelo model) {
        this.view = view;
        this.model = model;
    }
    
    public void iniciar(){
        view.setTitle("MVC");
        view.setLocationRelativeTo(null);
        
    }

    
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
    
    
}
