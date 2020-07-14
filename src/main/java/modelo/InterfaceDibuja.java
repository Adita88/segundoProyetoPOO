/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Graphics;

/**
 *
 * @author Usuario
 */
public interface InterfaceDibuja {
    
    void triangulo(Graphics g, int x, int y, int ancho, int alto, int numFilas, int[][] matriz);
}
