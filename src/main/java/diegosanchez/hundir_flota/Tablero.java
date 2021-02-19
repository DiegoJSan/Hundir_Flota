package diegosanchez.hundir_flota;

import java.util.Random;


public class Tablero {
    //Array para la creacion del tablero con los barcos
    int [][] barco;
    // Variables para horizontal o vertical
    int vertical;
    int horizontal;
    
    //Generar barcos de 1 casilla
   /* public void generarBarco1 (int numBarcos1){ //void = retorno , generar = nombre de la clase. Se declara el método
        // Variables para la posición inicial
        barco = new int[10][10];
        int posicionXBarco1;
        int posicionYBarco1;
        //Bucle para cantidad de barcos de 1 casilla
        for(int i=0; i<numBarcos1; i++){
            do{
                //posicionar el barco de 1 casilla
                posicionXBarco1 = getNumeroAleatorio(0,9);
                posicionYBarco1 = getNumeroAleatorio(0,9);
                System.out.println("x1 = " + posicionXBarco1 + "  y1= " + posicionYBarco1);
                //Comprobar que la casilla no está ocupada 
            }while (barco[posicionXBarco1][posicionYBarco1] != 0); 
                //Generar el barco si no está ocupada la casilla
                barco[posicionXBarco1][posicionYBarco1] = 1;
        }      
    } 
    //Generar barcos de 2 casillas
    public void generarBarco2 (int numBarcos2){ //void = retorno , generar = nombre de la clase. Se declara el método
        // Variables para la posición inicial
        int posicionXBarco2;
        int posicionYBarco2;
        //Bucle para cantidad de barcos de 2 casillas
        for(int i=0; i<numBarcos2; i++){
            do{
                //posicionar el barco de 2 casillas
                posicionXBarco2 = getNumeroAleatorio(0,8);
                posicionYBarco2 = getNumeroAleatorio(0,9);
                System.out.println("x2 = " + posicionXBarco2 + "  y2= " + posicionYBarco2);
                //Comprobar que las casillas no están ocupadas
            }while (barco[posicionXBarco2][posicionYBarco2] != 0 || barco[posicionXBarco2 + 1][posicionYBarco2] != 0); 
                //Generar el barco si no está ocupada la casilla más casilla contigua
                barco[posicionXBarco2][posicionYBarco2] = 2;
                barco[posicionXBarco2 + 1][posicionYBarco2 + 0] = 2;
        }    
    } 
    //Generar barcos de 3 casillas
    public void generarBarco3 (int numBarcos3){ //void = retorno , generar = nombre de la clase. Se declara el método
        // Variables para la posición inicial
        int posicionXBarco3;
        int posicionYBarco3;
        //Bucle para cantidad de barcos de 3 casillas
        for(int i=0; i<numBarcos3; i++){
            do{
                //posicionar el barco de 3 casillas
                posicionXBarco3 = getNumeroAleatorio(0,7);
                posicionYBarco3 = getNumeroAleatorio(0,9);
                System.out.println("x3 = " + posicionXBarco3 + "  y3= " + posicionYBarco3);
                //Comprobar que las casillas no están ocupadas 
            }while (barco[posicionXBarco3][posicionYBarco3] != 0  || barco[posicionXBarco3 + 1][posicionYBarco3] != 0 || barco[posicionXBarco3 + 2][posicionYBarco3] != 0); 
                //Generar el barco si no está ocupada la casilla más las 2 casillas contiguas
                barco[posicionXBarco3][posicionYBarco3] = 3;
                barco[posicionXBarco3 + 1][posicionYBarco3] = 3;
                barco[posicionXBarco3 + 2][posicionYBarco3] = 3;
        }    
    }*/
    
    //Generar barcos de 4 casillas
    public boolean generarBarco4 (){ 
        
        barco = new int[10][10];
        // Variables para la posición inicial
        int posicionXBarco4;
        int posicionYBarco4;
 
        //llamar al metodo getHorizVert()
        //getHorizVert();
        // Generar horizontal aleatorio y vertical al contrario
        horizontal = getNumeroAleatorio (0,1);
        if (horizontal == 0){
            vertical = 1;
        }else {
            vertical = 0;
        }
        System.out.println("h3 = " + horizontal + "  v3= " + vertical);
        //Bucle para cantidad de barcos de 4 casillas
        try{
            do{
                //posicionar el barco de 4 casillas
                posicionXBarco4 = getNumeroAleatorio(0,9);
                posicionYBarco4 = getNumeroAleatorio(0,9);
                System.out.println("x4 = " + posicionXBarco4 + "  y4= " + posicionYBarco4);
                //Comprobar que las casillas no están ocupadas 
            }while (barco[posicionXBarco4][posicionYBarco4] != 0  || barco[posicionXBarco4 + (1 * horizontal)][posicionYBarco4 + (1 * vertical)] != 0 || barco[posicionXBarco4 + (2 * horizontal)][posicionYBarco4 + (2 * vertical)] != 0 || barco[posicionXBarco4 + (3 * horizontal)][posicionYBarco4 + (3 * vertical)] != 0); 
                //Generar el barco si no está ocupada la casilla más las 3 casillas contiguas
                barco[posicionXBarco4][posicionYBarco4] = 4;
                barco[posicionXBarco4 + (1 * horizontal)][posicionYBarco4 + (1 * vertical)] = 4;
                barco[posicionXBarco4 + (2 * horizontal)][posicionYBarco4 + (2 * vertical)] = 4;
                barco[posicionXBarco4 + (3 * horizontal)][posicionYBarco4 + (3 * vertical)] = 4;
         } catch (Exception ex) {
                System.out.println("No se ha creado el barco");
                System.out.println(ex.getMessage());
                return false;
         }  
        return true;
    
    }
      

    public int getHorizVert(){
        
        // Generar horizontal aleatorio y vertical contrario
        horizontal = getNumeroAleatorio (0,1);
        if (horizontal == 0){
            vertical = 1;
        }else {
            vertical = 0;
        }
        return horizontal;
        return vertical;
    } 
    
    // Muestra los números
    public void mostrarPorConsola(){
        //Bucle filas
        for(int y=0; y<10; y++){
            //Bucles columnas
            for(int x=0; x<10; x++){
                //System.out.println("x=" + x + "y=" + y);
                System.out.print(barco [x][y] + " ");
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
