/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.Graphics;
import modelo.*;
import modelo.InterfaceDibuja;


/**
 *
 * @author Usuario
 */
public class controladorTriangulo {
    
    private InterfaceDibuja inter;

    public controladorTriangulo() {
    }

    public controladorTriangulo(InterfaceDibuja inter) {
        this.inter = inter;
    }
    
    public void dibujar(Graphics g, int x, int y, int ancho, int alto, int numFilas, int[][] matriz){
        inter.triangulo(g, x, y, ancho, alto, numFilas, matriz);
    }

    
}
