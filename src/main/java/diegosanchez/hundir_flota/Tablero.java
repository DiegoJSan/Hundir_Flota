package diegosanchez.hundir_flota;

import java.util.Random;


public class Tablero {
    int [][] casilla;
    
    public void generar (){ //void = retorno , generar = nombre de la clase. Se declara el método
        
        casilla = new int[10][10];
        
        int PosicionX = getNumeroAleatorio(0,9);
        int PosicionY = getNumeroAleatorio(0,9);
        System.out.println("x = " + PosicionX + "  y = " + PosicionY);
        casilla[PosicionX][PosicionY] = 1;
        //Generarn 10 filas del tablero
        /*for(int y=0; y<10; y++){
            //Generar 10 columnas del tablero
            for(int x=0; x<10; x++){
                casilla[x][y] = getBarcoAleatorio(1,90);
            }
        }*/
        
        mostrarPorConsola();
    } 
    
    
    
    // Muestra los números
    public void mostrarPorConsola(){
        //Bucle filas
        for(int y=0; y<10; y++){
            //Bucles columnas
            for(int x=0; x<10; x++){
                //System.out.println("x=" + x + "y=" + y);
                System.out.print(casilla [x][y] + " ");
            }
            System.out.println();
        }
    }
    
     public int getNumeroAleatorio(int min, int max){   // get= dame , generar
        Random random = new Random ();
        // nim = 1, max = 6
        int num = random.nextInt(max-min+1) + min;    // 3 = cantidad de numeros  5 = el numero maximo
        return num;
     }
}
