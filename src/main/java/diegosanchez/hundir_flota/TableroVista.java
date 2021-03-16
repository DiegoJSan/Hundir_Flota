//Clase para la parte gráfica del juego

package diegosanchez.hundir_flota;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TableroVista extends GridPane {
    
    Letrero letrero;
    Tablero tableroJugador1;
    Marcador marcador;
    final int TAMAÑO_X = 40;
    final int TAMAÑO_Y = 40;
    int resultado;
    int columnaClic;
    int filaClic;
    Rectangle rectanguloCasillaInicial = new Rectangle();
    Rectangle [][] arrayrectanguloCasillaInicial;
    
    //Método para mostrar gráficamente las casillas del tablero    
    public TableroVista(Tablero tableroJugador1, Letrero letrero, Marcador marcador) {
        
        this.letrero = letrero;
        this.tableroJugador1 = tableroJugador1;
        this.marcador = marcador;
        
        //Crear array para casillas iniciales en azul
        arrayrectanguloCasillaInicial = new Rectangle[tableroJugador1.NUM_COLUMNAS][tableroJugador1.NUM_FILAS];
        crearCasillas ();
    }   
    public void crearCasillas () {
        //this.setStyle("-fx-grid-lines-visible: false");
        this.setGridLinesVisible(false);
        this.getChildren().clear();
        //Bucler para poner en graficos número o casillas
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
                    Rectangle rectanguloTocado = new Rectangle();
                    rectanguloTocado.setWidth(TAMAÑO_X);
                    rectanguloTocado.setHeight(TAMAÑO_Y);
                    rectanguloTocado.setFill(Color.GRAY);
                    this.add(rectanguloTocado, x, y);
                } else {
                    Rectangle rectanguloAgua = new Rectangle();
                    rectanguloAgua.setWidth(TAMAÑO_X);
                    rectanguloAgua.setHeight(TAMAÑO_Y);
                    rectanguloAgua.setFill(Color.RED);
                    this.add(rectanguloAgua, x, y);
                }
                //Rectangulos para tapar las casillas en azul
                rectanguloCasillaInicial = new Rectangle();
                rectanguloCasillaInicial.setWidth(TAMAÑO_X);
                rectanguloCasillaInicial.setHeight(TAMAÑO_Y);
                rectanguloCasillaInicial.setFill(Color.CORNFLOWERBLUE);
                rectanguloCasillaInicial.setVisible(true);
                
                //Array para poner todas las casillas iniciales en azul
                arrayrectanguloCasillaInicial [x][y] = rectanguloCasillaInicial;
                this.add(rectanguloCasillaInicial, x, y); 
            }
            
        }
        //Ancho y alto del total del gráfico
        this.setMaxWidth(TAMAÑO_X * tableroJugador1.NUM_COLUMNAS);
        this.setMaxHeight(TAMAÑO_Y * tableroJugador1.NUM_FILAS);
        this.controlRaton();
        this.setGridLinesVisible(true);
    
    }
    
    public void borrarCasillas () {
        this.setStyle("-fx-grid-lines-visible: true");
        //Bucler para poner en graficos número o casillas
        for(int y=0; y<tableroJugador1.NUM_FILAS; y++) {
            for (int x=0; x<tableroJugador1.NUM_COLUMNAS; x++) {
                int numeroPosicion = tableroJugador1.getCasillaDisparo(x, y);
                //Comprobar lo que hay en la casilla y mostrar 
                if (numeroPosicion == 0) {
                    Rectangle rectanguloVacio = new Rectangle();
                    rectanguloVacio.setWidth(TAMAÑO_X);
                    rectanguloVacio.setHeight(TAMAÑO_Y);
                    rectanguloVacio.setFill(Color.WHITE);
                    this.add(rectanguloVacio, x, y);
                } 
            }
        }
        //Ancho y alto del total del gráfico
        this.setMaxWidth(TAMAÑO_X * tableroJugador1.NUM_COLUMNAS);
        this.setMaxHeight(TAMAÑO_Y * tableroJugador1.NUM_FILAS);
        this.controlRaton();
    
    }

    /**
     * Método para controlar el ratón. Nos da el número que hay en cada casilla
     */
    public void controlRaton(){
        
        
        //Comprobar el evento que devuelve el rat
        this.setOnMouseClicked((MouseEvent mouseEvent) -> {
            //Mostrar por consola la posición del clic del ratón
            System.out.println("X:  " + mouseEvent.getX()+ ", Y: "+ mouseEvent.getY());
            //Dividir por el tamaño de la columna para que nos diga el número de columna
            columnaClic = (int)(mouseEvent.getX() / TAMAÑO_X);    
            //Dividir por el tamaño de la fila para que nos diga el número de fila
            filaClic = (int)(mouseEvent.getY() / TAMAÑO_Y); 
            //Mostrar por consola el número de fila y el de columna
            System.out.println("Col: " + columnaClic + "Fil: " + filaClic);
            
            
            if (marcador.finalPartida == false) {
            //Guardar el resultado de la columna y la fila en una variable
            resultado = tableroJugador1.getCasillaDisparo(columnaClic, filaClic);
            System.out.println("Resultado: " + resultado);
            //Hacer invisible la casilla donde se haga clic
            arrayrectanguloCasillaInicial [columnaClic][filaClic].setVisible(false);
            }
            
            this.resultadoDisparo();
            
            
            marcador.puntuacion(tableroJugador1.apuntes,columnaClic, filaClic, resultado);
            tableroJugador1.mostrarApuntes(resultado, columnaClic, filaClic, tableroJugador1.apuntes);
            tableroJugador1.resultado(resultado);
            letrero.tiro(resultado, tableroJugador1.recuento, marcador.finalPartida);
            
            //tableroJugador1.recuentoBarcos();
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
