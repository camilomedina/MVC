/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucundi.edu.co.controlador;

import java.awt.TextField;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTextField;
import ucundi.edu.co.modelo.Modelo;
import ucundi.edu.co.vista.Vista;

/**
 *
 * @author Christian
 */
public class Controlador {

    private Vista vista;
    private   Modelo modelo = new Modelo();
    private List<String> vector = new ArrayList<>();

    public Controlador() {
    }

    ;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public List listar(String valor) {
        vector = modelo.getVector();
        return vector;
    }

    public void registrar(String valor) {
        try {
            String mostrar = valor;
            vector.add(mostrar);
            modelo.setVector(vector);
            for (String vector1 : modelo.getVector()) {
                System.out.println(vector1);
            }
            
            System.out.println(modelo.getVector().size());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }

}
