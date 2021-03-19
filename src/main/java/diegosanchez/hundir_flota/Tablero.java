package diegosanchez.hundir_flota;

import java.util.Random;

/**
 * Clase donde creamos el tablero de juego
 * @author Diego J. Sánchez
 */
public class Tablero {
    
    //Constantes
    final int NUM_COLUMNAS = 10;
    final int NUM_FILAS = 10;
    
    //Array para la creacion del tablero con los barcos
    int [][] barco = new int[NUM_COLUMNAS][NUM_FILAS];
    
    //Array para la creacion de notas y saber qué hay en cada casilla
    int [][] apuntes = new int[NUM_COLUMNAS][NUM_FILAS];
    
    // Variables para horizontal o vertical
    int vertical;
    int horizontal;
    
    //Variable para recuento de tocados
    int recuento;

    
    /**
     * Generar barcos de 0 casilla
     * @return Retorna si se ha creado el barco de 0 casillas
     */
    public boolean generarBarco0 (){ 
        // Variables para la posición inicial
        int posicionXBarco0 = 0;
        int posicionYBarco0 = 0;
        //Bucle para cantidad de barcos de 0 casilla
        try{
            do{
                //posicionar el barco de 0 casilla
                //Bucle filas
                for(int y=0; y<NUM_FILAS; y++){
                    //Bucles columnas
                    for(int x=0; x<NUM_COLUMNAS; x++){
                barco[x][y] = 0;
                    }
                }
                System.out.println("x1 = " + posicionXBarco0 + "  y1= " + posicionYBarco0);
                //Comprobar que la casilla no está ocupada 
            }while (barco[posicionXBarco0][posicionYBarco0] != 0); 
                //Generar el barco si no está ocupada la casilla
                barco[posicionXBarco0][posicionYBarco0] = 0;
        } catch (Exception ex) {
                System.out.println("No se ha creado el barco 0");
                System.out.println(ex.getMessage());
                return false;
        }  
        //Retorna que se ha creado el barco 
        return true;
    }
    
