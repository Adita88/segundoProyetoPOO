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
public class SumaHorizontal extends TrianguloPascal{

    public SumaHorizontal() {
    }
    
    public SumaHorizontal(int[][] matriz) {
        super(matriz);
    }

    /**
     * Método que dibuja líneas que indica la fila de la que pertenece la potencia
     * @param g Elemento Graphics
     * @param x int que indica eje x
     * @param y int que indica eje y 
     * @param ancho int que idica el ancho de cada rectángulo que conforma el triángulo
     * @param alto int que indica el alto de cada rectángulo que conforma el triángulo
     * @param sumatoria Sumatoria de cada valor de la fila la cual se señala
     */
    public static void dibujarLineas(Graphics g, int x, int y, int ancho, int alto, int sumatoria){
        g.setColor(Color.BLACK);
        g.drawLine(x+175, y+10, ancho + 375, alto+10 );
        g.drawString(String.valueOf(sumatoria), x+225, y+10);
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
        int m = 30;
        int coordenadaX = x;
        int coordenadaY = y;
        int sumatoria = 0;
        
        if (numFilas > 0 && numFilas <= 10) {
            for(int i = 0; i < numFilas; i++){

                for(int j = 0; j < k; j++){
                    if(j != 0){       
                        if(i != 9){

                                g.setColor(Color.DARK_GRAY);
                                coordenadaX += ancho * j + ancho/2;
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.WHITE);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                                sumatoria += matriz[i][j];
                                coordenadaX -= ancho * j;

                        } else {

                                g.setColor(Color.DARK_GRAY);
                                coordenadaX += ancho * j + ancho/2;
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.WHITE);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
                                sumatoria += matriz[i][j];
                                coordenadaX -= ancho * j;
                            }

                    }else {
                        g.setColor(Color.DARK_GRAY);
                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                        g.setColor(Color.WHITE);
                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                        sumatoria += matriz[i][j];
                    }
                    coordenadaX -= ancho/2;
                }  
                if(i != 0){
                    dibujarLineas(g, x, y + m, ancho, alto + m, sumatoria);
                 
                    m += 30;
                } else {
                    dibujarLineas(g, x, y, ancho, alto, sumatoria);
                }
                coordenadaY += alto;
                k ++;
                sumatoria = 0;
            }
        } else {
            System.out.println("El valor debe ser de 1 a 10");
        }
    }
    
}
