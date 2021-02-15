package diegosanchez.hundir_flota;



/**
 *
 * @author Diego
 */
public class Tablero {
    int [][] casillas;
    
    public void generar (){ //void = retorno , generar = nombre de la clase. Se declara el método
       
        casillas = new int[9][9];
        
        for(int y=0; y<10; y++){
            for(int x=0; x<10; x++){
                /*nums[x][y] = getNumAleatorio(1,90);*/
            }
        }
        
        mostrarPorConsola();
    } 
    
    // Muestra los números
    public void mostrarPorConsola(){
        //Bucle filas
        for(int y=0; y<10; y++){
            //Bucles columnas
            for(int x=0; x<10; x++){
                //System.out.println("x=" + x + "y=" + y);
                System.out.print(casillas [x][y] + " ");
            }
            System.out.println();
        }
    }
}
