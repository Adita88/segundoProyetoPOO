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
public class logica {
    
    public static int factorial(int n){
        if (n == 0){
            return 1;
        } else {
            return (n * factorial(n-1));
        }
    }
    
    public static int formula(int x, int y){
        int formula = (factorial(x))/(factorial(y)*factorial(x-y));
        return formula;
    }
    
    public static int[][] crearMatriz(int cantFilas){
        
        int[][] matriz = new int[11][11];
        int k = 1;
        
        for(int i = 0; i < cantFilas; i++){
            //System.out.println(matriz[i]);
            for(int j = 0; j < k; j++){
                matriz[i][j] = formula(i, j);
            }
            k ++;
        }
        return matriz;
    }
    
//    /**
//     PARES E IMPARES
//     **/
//    public static void triangulo(Graphics g, int x, int y, int ancho, int alto, int numFilas, int[][] matriz){
//        int k = 1;
//        int coordenadaX = x;
//        int coordenadaY = y;
//        
//        for(int i = 0; i < numFilas; i++){
//            
//            for(int j = 0; j < k; j++){
//                if(j != 0){       
//                    if(i != 9){
//                        if (matriz[i][j] % 2 != 0){
//                            g.setColor(Color.GREEN);
//                            coordenadaX += ancho * j + ancho/2;
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                        } else {
//                            g.setColor(Color.BLACK);
//                            coordenadaX += ancho * j + ancho/2;
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.WHITE);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                        }
//                        
//                    } else {
//                        if(matriz[i][j] % 2 != 0){
//                            g.setColor(Color.GREEN);
//                            coordenadaX += ancho * j + ancho/2;
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
//                            coordenadaX -= ancho * j;
//                        } else {
//                            g.setColor(Color.BLACK);
//                            coordenadaX += ancho * j + ancho/2;
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.WHITE);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
//                            coordenadaX -= ancho * j;
//                        }
//                        
//                    }
//                }else {
//                    g.setColor(Color.GREEN);
//                    g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                    g.setColor(Color.BLACK);
//                    g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                }
//                coordenadaX -= ancho/2;
//                
//            }  
//            coordenadaY += alto;
//            k ++;
//        }
//        
//    }
    
    
//    /**
//     SUMA HORIZONTAL
//     **/
//    public static void dibujarLineas(Graphics g, int x, int y, int ancho, int alto, int sumatoria){
//        g.setColor(Color.BLACK);
//        g.drawLine(x+200, y+10, ancho + 500, alto+10 );
//        g.drawString(String.valueOf(sumatoria), x+250, y+10);
//    }
//    public static void triangulo(Graphics g, int x, int y, int ancho, int alto, int numFilas, int[][] matriz){
//        int k = 1;
//        int m = 30;
//        int coordenadaX = x;
//        int coordenadaY = y;
//        int sumatoria = 0;
//        
//        if (numFilas <= 10) {
//            for(int i = 0; i < numFilas; i++){
//
//                for(int j = 0; j < k; j++){
//                    if(j != 0){       
//                        if(i != 9){
//
//                                g.setColor(Color.DARK_GRAY);
//                                coordenadaX += ancho * j + ancho/2;
//                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                                g.setColor(Color.WHITE);
//                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                                sumatoria += matriz[i][j];
//
//                                coordenadaX -= ancho * j;
//
//
//                        } else {
//
//                                g.setColor(Color.DARK_GRAY);
//                                coordenadaX += ancho * j + ancho/2;
//                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                                g.setColor(Color.WHITE);
//                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
//                                sumatoria += matriz[i][j];
//                                coordenadaX -= ancho * j;
//                            }
//
//                    }else {
//                        g.setColor(Color.DARK_GRAY);
//                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                        g.setColor(Color.WHITE);
//                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                        sumatoria += matriz[i][j];
//                    }
//                    coordenadaX -= ancho/2;
//                }  
//                if(i != 0){
//                    dibujarLineas(g, x, y + m, ancho, alto + m, sumatoria);
//                 
//                    m += 30;
//                } else {
//                    dibujarLineas(g, x, y, ancho, alto, sumatoria);
//                }
//                coordenadaY += alto;
//                k ++;
//                sumatoria = 0;
//            }
//        
//        } else {
//            System.out.println("El valor debe ser de 1 a 10");
//        }
//    }
   
