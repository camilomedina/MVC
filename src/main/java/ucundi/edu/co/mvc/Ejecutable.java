/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucundi.edu.co.mvc;

import ucundi.edu.co.controlador.Controlador;
import ucundi.edu.co.modelo.Modelo;
import ucundi.edu.co.vista.Vista;

/**
 *
 * @author Christian
 */
public class Ejecutable {
    
     public static void main(String[] args) {
        // TODO code application logic here
        Modelo modelo= new Modelo();
        Vista vista= new Vista();
        
        Controlador ctrl = new Controlador(vista, modelo);
        ctrl.iniciar();
        vista.setVisible(true);
    
    
    }
    
}