    /**
     * Generar barcos de 1 casilla
     * @return Retorna si se ha creado el barco de 1 casillas
     */
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
        //Retorna que se ha creado el barco
        return true;
    } 
    
    /**
     * Generar barcos de 2 casilla
     * @return Retorna si se ha creado el barco de 2 casillas
     */
    public boolean generarBarco2 (){ 
        // Variables para la posición inicial
        
        int posicionXBarco2;
        int posicionYBarco2;
 
        //Llamar al metodo getHorizVert()
        getHorizVert();
        
        System.out.println("h2 = " + horizontal + "  v2= " + vertical);
        //Bucle para cantidad de barcos de 2 casillas
        try{
            do{
                //posicionar el barco de 2 casillas
                posicionXBarco2 = getNumeroAleatorio(0,NUM_COLUMNAS -1);
                posicionYBarco2 = getNumeroAleatorio(0,NUM_FILAS -1);
                System.out.println("x2 = " + posicionXBarco2 + "  y2= " + posicionYBarco2);
                //Comprobar que las casillas no están ocupadas 
            }while (barco[posicionXBarco2][posicionYBarco2] != 0  || barco[posicionXBarco2 + (1 * horizontal)][posicionYBarco2 + (1 * vertical)] != 0); 
                //Generar el barco si no está ocupada la casilla más la casilla contigua
                barco[posicionXBarco2][posicionYBarco2] = 2;
                barco[posicionXBarco2 + (1 * horizontal)][posicionYBarco2 + (1 * vertical)] = 2;
        } catch (Exception ex) {
                System.out.println("No se ha creado el barco 2");
                System.out.println(ex.getMessage());
                return false;
        }  
        //Retorna que se ha creado el barco
        return true;
    }
    
    /**
     * Generar barcos de 3 casilla
     * @return Retorna si se ha creado el barco de 3 casillas
     */
    public boolean generarBarco3 (){
        // Variables para la posición inicial
        int posicionXBarco3;
        int posicionYBarco3;
 
        //Llamar al metodo getHorizVert()
        getHorizVert();
        
        System.out.println("h3 = " + horizontal + "  v3= " + vertical);
        //Bucle para cantidad de barcos de 3 casillas
        try{
            do{
                //posicionar el barco de 3 casillas
                posicionXBarco3 = getNumeroAleatorio(0,NUM_COLUMNAS -1);
                posicionYBarco3 = getNumeroAleatorio(0,NUM_FILAS -1);
                System.out.println("x3 = " + posicionXBarco3 + "  y3= " + posicionYBarco3);
                //Comprobar que las casillas no están ocupadas 
            }while (barco[posicionXBarco3][posicionYBarco3] != 0  || barco[posicionXBarco3 + (1 * horizontal)][posicionYBarco3 + (1 * vertical)] != 0 || barco[posicionXBarco3 + (2 * horizontal)][posicionYBarco3 + (2 * vertical)] != 0); 
                //Generar el barco si no está ocupada la casilla más las 2 casillas contiguas
                barco[posicionXBarco3][posicionYBarco3] = 3;
                barco[posicionXBarco3 + (1 * horizontal)][posicionYBarco3 + (1 * vertical)] = 3;
                barco[posicionXBarco3 + (2 * horizontal)][posicionYBarco3 + (2 * vertical)] = 3;
         } catch (Exception ex) {
                System.out.println("No se ha creado el barco 3");
                System.out.println(ex.getMessage());
                return false;
         }  
        //Retorna que se ha creado el barco
        return true;
    
    }
    
    /**
     * Generar barcos de 4 casilla
     * @return Retorna si se ha creado el barco de 4 casillas
     */
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
        //Retorna que se ha creado el barco
        return true;
     }
    
    /**
     * Método para hacer bucle de varios barcos de 1 casilla
     * @param cant1 Número de barcos a crear de 1 casilla
     */
    public void cantBarcos1(int cant1){
        boolean barco1Creado;       
        for(int i=0; i<(cant1); i++){
            do{
            barco1Creado = generarBarco1();
            } while (barco1Creado == false);
        }
    }
    
    /**
     * Método para hacer bucle de varios barcos de 2 casilla
     * @param cant2 Número de barcos a crear de 2 casilla
     */
    public void cantBarcos2(int cant2){
        boolean barco2Creado;       
        for(int i=0; i<(cant2); i++){
            do{
            barco2Creado = generarBarco2();
            } while (barco2Creado == false);
        }
    }
    
    /**
     * Método para hacer bucle de varios barcos de 3 casilla
     * @param cant3 Número de barcos a crear de 3 casilla
     */
    public void cantBarcos3(int cant3){
        boolean barco3Creado;        
        for(int i=0; i<(cant3); i++){
            do{
            barco3Creado = generarBarco3();
            } while (barco3Creado == false);
        }
    }
    
    /**
     * Método para hacer bucle de varios barcos de 4 casilla
     * @param cant4 Número de barcos a crear de 4 casilla
     */
    public void cantBarcos4(int cant4){
        boolean barco4Creado;      
        for(int i=0; i<(cant4); i++){
            do{
            barco4Creado = generarBarco4();
            } while (barco4Creado == false);
        }
    }
    
    /**
     * Método para generar aleatório Horizontal o Vertical
     * @return  Array con numeros aleatorios 
     */
    public int [] getHorizVert(){       
        // Generar horizontal aleatorio y vertical al contrario
        horizontal = getNumeroAleatorio (0,1);
        if (horizontal == 0){
            vertical = 1;
        }else {
            vertical = 0;
        }
        int [] horizVert = {horizontal,vertical};
        return horizVert;
    } 
    
    /**
     *  Muestra los números de los barcos iniciales
     */
    public void mostrarPorConsolaBarco(){
        //Bucle filas
        for(int y=0; y<NUM_FILAS; y++){
            //Bucles columnas
            for(int x=0; x<NUM_COLUMNAS; x++){
                
                System.out.print(barco [x][y] + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * Muestra los números donde se ha disparado
     */
    public void mostrarPorConsolaApuntes(){
        //Bucle filas
        for(int y=0; y<NUM_FILAS; y++){
            //Bucles columnas
            for(int x=0; x<NUM_COLUMNAS; x++){
                System.out.print(apuntes [x][y] + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * // Muestra los números donde se ha disparado a 0
     */
    public void mostrarPorConsolaApuntesCero(){
        //Bucle filas
        for(int y=0; y<NUM_FILAS; y++){
            //Bucles columnas
            for(int x=0; x<NUM_COLUMNAS; x++){
                apuntes [x][y] = 0;
            }
        }
    }
    
    /**
     * Método para generar número aleatorio
     * @param min número mínimo aleatorio
     * @param max número máximo aleatorio
     * @return número aleatorio
     */
    public int getNumeroAleatorio(int min, int max){   
       Random random = new Random ();
       int num = random.nextInt(max-min+1) + min;
       return num;
    }
    
    /**
     * Método para saber lo que hay en la casilla selecccionada
     * @param disparoX posición de la columna
     * @param distaroY posición de la fila
     * @return si nos hemos salido del tablero
     */ 
    public int getCasillaDisparo(int disparoX, int distaroY) {
        try {
            return barco[disparoX][distaroY];
        } catch (Exception ex){
            System.out.println("La posición es incorrecta");
            return -1;
        }
    }
    
    /**
     * Método que contabiliza los tocados
     * @param resultado número del resultado del disparo
     * @param columnaClic número de columna donde se ha hecho clic
     * @param filaClic número de fila donde se ha hecho clic
     * @param apuntes array con el recuento de disparos
     */
    public void resultado(int resultado, int columnaClic, int filaClic, int apuntes [][]){
        if ((resultado == 1 || resultado == 2 || resultado == 3 || resultado == 4) && apuntes[columnaClic][filaClic] == 0){
            recuento ++;
            System.out.println("Recuento : " + recuento);
        }
    }
    
    /**
     * Método para apuntar cada clic de cada casilla
     * @param resultado número del resultado del disparo
     * @param columnaClic número de columna donde se ha hecho clic
     * @param filaClic número de fila donde se ha hecho clic
     * @param apuntes array con el recuento de disparos
     */
    public void mostrarApuntes (int resultado, int columnaClic, int filaClic, int apuntes [][]){
        
        //Si el resultado es 0 cambiarlo a 9 para diferenciar en apuntes
        if (resultado == 0){
            resultado = 9;
        }
        //Guardar en apuntes el resultado y mostrar
        apuntes[columnaClic][filaClic] = resultado;
        System.out.println("Mostrar apuntes: ");
        mostrarPorConsolaApuntes();
    }
}
