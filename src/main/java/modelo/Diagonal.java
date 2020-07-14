/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Usuario
 */
public class Diagonal extends TrianguloPascal{

    public Diagonal() {
    }
    
    
    public Diagonal(int[][] matriz) {
        super(matriz);
    }

    
     /**
     * Dibuja el triangulo de Pascal y lo modifica para qeu se visualice la sucesión de Fibronacci
     * @param g elemento Graphic
     * @param x int que indica eje x
     * @param y int que indica eje y 
     * @param ancho int que idica el ancho de cada rectángulo que conforma el triángulo
     * @param alto int que indica el alto de cada rectángulo que conforma el triángulo
     * @param numFilas int que indica el número de filas que tiene que tener el triángulo
     * @param matriz int[][] que contiene la información que llena el triángulo
     */
    @Override
    public void triangulo(Graphics g, int x, int y, int ancho, int alto, int numFilas, int[][] matriz){
        int k = 1;
        int coordenadaX = x;
        int coordenadaY = y;
        
        if (numFilas > 0 && numFilas < 11) {
        
            for(int i = 0; i < numFilas; i++){

                for(int j = 0; j < k; j++){
                    if(j != 0){       
                        if(i != 9){
                            if (j == 1){
                                coordenadaX += ancho * j + ancho/2;
                                g.setColor(Color.GREEN);
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                                coordenadaX -= ancho * j;
                            } else if (j == 2){
                                coordenadaX += ancho * j + ancho/2;
                                g.setColor(Color.CYAN);
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                                coordenadaX -= ancho * j;
                            }else if (j == 3){
                                g.setColor(Color.RED);
                                coordenadaX += ancho * j + ancho/2;
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                                coordenadaX -= ancho * j;
                            } else {
                                g.setColor(Color.WHITE);
                                coordenadaX += ancho * j + ancho/2;
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                                coordenadaX -= ancho * j;
                            }
                        } else {
                             if (j == 1){
                                coordenadaX += ancho * j + ancho/2;
                                g.setColor(Color.GREEN);
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
                                coordenadaX -= ancho * j;
                            } else if (j == 2){
                                coordenadaX += ancho * j + ancho/2;
                                g.setColor(Color.CYAN);
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
                                coordenadaX -= ancho * j;
                            }else if (j == 3){
                                g.setColor(Color.RED);
                                coordenadaX += ancho * j + ancho/2;
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
                                coordenadaX -= ancho * j;
                            } else {
                                g.setColor(Color.WHITE);
                                coordenadaX += ancho * j + ancho/2;
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
                                coordenadaX -= ancho * j;
                            }
                        }
                    }else {
                        g.setColor(Color.DARK_GRAY);
                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                        g.setColor(Color.WHITE);
                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                    }
                    coordenadaX -= ancho/2;
                }  
                coordenadaY += alto;
                k ++;
            }
        } else {
            System.out.println("El valor debe ser entre 1 y 10");
        }
    } 
}
