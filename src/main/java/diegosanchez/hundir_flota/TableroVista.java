//Clase para la parte gráfica del juego

package diegosanchez.hundir_flota;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TableroVista extends GridPane {
    
    Tablero tableroJugador1;
    final int TAMAÑO_X = 40;
    final int TAMAÑO_Y = 40;
    int NUM_COLUMNAS;
    int NUM_FILAS;
    int resultado;
    
    //Método para mostrar gráficamente las casillas del tablero    
    public TableroVista(Tablero tableroJugador1) {
        
        this.tableroJugador1 = tableroJugador1;
        this.setStyle("-fx-grid-lines-visible: true");
        for(int y=0; y<tableroJugador1.NUM_FILAS; y++) {
            for (int x=0; x<tableroJugador1.NUM_COLUMNAS; x++) {
                int numeroPosicion = tableroJugador1.getCasillaDisparo(x, y);
                //Comprobar lo que hay en la casilla y mostrar 
                if (numeroPosicion != 0) {
                    String stringNumeroPosicion = String.valueOf(numeroPosicion);
                    Label etiquetaTablero = new Label(stringNumeroPosicion);
                    etiquetaTablero.setPrefWidth(TAMAÑO_X);
                    etiquetaTablero.setPrefHeight(TAMAÑO_Y);
                    etiquetaTablero.setAlignment(Pos.CENTER);
                    this.add(etiquetaTablero, x, y);
                } else {
                    Rectangle rectanguloTocado = new Rectangle();
                    rectanguloTocado.setWidth(TAMAÑO_X);
                    rectanguloTocado.setHeight(TAMAÑO_Y);
                    rectanguloTocado.setFill(Color.CORNFLOWERBLUE);
                    this.add(rectanguloTocado, x, y);
                }
            }
        }
        //Ancho y alto del total del gráfico
        this.setMaxWidth(TAMAÑO_X * tableroJugador1.NUM_COLUMNAS);
        this.setMaxHeight(TAMAÑO_Y * tableroJugador1.NUM_FILAS);
        this.controlRaton();
        
    }
    /**
     * Método para controlar el ratón. Nos da el nímero que hay en cada casilla
     */
    private void controlRaton(){
        //Comprobar el evento que devuelve el rat
        this.setOnMouseClicked((MouseEvent mouseEvent) -> {
            //Mostrar por consola la posición del clic del ratón
            System.out.println("X:  " + mouseEvent.getX()+ ", Y: "+ mouseEvent.getY());
            //Dividir por el tamaño de la columna para que nos diga el número de columna
            int columnaClic = (int)(mouseEvent.getX() / TAMAÑO_X);    
            //Dividir por el tamaño de la fila para que nos diga el número de fila
            int filaClic = (int)(mouseEvent.getY() / TAMAÑO_Y); 
            //Mostrar por consola el número de fila y el de columna
            System.out.println("Col: " + columnaClic + "Fil: " + filaClic);
            //Guardar el resultado de la columna y la fila en una variable
            resultado = tableroJugador1.getCasillaDisparo(columnaClic, filaClic);
            System.out.println("Resultado: " + resultado);
            
            this.resultadoDisparo();
        });
    }
    /**
     * Método para saber el resultado de cada clic en las casillas
     * @return devuelve el resultado de clic en las casillas
     */
    public int resultadoDisparo (){
        //Comprobar qué hay en la casilla elegida      
        System.out.println("Resultado de disparo = " + resultado);
        if (resultado == 0){
            System.out.println("Agua");
            } else{ 
            System.out.println("Tocado");
        }
        return resultado;
    }
}
