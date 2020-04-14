/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucundi.edu.co.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import ucundi.edu.co.controlador.Controlador;

/**
 *
 * @author Christian
 */
public class Vista extends JFrame {

    private JPanel panelSur, panelNorte, panelCentro, panelIzquierda, panelDerecha;
    private JList listaVista;
    private JTextField cajaTexto, registroTexto;
    private JButton botonBuscar, botonRegistrar;
    private JLabel titulo, pie, descripcion, labelRegistro;
    private Controlador controler = new Controlador();

    public Vista() {
        this.crearVista();
    }

    private void crearVista() {
        this.setSize(500, 500);  //tamaño de la ventana
        this.setLocation(300, 200);  //donde se localiza la ventana
        this.setTitle("Modelo Vista Controlador");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelSur = new JPanel();
        panelNorte = new JPanel();
        panelCentro = new JPanel();
        panelIzquierda = new JPanel();
        panelDerecha = new JPanel();

        this.crearPanels();
        this.add(this.panelSur, BorderLayout.SOUTH);
        this.add(this.panelNorte, BorderLayout.NORTH);
        this.add(this.panelCentro, BorderLayout.CENTER);
        this.add(this.panelIzquierda, BorderLayout.WEST);
        this.add(this.panelDerecha, BorderLayout.EAST);

    }

    private void crearPanels() {
        panelSur.setBackground(Color.red);
        panelNorte.setBackground(Color.BLACK);
        panelCentro.setBackground(Color.WHITE);
        panelIzquierda.setBackground(Color.CYAN);
        panelDerecha.setBackground(Color.cyan);

        titulo = new JLabel("Modelo Vista Controlador");
        titulo.setForeground(Color.white);
        pie = new JLabel("Presentado por: Cristians ^2");
        pie.setForeground(Color.white);
        descripcion = new JLabel("Digite lo que busca:");
        descripcion.setForeground(Color.black);
        labelRegistro = new JLabel("Registe el dato:");
        descripcion.setForeground(Color.black);

        this.listaVista = this.anadirLista();
        this.cajaTexto = this.anadirCaja(1000, 20);
        this.registroTexto = this.anadirCaja(100, 20);
        this.botonBuscar = this.anadirBoton("Buscar", 100, 20);
        this.botonRegistrar = this.anadirBoton("Registrar", 100, 20);

        panelNorte.add(this.titulo);
        panelDerecha.add(this.botonBuscar);
        panelIzquierda.add(this.labelRegistro);
        panelIzquierda.add(this.registroTexto);
        panelIzquierda.add(this.botonRegistrar);
        panelCentro.add(this.descripcion);
        panelCentro.add(this.cajaTexto);
        panelCentro.add(this.listaVista);
        panelSur.add(this.pie);

    }

    private JButton anadirBoton(String nombre, int x, int y) {
        JButton boton = new JButton(nombre);
        boton.setPreferredSize(new Dimension(x, y));
        boton.setActionCommand(nombre);
        System.out.println(nombre);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Buscar")) {
                    buscar();
                } else {
                    registrar();
                }
            }
        });
        return boton;
    }

    private void buscar() {
        System.out.println("buscar");
        if(cajaTexto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "LLene el campo de Busqueda", "Alerta", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String valor = cajaTexto.getText();
        controler.listar(valor);
    }

    private void registrar() {
        System.out.println("registrar");
        if(registroTexto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "LLene el campo de Registro", "Alerta", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String valor = registroTexto.getText();
        controler.registrar(valor);
    }
    
    

    private JList anadirLista() {
        JList lista = new JList();
        JScrollPane scroll = new JScrollPane();
        lista.setPreferredSize(new Dimension(1024, 200));
        scroll.setViewportView(lista);
        return lista;
    }

    private JTextField anadirCaja(int x, int y) {
        JTextField caja = new JTextField();
        caja.setPreferredSize(new Dimension(x, y));
        return caja;
    }

    public JList anadirObjetos() {
        JList lista = new JList();
        return lista;
    }

    public JTextField getCajaTexto() {
        return cajaTexto;
    }

    public void setCajaTexto(JTextField cajaTexto) {
        this.cajaTexto = cajaTexto;
    }

    public JTextField getRegistroTexto() {
        return registroTexto;
    }

    public void setRegistroTexto(JTextField registroTexto) {
        this.registroTexto = registroTexto;
    }

}
