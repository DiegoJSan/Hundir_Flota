package diegosanchez.hundir_flota;

import java.util.Random;


public class Tablero {
    
    final int NUM_COLUMNAS = 10;
    final int NUM_FILAS = 10;
    
    //Array para la creacion del tablero con los barcos
    int [][] barco = new int[NUM_COLUMNAS][NUM_FILAS];
    
    // Variables para horizontal o vertical
    int vertical;
    int horizontal;
    
    //Generar barcos de 1 casilla
    public boolean generarBarco1 (){ 
        // Variables para la posición inicial
        int posicionXBarco1;
        int posicionYBarco1;
        //Bucle para cantidad de barcos de 1 casilla
        try{
            do{
                //posicionar el barco de 1 casilla
                posicionXBarco1 = getNumeroAleatorio(0,NUM_COLUMNAS -1);
                posicionYBarco1 = getNumeroAleatorio(0,NUM_FILAS -1);
                System.out.println("x1 = " + posicionXBarco1 + "  y1= " + posicionYBarco1);
                //Comprobar que la casilla no está ocupada 
            }while (barco[posicionXBarco1][posicionYBarco1] != 0); 
                //Generar el barco si no está ocupada la casilla
                barco[posicionXBarco1][posicionYBarco1] = 1;
        } catch (Exception ex) {
                System.out.println("No se ha creado el barco 1");
                System.out.println(ex.getMessage());
                return false;
         }  
        return true;
    
    } 
    //Generar barcos de 2 casillas
    public boolean generarBarco2 (){ 
        // Variables para la posición inicial
        
        int posicionXBarco2;
        int posicionYBarco2;
 
        //Llamar al metodo getHorizVert()
        getHorizVert();
        
        System.out.println("h2 = " + horizontal + "  v2= " + vertical);
        //Bucle para cantidad de barcos de 4 casillas
        try{
            do{
                //posicionar el barco de 4 casillas
                posicionXBarco2 = getNumeroAleatorio(0,NUM_COLUMNAS -1);
                posicionYBarco2 = getNumeroAleatorio(0,NUM_FILAS -1);
                System.out.println("x2 = " + posicionXBarco2 + "  y2= " + posicionYBarco2);
                //Comprobar que las casillas no están ocupadas 
            }while (barco[posicionXBarco2][posicionYBarco2] != 0  || barco[posicionXBarco2 + (1 * horizontal)][posicionYBarco2 + (1 * vertical)] != 0); 
                //Generar el barco si no está ocupada la casilla más las 3 casillas contiguas
                barco[posicionXBarco2][posicionYBarco2] = 2;
                barco[posicionXBarco2 + (1 * horizontal)][posicionYBarco2 + (1 * vertical)] = 2;
         } catch (Exception ex) {
                System.out.println("No se ha creado el barco 2");
                System.out.println(ex.getMessage());
                return false;
         }  
        return true;
    
    }
    //Generar barcos de 3 casillas
    public boolean generarBarco3 (){
        // Variables para la posición inicial
        int posicionXBarco3;
        int posicionYBarco3;
 
        //Llamar al metodo getHorizVert()
        getHorizVert();
        
        System.out.println("h3 = " + horizontal + "  v3= " + vertical);
        //Bucle para cantidad de barcos de 4 casillas
        try{
            do{
                //posicionar el barco de 4 casillas
                posicionXBarco3 = getNumeroAleatorio(0,NUM_COLUMNAS -1);
                posicionYBarco3 = getNumeroAleatorio(0,NUM_FILAS -1);
                System.out.println("x3 = " + posicionXBarco3 + "  y3= " + posicionYBarco3);
                //Comprobar que las casillas no están ocupadas 
            }while (barco[posicionXBarco3][posicionYBarco3] != 0  || barco[posicionXBarco3 + (1 * horizontal)][posicionYBarco3 + (1 * vertical)] != 0 || barco[posicionXBarco3 + (2 * horizontal)][posicionYBarco3 + (2 * vertical)] != 0); 
                //Generar el barco si no está ocupada la casilla más las 3 casillas contiguas
                barco[posicionXBarco3][posicionYBarco3] = 3;
                barco[posicionXBarco3 + (1 * horizontal)][posicionYBarco3 + (1 * vertical)] = 3;
                barco[posicionXBarco3 + (2 * horizontal)][posicionYBarco3 + (2 * vertical)] = 3;
         } catch (Exception ex) {
                System.out.println("No se ha creado el barco 3");
                System.out.println(ex.getMessage());
                return false;
         }  
        return true;
    
    }
    