//    /**
//     SIMETRIA
//     **/
//
//    public static void triangulo(Graphics g, int x, int y, int ancho, int alto, int numFilas, int[][] matriz){
//        int k = 1;
//        int coordenadaX = x;
//        int coordenadaY = y;
//        int cantidad = 0;
//        
//        if (numFilas <= 10) {
//            for(int i = 0; i < numFilas; i++){
//                for(int j = 0; j < k; j++){
//                    cantidad += 1;
//                }
//
//                for(int j = 0; j < k; j++){
//                    if (i == 0 && j == 0) {
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                        g.setColor(Color.DARK_GRAY);
//                        g.fillRect(coordenadaX, coordenadaY, ancho/2, alto);
//                        g.setColor(Color.WHITE);
//                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                    } else if(j != 0){       
//                        if(i != 9){
//                            if (cantidad % 2 == 0){
//                                if(j < cantidad / 2){
//                                    g.setColor(Color.DARK_GRAY);
//                                    coordenadaX += ancho * j + ancho/2;
//                                    g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                                    g.setColor(Color.WHITE);
//                                    g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                                    coordenadaX -= ancho * j;
//                                } else {
//                                    g.setColor(Color.LIGHT_GRAY);
//                                    coordenadaX += ancho * j + ancho/2;
//                                    g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                                    g.setColor(Color.WHITE);
//                                    g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                                    coordenadaX -= ancho * j;
//                                }
//                            } else {
//                                if(j == (int)Math.floor(cantidad / 2)) {
//                                    coordenadaX += ancho * j + ancho/2;
//                                    g.setColor(Color.LIGHT_GRAY);
//                                    g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                                    g.setColor(Color.DARK_GRAY);
//                                    g.fillRect(coordenadaX, coordenadaY, ancho/2, alto);
//                                    g.setColor(Color.WHITE);
//                                    g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                                    coordenadaX -= ancho * j;
//                                }
//                                 else if(j <= cantidad / 2){
//                                    g.setColor(Color.DARK_GRAY);
//                                    coordenadaX += ancho * j + ancho/2;
//                                    g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                                    g.setColor(Color.WHITE);
//                                    g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                                    coordenadaX -= ancho * j;
//                                } else {
//                                    g.setColor(Color.LIGHT_GRAY);
//                                    coordenadaX += ancho * j + ancho/2;
//                                    g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                                    g.setColor(Color.WHITE);
//                                    g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                                    coordenadaX -= ancho * j;
//                                }
//                            }
//
//                        } else {
//                            if (j < 5){
//                                g.setColor(Color.DARK_GRAY);
//                                coordenadaX += ancho * j + ancho/2;
//                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                                g.setColor(Color.WHITE);
//                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
//                                coordenadaX -= ancho * j;
//                            } else {
//                                g.setColor(Color.LIGHT_GRAY);
//                                coordenadaX += ancho * j + ancho/2;
//                                g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                                g.setColor(Color.WHITE);
//                                g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
//                                coordenadaX -= ancho * j;
//                            }
//                              
//                        }
//
//                    }else {
//                        g.setColor(Color.DARK_GRAY);
//                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                        g.setColor(Color.WHITE);
//                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                    }
//                    coordenadaX -= ancho/2;
//                }  
//                cantidad = 0;
//                coordenadaY += alto;
//                k ++;
//            }
//        
//        } else {
//            System.out.println("El valor debe ser de 1 a 10");
//        }
//    }
    
