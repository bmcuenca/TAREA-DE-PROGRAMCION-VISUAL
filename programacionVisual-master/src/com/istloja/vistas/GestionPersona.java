/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vistas;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *

 */
public class GestionPersona extends JFrame{
    
    private JPanel panelTitulo = new JPanel();
    private JPanel panelCuerpo = new JPanel();

    public GestionPersona() {
        //Mostrar Pantalla
        this.show();
        //Titulo de la venta
        this.setTitle("Ventana");
        //Tamanio Inicial de la venta
        this.setSize(400,600);
//        JPanel panel = new JPanel();
//        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
      
        //Se agregar un layout distribuir los componentes.
        panelTitulo.setLayout(new FlowLayout());
        JLabel label = new JLabel("Registro de personas.");   
        panelTitulo.add(label);
        //Agrege el panel al Jframe
//        panel.add(panelTitulo);
        panelCuerpo.setLayout(new GridLayout(4,2));
        panelCuerpo.add(new JLabel("cedula:"));
        panelCuerpo.add(new JTextField("John Patricio"));
        panelCuerpo.add(new JLabel("cedula:"));
  

//        panel.add(panelCuerpo);
        this.add(panelCuerpo);
        //Centrar la pantalla
        this.setLocationRelativeTo(null);  
        this.setSize(new Dimension(1024, 768));
        //Fin al programa.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
       
    }
    
    
    
}
