/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio0301;

/**
 *
 * @author CESAR
 */
public class Principal0301 {
     public static void main(String[] args) {
        
        
        
        var ventanaBorderLayout = new Ventana1("BorderLayout", 400, 120, 0, 0);
        ventanaBorderLayout.setVisible(true);
        
        var ventanaGridLayout = new Ventana2("GridLayout", 220, 150, 450, 0);
        ventanaGridLayout.setVisible(true);
        
        var ventanaFlowLayout = new Ventana3("FlowLayout", 400, 100, 700, 0);
        ventanaFlowLayout.setVisible(true);
        
        var ventananoruega = new VentanaDis("BorderLayout", 500, 220, 500,200 );
        ventananoruega.setVisible(true);
    }
}