//    /**
//     DIAGONALES
//     **/
//
//    public static void triangulo(Graphics g, int x, int y, int ancho, int alto, int numFilas, int[][] matriz){
//        int k = 1;
//        int coordenadaX = x;
//        int coordenadaY = y;
//        
//        for(int i = 0; i < numFilas; i++){
//            
//            for(int j = 0; j < k; j++){
//                if(j != 0){       
//                    if(i != 9){
//                        if (j == 1){
//                            coordenadaX += ancho * j + ancho/2;
//                            g.setColor(Color.GREEN);
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                        } else if (j == 2){
//                            coordenadaX += ancho * j + ancho/2;
//                            g.setColor(Color.CYAN);
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                        }else if (j == 3){
//                            g.setColor(Color.RED);
//                            coordenadaX += ancho * j + ancho/2;
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                        } else {
//                            g.setColor(Color.WHITE);
//                            coordenadaX += ancho * j + ancho/2;
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                        }
//                    } else {
//                         if (j == 1){
//                            coordenadaX += ancho * j + ancho/2;
//                            g.setColor(Color.GREEN);
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
//                            coordenadaX -= ancho * j;
//                        } else if (j == 2){
//                            coordenadaX += ancho * j + ancho/2;
//                            g.setColor(Color.CYAN);
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
//                            coordenadaX -= ancho * j;
//                        }else if (j == 3){
//                            g.setColor(Color.RED);
//                            coordenadaX += ancho * j + ancho/2;
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
//                            coordenadaX -= ancho * j;
//                        } else {
//                            g.setColor(Color.WHITE);
//                            coordenadaX += ancho * j + ancho/2;
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
//                            coordenadaX -= ancho * j;
//                        }
//                    }
//                }else {
//                    g.setColor(Color.DARK_GRAY);
//                    g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                    g.setColor(Color.WHITE);
//                    g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                }
//                coordenadaX -= ancho/2;
//                
//            }  
//            coordenadaY += alto;
//            k ++;
//        }
//        
//    }
//    /**
////     Sucesión de FIBRONACCI
////     **/
//    
//    
//    public static int fibronacci(int n){
//        if(n > 1){
//            return fibronacci(n-1) + fibronacci(n-2);
//        } else if(n == 1){
//            return 1;
//        } else if(n == 0){
//            return 0;
//        } else {
//            return -1;
//        }
//    }
//    
//    public static void dibujarCuadros(Graphics g, int x, int y, int ancho, int alto, int numFilas, int[][] matriz, Color color){
//        int k = 1;
//        for(int i = 0; i < numFilas; i++){
//            
//            for(int j = 0; j < k; j++){
//                int a = 0;
//            }
//            k ++;
//            g.setColor(color);
//            g.drawRect(x, y, ancho, alto);
//            //g.drawString("1", ancho+30, alto+y-10);
//        }
//    }
//    
//    public static Color colorR(){
//        Random random = new Random();
//        int r = random.nextInt(255);
//        int gr = random.nextInt(255);
//        int b = random.nextInt(255);
//        
//        return new Color(r, gr, b);
//    }
//    public static void triangulo(Graphics g, int x, int y, int ancho, int alto, int numFilas, int[][] matriz){
//        int k = 1;
//        int m = 30;
//        int coordenadaX = x;
//        int coordenadaY = y;
//        
//        Color color0 = colorR();
//        Color color1 = colorR();
//        Color color2 = colorR();
//        Color color3 = colorR();
//        Color color4 = colorR();
//        Color color5 = colorR();
//        Color color6 = colorR();
//        Color color7 = colorR();
//        Color color8 = colorR();
//        Color color9 = colorR();
//        
//        int suma0 = 0;
//        int suma1 = 1;
//        int suma2 = 1;
//        int suma3 = 1;
//        int suma4 = 1;
//        int suma5 = 1;
//        int suma6 = 1;
//        int suma7 = 1;
//        int suma8 = 1;
//        int suma9 = 1;
//        
//        for(int i = 0; i < numFilas; i++){
//            
//            for(int j = 0; j < k; j++){
//                if(j != 0){       
//                    if(i != 9){
//                        if(i == 1 && j==1){
//                            coordenadaX += ancho * j + ancho/2;
//                            g.setColor(color2);
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                            suma2 += matriz[i][j];
//                        }else if(i == 2 && j==1){
//                            coordenadaX += ancho * j + ancho/2;
//                            g.setColor(color3);
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                            suma3 += matriz[i][j];
//                        }else if((i == 2 && j == 2) || (i == 3 && j == 1)){
//                            coordenadaX += ancho * j + ancho/2;
//                            g.setColor(color4);
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                            suma4 += matriz[i][j];
//                        }else if((i == 3 && j == 2) || (i == 4 && j == 1)){
//                            coordenadaX += ancho * j + ancho/2;
//                            g.setColor(color5);
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                            suma5 += matriz[i][j];
//                        }else if((i == 3 && j == 3) || (i == 4 && j == 2)|| (i == 5 && j == 1)){
//                            coordenadaX += ancho * j + ancho/2;
//                            g.setColor(color6);
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                            suma6 += matriz[i][j];
//                        }else if((i == 4 && j == 3) || (i == 5 && j == 2)|| (i == 6 && j == 1)){
//                            coordenadaX += ancho * j + ancho/2;
//                            g.setColor(color7);
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                            suma7 += matriz[i][j];
//                        }else if((i == 4 && j == 4) || (i == 5 && j == 3)|| (i == 6 && j == 2) || (i == 7 && j == 1)){
//                            coordenadaX += ancho * j + ancho/2;
//                            g.setColor(color8);
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                            suma8 += matriz[i][j];
//                        }else if((i == 5 && j == 4) || (i == 6 && j == 3)|| (i == 7 && j == 2) || (i == 8 && j == 1)){
//                            coordenadaX += ancho * j + ancho/2;
//                            g.setColor(color9);
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                            suma9 += matriz[i][j];
//                        } else {
//                            coordenadaX += ancho * j + ancho/2;
//                            g.setColor(Color.WHITE);
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                            coordenadaX -= ancho * j;
//                        }
//                    } else {
//                        if (j == 0){
//                            g.setColor(color9);
//                            coordenadaX += ancho * j + ancho/2;
//                            g.drawRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
//                            coordenadaX -= ancho * j;
//                            
//                        }else {
//                            g.setColor(Color.WHITE);
//                            coordenadaX += ancho * j + ancho/2;
//                            g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                            g.setColor(Color.BLACK);
//                            g.drawString(String.valueOf(matriz[i][j]), coordenadaX+8, coordenadaY+18);
//                            coordenadaX -= ancho * j;
//                        }
//                        
//                    }
//                }else {
//                    if (i == 0){
//                        g.setColor(color0);
//                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                        g.setColor(Color.BLACK);
//                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                        suma0 += matriz[i][j];
//                        
//                    } else if (i == 1){
//                        g.setColor(color1);
//                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                        g.setColor(Color.BLACK);
//                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                        
//                    }else if (i == 2){
//                        g.setColor(color2);
//                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                        g.setColor(Color.BLACK);
//                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                        
//                    }else if (i == 3){
//                        g.setColor(color3);
//                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                        g.setColor(Color.BLACK);
//                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                        
//                    }else if (i == 4){
//                        g.setColor(color4);
//                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                        g.setColor(Color.BLACK);
//                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                        
//                    }else if (i == 5){
//                        g.setColor(color5);
//                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                        g.setColor(Color.BLACK);
//                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                        
//                    }else if (i == 6){
//                        g.setColor(color6);
//                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                        g.setColor(Color.BLACK);
//                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                        
//                    }else if (i == 7){
//                        g.setColor(color7);
//                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                        g.setColor(Color.BLACK);
//                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                        
//                    }else if (i == 8){
//                        g.setColor(color8);
//                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                        g.setColor(Color.BLACK);
//                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                        
//                    } else {
//                        g.setColor(color9);
//                        g.fillRect(coordenadaX, coordenadaY, ancho, alto);
//                        g.setColor(Color.BLACK);
//                        g.drawString(String.valueOf(matriz[i][j]), coordenadaX+12, coordenadaY+16);
//                    }
//                    
//                }
//                coordenadaX -= ancho/2;
//                
//            }  
//            coordenadaY += alto;
//            k ++;
//            
//            //dibujarCuadros(g, 50, m, 30, 30, numFilas, matriz);
//            
//            if (i == 0){
//                g.setColor(color0);
//                g.fillRect(50, m, ancho, alto);
//                g.setColor(Color.BLACK);
//                g.drawString(String.valueOf(suma0), ancho+30, alto+m-10);
//            } else if (i == 1){
//                g.setColor(color1);
//                g.fillRect(50, m, ancho, alto);
//                g.setColor(Color.BLACK);
//                g.drawString(String.valueOf(suma1), ancho+30, alto+m-10);
//            } else  if (i == 2){
//                g.setColor(color2);
//                g.fillRect(50, m, ancho, alto);
//                g.setColor(Color.BLACK);
//                g.drawString(String.valueOf(suma2), ancho+30, alto+m-10);
//            } else  if (i == 3){
//                g.setColor(color3);
//                g.fillRect(50, m, ancho, alto);
//                g.setColor(Color.BLACK);
//                g.drawString(String.valueOf(suma3), ancho+30, alto+m-10);
//            } else  if (i == 4){
//                g.setColor(color4);
//                g.fillRect(50, m, ancho, alto);
//                g.setColor(Color.BLACK);
//                g.drawString(String.valueOf(suma4), ancho+30, alto+m-10);
//            } else  if (i == 5){
//                g.setColor(color5);
//                g.fillRect(50, m, ancho, alto);
//                g.setColor(Color.BLACK);
//                g.drawString(String.valueOf(suma5), ancho+30, alto+m-10);
//            } else  if (i == 6){
//                g.setColor(color6);
//                g.fillRect(50, m, ancho, alto);
//                g.setColor(Color.BLACK);
//                g.drawString(String.valueOf(suma6), ancho+30, alto+m-10);
//            } else  if (i == 7){
//                g.setColor(color7);
//                g.fillRect(50, m, ancho, alto);
//                g.setColor(Color.BLACK);
//                g.drawString(String.valueOf(suma7), ancho+30, alto+m-10);
//            } else  if (i == 8){
//                g.setColor(color8);
//                g.fillRect(50, m, ancho, alto);
//                g.setColor(Color.BLACK);
//                g.drawString(String.valueOf(suma8), ancho+30, alto+m-10);
//            } else {
//                g.setColor(color9);
//                g.fillRect(50, m, ancho, alto);
//                g.setColor(Color.BLACK);
//                g.drawString(String.valueOf(suma9), ancho+30, alto+m-10);
//            }
//            
//            m += 30;
//        }
//        
//    }
}
