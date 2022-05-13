/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio0301;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author CESAR
 */
public class Ventana3 extends JFrame {
    private final JPanel jpanelPrincipal;
    private final ArrayList<JPanel> jpanelList;
    private final ArrayList<JLabel> jlabelList;

    public Ventana3(String titulo, int ancho, int alto, int posX, int posY)  {
        jpanelPrincipal = new JPanel();
        jpanelList = new ArrayList<>();
        jlabelList = new ArrayList<>();
        this.setTitle(titulo);
        this.setSize(ancho, alto);
        this.setLocation(posX, posY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(jpanelPrincipal);
        iniciarComponentesVentana();
        configurarLayout();
    }
    
    private void iniciarComponentesVentana(){
        
        this.jpanelList.add(new JPanel());
        this.jpanelList.get(0).setBackground(Color.GRAY);
        
        this.jpanelList.add(new JPanel());
        this.jpanelList.get(1).setBackground(Color.RED);

        this.jpanelList.add(new JPanel());
        this.jpanelList.get(2).setBackground(Color.CYAN);
        
        this.jpanelList.add(new JPanel());
        this.jpanelList.get(3).setBackground(Color.BLUE);
        
        this.jpanelList.add(new JPanel());
        this.jpanelList.get(4).setBackground(Color.GREEN);
      
        for (int i = 0; i < 5; i++) {
            jpanelList.add(new JPanel());
            jlabelList.add(new JLabel("Button "+(i+1)));
        }
        
        
        
        for (int i = 0; i < 5; i++) {
            jpanelList.get(i).add(jlabelList.get(i));
        }
    }
    
    private void configurarLayout(){
        jpanelPrincipal.setLayout(new FlowLayout());
        for (int i = 0; i < 5; i++) {
            jpanelPrincipal.add(jpanelList.get(i));
        }
    }
    
}