    //Generar barcos de 4 casillas
    public boolean generarBarco4 (){ 
        
        // Variables para la posición inicial
        int posicionXBarco4;
        int posicionYBarco4;
 
        //Llamar al metodo getHorizVert()
        getHorizVert();
        
        System.out.println("h4 = " + horizontal + "  v4= " + vertical);
        //Bucle para cantidad de barcos de 4 casillas
        try{
            do{
                //posicionar el barco de 4 casillas
                posicionXBarco4 = getNumeroAleatorio(0,NUM_COLUMNAS -1);
                posicionYBarco4 = getNumeroAleatorio(0,NUM_FILAS -1);
                System.out.println("x4 = " + posicionXBarco4 + "  y4= " + posicionYBarco4);
                //Comprobar que las casillas no están ocupadas 
            }while (barco[posicionXBarco4][posicionYBarco4] != 0  || barco[posicionXBarco4 + (1 * horizontal)][posicionYBarco4 + (1 * vertical)] != 0 || barco[posicionXBarco4 + (2 * horizontal)][posicionYBarco4 + (2 * vertical)] != 0 || barco[posicionXBarco4 + (3 * horizontal)][posicionYBarco4 + (3 * vertical)] != 0); 
                //Generar el barco si no está ocupada la casilla más las 3 casillas contiguas
                barco[posicionXBarco4][posicionYBarco4] = 4;
                barco[posicionXBarco4 + (1 * horizontal)][posicionYBarco4 + (1 * vertical)] = 4;
                barco[posicionXBarco4 + (2 * horizontal)][posicionYBarco4 + (2 * vertical)] = 4;
                barco[posicionXBarco4 + (3 * horizontal)][posicionYBarco4 + (3 * vertical)] = 4;
         } catch (Exception ex) {
                System.out.println("No se ha creado el barco 4");
                System.out.println(ex.getMessage());
                return false;
         }  
        return true;
     }
    
    //Método para hacer bucle de varios barcos de 1 
    public void cantBarcos1(int cant1){
        boolean barco1Creado;       
        for(int i=0; i<(cant1); i++){
            do{
            barco1Creado = generarBarco1();
            } while (barco1Creado == false);
        }
    }
    
    //Método para hacer bucle de varios barcos de 2
    public void cantBarcos2(int cant2){
        boolean barco2Creado;       
        for(int i=0; i<(cant2); i++){
            do{
            barco2Creado = generarBarco2();
            } while (barco2Creado == false);
        }
    }
    
    //Método para hacer bucle de varios barcos de 3
    public void cantBarcos3(int cant3){
        boolean barco3Creado;        
        for(int i=0; i<(cant3); i++){
            do{
            barco3Creado = generarBarco3();
            } while (barco3Creado == false);
        }
    }
    
    //Método para hacer bucle de varios barcos de 4
    public void cantBarcos4(int cant4){
        boolean barco4Creado;      
        for(int i=0; i<(cant4); i++){
            do{
            barco4Creado = generarBarco4();
            } while (barco4Creado == false);
        }
    }
    
    //Método para generar aleatório Horizontal o Vertical
    public int [] getHorizVert(){       
        // Generar horizontal aleatorhio y vertical contrario
        horizontal = getNumeroAleatorio (0,1);
        if (horizontal == 0){
            vertical = 1;
        }else {
            vertical = 0;
        }
        int [] horizVert = {horizontal,vertical};
        return horizVert;
    } 
    
    // Muestra los números
    public void mostrarPorConsola(){
        //Bucle filas
        for(int y=0; y<NUM_FILAS; y++){
            //Bucles columnas
            for(int x=0; x<NUM_COLUMNAS; x++){
                //System.out.println("x=" + x + "y=" + y);
                System.out.print(barco [x][y] + " ");
            }
            System.out.println();
        }
    }
    //Método para generar número aleatorio
    public int getNumeroAleatorio(int min, int max){   // get= dame , generar
       Random random = new Random ();
       // nim = 1, max = 6
       int num = random.nextInt(max-min+1) + min;    // 3 = cantidad de numeros  5 = el numero maximo
       return num;
    }
     
    //Método para saber lo que hay en la casilla selecccionada
    public int getCasillaDisparo(int disparoX, int distaroY) {
        try {
            return barco[disparoX][distaroY];
        } catch (Exception ex){
            System.out.println("La posición es incorrecta");
            return -1;
        }
    } 
}
