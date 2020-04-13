/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucundi.edu.co.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucundi.edu.co.modelo.Modelo;
import ucundi.edu.co.vista.Vista;

/**
 *
 * @author Christian
 */
public class Controlador implements ActionListener{
    
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void iniciar(){
        vista.setTitle("MVC");
        vista.setLocationRelativeTo(null);
        
    }

    
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
