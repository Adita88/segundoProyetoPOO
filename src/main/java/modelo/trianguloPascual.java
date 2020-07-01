/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class trianguloPascual {
    
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
    
    
//    public static int[][] crearMatriz(int cantFilas){
//        
//        int [][] matriz = new int[cantFilas][11];
//        
//        for(int i = 0; i < cantFilas; i++){
//            for(int j = 0; j < 11; j++){
//                matriz[i][j] = 0;
//                //System.out.println(matriz[i][j]);
//                //System.out.println(matriz[i].length);
//                //System.out.println(matriz.length);
//            }
//            //System.out.println(matriz[i]);
//        }
        
        //System.out.println(matriz);
//        return matriz;
    
//    public static void crearListas(int cantFilas){
//        int[][] matriz = {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0}};
//
//        int numFila = 0;
//        
//        for(int i = 0; i < matriz.length; i++){
//            for(int j = 0; j < matriz[i].length; j++){
//                //System.out.println(Arrays.toString(matriz[i]));
//                System.out.println(matriz[i].length);
//                System.out.println(matriz.length);
//            }
//        }
//            if (cantFilas == 0){
//                
//            }
//            
//            while(cantFilas > 0){
//                
//            }
            
//        }
    
    public static String obtenerValor(String fila, int j){
        //System.out.println(fila + "entro");
        //System.out.println(fila.toCharArray()[j] + "entro2");
        return "";
    }
    
    public static ArrayList crearMatriz(int cantFilas){
        
        ArrayList matriz = new ArrayList<>();
        ArrayList lista= new ArrayList<>();
        try{
        lista.remove(lista.get(0));
        }catch (IndexOutOfBoundsException error){   
        }
        
        int k = 1;
        
        for(int i = 0; i < cantFilas; i++){
            for(int j = 0; j < k; j++){
                lista.add(formula(i, j));
            }
            k ++;
            matriz.add(lista);
            lista = new ArrayList();
        }
        return matriz;
    }
   
    
    public static void triangulo(Graphics g, int x, int y, int ancho, int alto, int numFilas, ArrayList matriz){
        int k = 1;
        int l = 0;
        int m = 1;
        int coordenadaX = x;
        int coordenadaY = y;
        System.out.println(matriz);
        //System.out.println(matriz.get(0).toString().charAt(m));
        for(int i = 1; i <= numFilas; i++){
            
            
            for(int j = 0; j < k; j++){
                System.out.println(obtenerValor(matriz.get(l).toString(), j));
                //coordenadaX -= ancho/2;
                if(j != 0){       
                
                    coordenadaX += ancho * j + ancho/2;
                    g.drawRect(coordenadaX, coordenadaY, ancho, alto);
                    g.drawString(String.valueOf(matriz.get(l).toString().charAt(m)), coordenadaX+12, coordenadaY+16);
                    //System.out.println(String.valueOf(matriz.get(l).toString()));
                    coordenadaX -= ancho * j;
                    m += 3;
                    
                }else {
                    g.drawRect(coordenadaX, coordenadaY, ancho, alto);
                    g.drawString(String.valueOf(matriz.get(l).toString().charAt(m)), coordenadaX+12, coordenadaY+16);
                    m += 3;
                }
                coordenadaX -= ancho/2;
                
            }  
            coordenadaY += alto;
            k ++;
            l ++;
            m = 1;
        }
        
    }
    
    
//    public static void triangulo(Graphics g, int x, int y, int ancho, int alto, int numFilas, ArrayList matriz){
//        int k = 1;
//        int l = 0;
//        int m = 1;
//        int n = 2;
//        int coordenadaX = x;
//        int coordenadaY = y;
//        System.out.println(matriz);
//        //System.out.println(matriz.get(0).toString().charAt(m));
//        for(int i = 1; i <= numFilas; i++){
//            
//            
//            for(int j = 0; j < k; j++){
//                //System.out.println(obtenerValor(matriz.get(l).toString(), j));
//                //coordenadaX -= ancho/2;
//                System.out.println(m + "m");
//                System.out.println(n + "n");
//                if(j != 0){       
//                
//                    coordenadaX += ancho * j + ancho/2;
//                    g.drawRect(coordenadaX, coordenadaY, ancho, alto);
//                    g.drawString(String.valueOf(matriz.get(l).toString().substring(m, n)), coordenadaX+12, coordenadaY+16);
//                    //System.out.println(matriz.get(l).toString().substring(m, n));
//                    coordenadaX -= ancho * j;
//                    m += 3;
//                    n += 3;
//                    
//                }else{
//                    g.drawRect(coordenadaX, coordenadaY, ancho, alto);
//                    g.drawString(String.valueOf(matriz.get(l).toString().charAt(m)), coordenadaX+12, coordenadaY+16);
//                    m += 3;
//                    n += 3;
//                }
//                coordenadaX -= ancho/2;
//                
//            }  
//            coordenadaY += alto;
//            k ++;
//            l ++;
//            m = 1;
//            n = 2;
//        }
//        
//    }

}
