package diegosanchez.hundir_flota;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

/**
 * Clase para crear las etiquetas que indican las acciones del juago
 * @author Diego J. Sánchez
 */
public class Letrero extends HBox{
    
    //Propiedades de la clase
    Label labelResultadoAgua;
    Label labelResultadoTocado;
    Label labelResultadoGana;
    Label labelInicio;
    ImageView imagenGameOverView;
    Marcador marcador;
    Sonidos sonido;
    
    //Variables
    boolean tiroAgua;
    boolean tiroTocado;
    
    //Constante
    final int TAMAÑO = 60;
    
    /**
     * Método para crear las etiquetas de las acciones del juego
     */
    public Letrero () {
        
        //Variables
        tiroAgua = false;
        tiroTocado = false;
        
        //Etiqueta de Agua
        labelResultadoAgua = new Label ("Agua");
        labelResultadoAgua.setFont(Font.font(TAMAÑO));
        labelResultadoAgua.setAlignment(Pos.CENTER);
        labelResultadoAgua.setVisible(true);
        
        //etiqueta de Tocado
        labelResultadoTocado = new Label ("Tocado");
        labelResultadoTocado.setFont(Font.font(TAMAÑO));
        labelResultadoTocado.setAlignment(Pos.CENTER);
        labelResultadoTocado.setVisible(true);
        
        //Etiqueta de Jugador Gana
        labelResultadoGana = new Label ("Jugador 1 Gana!!!");
        labelResultadoGana.setFont(Font.font(TAMAÑO));
        labelResultadoGana.setAlignment(Pos.CENTER);
        labelResultadoGana.setVisible(true);
        
        //Etiqueta de inicio de juego
        labelInicio = new Label ("Dispare en Casilla");
        labelInicio.setFont(Font.font(TAMAÑO));
        labelInicio.setAlignment(Pos.CENTER);
        labelInicio.setVisible(true);
        
        //Prámetros propios
        this.getChildren().add(labelInicio);
        this.setAlignment(Pos.CENTER);
        this.setMinHeight(150.00);
    }
    
    /**
     * Método que cambia las etiquetas en funcion del resultado
     * @param resultado número del resultado del disparo
     * @param recuento numero de recuento de tocados
     * @param marcador objeto de la clase Marcador
     * @param sonido objeto de la clase Sonidos
     */
    public void tiro (int resultado, int recuento, Marcador marcador, Sonidos sonido) {  
        
        //Parámetros propios
        this.marcador = marcador;
        this.sonido = sonido;
        
        //Comprobar si el resultado es Agua y mostrar etiquetas
        if (resultado == 0 && tiroAgua == false) {
            System.out.println("Letrero: Agua");
            tiroAgua = true;
            tiroTocado = false;
            this.getChildren().add(labelResultadoAgua);
            this.getChildren().remove(labelResultadoTocado);
            this.getChildren().remove(labelResultadoGana);
            this.getChildren().remove(labelInicio);
        } 
        
        //Comprobar si el resultado es Tocado y mostrar etiquetas
        if (resultado != 0 && tiroTocado == false) {
            System.out.println("Letrero: Tocado");
            tiroAgua = false;
            tiroTocado = true;
            this.getChildren().remove(labelResultadoAgua);
            this.getChildren().add(labelResultadoTocado);
            this.getChildren().remove(labelResultadoGana);
            this.getChildren().remove(labelInicio);
        }
        
        //Comprobar el recuento de tocado para ganar juego
        if (recuento == 20 && marcador.finalPartida == false) {
            System.out.println("Jugador 1 Gana!!!");
            sonido.sonidoGanaPartida();
            marcador.finalPartida = true;
            System.out.println(marcador.finalPartida);
            this.getChildren().remove(labelResultadoAgua);
            this.getChildren().remove(labelResultadoTocado);
            this.getChildren().remove(labelInicio);
            this.getChildren().add(labelResultadoGana);
        }
    }
    
    /**
     * Método para crear y añadir la imagen Game Over
     */
    public void imagenGameOver(){
        
        //Imagen Game Over 
        var imagenGameOver = new Image(getClass().getResourceAsStream("/images/GameOver.png"));
        imagenGameOverView = new ImageView(imagenGameOver);
        this.getChildren().add(imagenGameOverView);
    }
    
    /**
     * Método para quitar imagen Game Over
     */
    public void quitarImagenGameOver(){
         this.getChildren().remove(imagenGameOverView);
    }
    
    /**
     * Método para quitar las etiquetas
     */
    public void quitarLetreros() {
        this.getChildren().remove(labelResultadoAgua);
        this.getChildren().remove(labelResultadoTocado);
        this.getChildren().remove(labelResultadoGana);  
        this.getChildren().remove(labelInicio);
    }
    
    /**
     * Método para mostrar las etiquetas
     */
    public void ponerLetreros() {
        this.getChildren().add(labelInicio);
    }
}
