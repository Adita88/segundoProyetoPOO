/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Fibronacci extends TrianguloPascal{

    public Fibronacci() {
    }
    
    public Fibronacci(int[][] matriz) {
        super(matriz);
    }
    
    /**
     * Método con la formula de Fibronacci
     * @param n número qeu ingresa para sumar su sucesión
     * @return int resultado fibronacci
     */
    public static int fibronacci(int n){
        if(n > 1){
            return fibronacci(n-1) + fibronacci(n-2);
        } else if(n == 1){
            return 1;
        } else if(n == 0){
            return 0;
        } else {
            return -1;
        }
    }
    
    /**
     * Método retorna un r, g, b random
     * @return Color random
     */
    public static Color colorR(){
        Random random = new Random();
        int r = random.nextInt(255);
        int gr = random.nextInt(255);
        int b = random.nextInt(255);
        
        return new Color(r, gr, b);
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
        
        Color color0 = colorR();
        Color color1 = colorR();
        Color color2 = colorR();
        Color color3 = colorR();
        Color color4 = colorR();
        Color color5 = colorR();
        Color color6 = colorR();
        Color color7 = colorR();
        Color color8 = colorR();
        Color color9 = colorR();
        
        int suma0 = 0;
        int suma1 = 1;
        int suma2 = 1;
        int suma3 = 1;
        int suma4 = 1;
        int suma5 = 1;
        int suma6 = 1;
        int suma7 = 1;
        int suma8 = 1;
        int suma9 = 1;
        
        if (numFilas > 0 && numFilas < 11) {
            for(int i = 0; i < numFilas; i++){

                for(int j = 0; j < k; j++){
                    if(j != 0){       
                        if(i != 9){
                            if(i == 1 && j==1){
                                coordenadaX += ancho * j + ancho/2;
                                g.setColor(color2);
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                                coordenadaX -= ancho * j;
                                suma2 += matriz[i][j];
                            }else if(i == 2 && j==1){
                                coordenadaX += ancho * j + ancho/2;
                                g.setColor(color3);
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                                coordenadaX -= ancho * j;
                                suma3 += matriz[i][j];
                            }else if((i == 2 && j == 2) || (i == 3 && j == 1)){
                                coordenadaX += ancho * j + ancho/2;
                                g.setColor(color4);
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                                coordenadaX -= ancho * j;
                                suma4 += matriz[i][j];
                            }else if((i == 3 && j == 2) || (i == 4 && j == 1)){
                                coordenadaX += ancho * j + ancho/2;
                                g.setColor(color5);
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                                coordenadaX -= ancho * j;
                                suma5 += matriz[i][j];
                            }else if((i == 3 && j == 3) || (i == 4 && j == 2)|| (i == 5 && j == 1)){
                                coordenadaX += ancho * j + ancho/2;
                                g.setColor(color6);
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                                coordenadaX -= ancho * j;
                                suma6 += matriz[i][j];
                            }else if((i == 4 && j == 3) || (i == 5 && j == 2)|| (i == 6 && j == 1)){
                                coordenadaX += ancho * j + ancho/2;
                                g.setColor(color7);
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                                coordenadaX -= ancho * j;
                                suma7 += matriz[i][j];
                            }else if((i == 4 && j == 4) || (i == 5 && j == 3)|| (i == 6 && j == 2) || (i == 7 && j == 1)){
                                coordenadaX += ancho * j + ancho/2;
                                g.setColor(color8);
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                                coordenadaX -= ancho * j;
                                suma8 += matriz[i][j];
                            }else if((i == 5 && j == 4) || (i == 6 && j == 3)|| (i == 7 && j == 2) || (i == 8 && j == 1)){
                                coordenadaX += ancho * j + ancho/2;
                                g.setColor(color9);
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                                coordenadaX -= ancho * j;
                                suma9 += matriz[i][j];
                            } else {
                                coordenadaX += ancho * j + ancho/2;
                                g.setColor(Color.WHITE);
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                                coordenadaX -= ancho * j;
                            }
                        } else {
                            if (j == 0){
                                g.setColor(color9);
                                coordenadaX += ancho * j + ancho/2;
                                g.drawRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
                                coordenadaX -= ancho * j;

                            }else {
                                g.setColor(Color.WHITE);
                                coordenadaX += ancho * j + ancho/2;
                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                                g.setColor(Color.BLACK);
                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
                                coordenadaX -= ancho * j;
                            }
                        }
                    }else {
                        if (i == 0){
                            g.setColor(color0);
                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                            g.setColor(Color.BLACK);
                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                            suma0 += matriz[i][j];

                        } else if (i == 1){
                            g.setColor(color1);
                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                            g.setColor(Color.BLACK);
                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);

                        }else if (i == 2){
                            g.setColor(color2);
                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                            g.setColor(Color.BLACK);
                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);

                        }else if (i == 3){
                            g.setColor(color3);
                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                            g.setColor(Color.BLACK);
                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);

                        }else if (i == 4){
                            g.setColor(color4);
                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                            g.setColor(Color.BLACK);
                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);

                        }else if (i == 5){
                            g.setColor(color5);
                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                            g.setColor(Color.BLACK);
                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);

                        }else if (i == 6){
                            g.setColor(color6);
                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                            g.setColor(Color.BLACK);
                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);

                        }else if (i == 7){
                            g.setColor(color7);
                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                            g.setColor(Color.BLACK);
                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);

                        }else if (i == 8){
                            g.setColor(color8);
                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                            g.setColor(Color.BLACK);
                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);

                        } else {
                            g.setColor(color9);
                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
                            g.setColor(Color.BLACK);
                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
                        }

                    }
                    coordenadaX -= ancho/2;

                }  
                coordenadaY += alto;
                k ++;

                if (i == 0){
                    g.setColor(color0);
                    g.fillRect(20, m, ancho, alto);
                    g.setColor(Color.BLACK);
                    g.drawString(String.valueOf(suma0), ancho, alto+m-10);
                } else if (i == 1){
                    g.setColor(color1);
                    g.fillRect(20, m, ancho, alto);
                    g.setColor(Color.BLACK);
                    g.drawString(String.valueOf(suma1), ancho, alto+m-10);
                } else  if (i == 2){
                    g.setColor(color2);
                    g.fillRect(20, m, ancho, alto);
                    g.setColor(Color.BLACK);
                    g.drawString(String.valueOf(suma2), ancho, alto+m-10);
                } else  if (i == 3){
                    g.setColor(color3);
                    g.fillRect(20, m, ancho, alto);
                    g.setColor(Color.BLACK);
                    g.drawString(String.valueOf(suma3), ancho, alto+m-10);
                } else  if (i == 4){
                    g.setColor(color4);
                    g.fillRect(20, m, ancho, alto);
                    g.setColor(Color.BLACK);
                    g.drawString(String.valueOf(suma4), ancho, alto+m-10);
                } else  if (i == 5){
                    g.setColor(color5);
                    g.fillRect(20, m, ancho, alto);
                    g.setColor(Color.BLACK);
                    g.drawString(String.valueOf(suma5), ancho, alto+m-10);
                } else  if (i == 6){
                    g.setColor(color6);
                    g.fillRect(20, m, ancho, alto);
                    g.setColor(Color.BLACK);
                    g.drawString(String.valueOf(suma6), ancho, alto+m-10);
                } else  if (i == 7){
                    g.setColor(color7);
                    g.fillRect(20, m, ancho, alto);
                    g.setColor(Color.BLACK);
                    g.drawString(String.valueOf(suma7), ancho, alto+m-10);
                } else  if (i == 8){
                    g.setColor(color8);
                    g.fillRect(20, m, ancho, alto);
                    g.setColor(Color.BLACK);
                    g.drawString(String.valueOf(suma8), ancho, alto+m-10);
                } else {
                    g.setColor(color9);
                    g.fillRect(20, m, ancho, alto);
                    g.setColor(Color.BLACK);
                    g.drawString(String.valueOf(suma9), ancho, alto+m-10);
                }

                m += 30;
            }
        } else {
            System.out.println("El valor debe ser entre 1 y 10");
        }
        
    }
    
}
