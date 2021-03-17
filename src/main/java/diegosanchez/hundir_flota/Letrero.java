
package diegosanchez.hundir_flota;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

/**
 *
 * @author Diego
 */
public class Letrero extends HBox{
    
    final int TAMAÑO = 60;
    Label labelResultadoAgua;
    Label labelResultadoTocado;
    Label labelResultadoGana;
    Label labelInicio;
    ImageView imagenGameOverView;
    boolean tiroAgua;
    boolean tiroTocado;
    Marcador marcador;
            
    public Letrero () {
        
        tiroAgua = false;
        tiroTocado = false;
        
        labelResultadoAgua = new Label ("Agua");
        labelResultadoAgua.setFont(Font.font(TAMAÑO));
        labelResultadoAgua.setAlignment(Pos.CENTER);
        labelResultadoAgua.setVisible(true);
        
        labelResultadoTocado = new Label ("Tocado");
        labelResultadoTocado.setFont(Font.font(TAMAÑO));
        labelResultadoTocado.setAlignment(Pos.CENTER);
        labelResultadoTocado.setVisible(true);
        
        labelResultadoGana = new Label ("Jugador 1 Gana!!!");
        labelResultadoGana.setFont(Font.font(TAMAÑO));
        labelResultadoGana.setAlignment(Pos.CENTER);
        labelResultadoGana.setVisible(true);
        
        labelInicio = new Label ("Dispare en Casilla");
        labelInicio.setFont(Font.font(TAMAÑO));
        labelInicio.setAlignment(Pos.CENTER);
        labelInicio.setVisible(true);
        
        this.getChildren().add(labelInicio);
        this.setAlignment(Pos.CENTER);
        this.setMinHeight(150.00);
        
        
    }
       
    public void tiro (int resultado, int recuento, Marcador marcador /*, Tablero tableroJugador1, int columnaClic, int filaClic*/) {  
        
        this.marcador = marcador;
        
        if (resultado == 0 && tiroAgua == false) {
            System.out.println("Letrero: Agua");
            tiroAgua = true;
            tiroTocado = false;
            this.getChildren().add(labelResultadoAgua);
            this.getChildren().remove(labelResultadoTocado);
            this.getChildren().remove(labelResultadoGana);
            this.getChildren().remove(labelInicio);
        } 
        
        if (resultado != 0 && tiroTocado == false) {
            System.out.println("Letrero: Tocado");
            tiroAgua = false;
            tiroTocado = true;
            this.getChildren().remove(labelResultadoAgua);
            this.getChildren().add(labelResultadoTocado);
            this.getChildren().remove(labelResultadoGana);
            this.getChildren().remove(labelInicio);
        }
        
        
        if (recuento == 20) {
            System.out.println("Jugador 1 Gana!!!");
            marcador.finalPartida = true;
            System.out.println(marcador.finalPartida);
            this.getChildren().remove(labelResultadoAgua);
            this.getChildren().remove(labelResultadoTocado);
            this.getChildren().remove(labelInicio);
            this.getChildren().add(labelResultadoGana);
        }
        /*if (resultado == 1){
            System.out.println("Letrero: Tocado y Hundido");
            this.getChildren().add(labelResultadoTocado);
            this.getChildren().remove(labelResultadoAgua);
            labelResultadoAgua.setVisible(false);
            labelResultadoTocado.setVisible(true);
            labelResultadoHundido.setVisible(true);
        }
        if (resultado == 2){
            System.out.println("Letrero: Tocado");
            this.getChildren().add(labelResultadoTocado);
            this.getChildren().remove(labelResultadoAgua);
            /*labelResultadoAgua.setVisible(false);
            labelResultadoTocado.setVisible(true);
            labelResultadoHundido.setVisible(false);
        }
        if (resultado == 2 && (tableroJugador1.apuntes[columnaClic +1][filaClic] == 2 || tableroJugador1.apuntes[columnaClic -1][filaClic] == 2) ||  tableroJugador1.apuntes[columnaClic ][filaClic +1] == 2 ||  tableroJugador1.apuntes[columnaClic ][filaClic -1] == 2 ){
            labelResultadoAgua.setVisible(false);
            labelResultadoTocado.setVisible(true);
            labelResultadoHundido.setVisible(true);
        }*/
        
    }
    //Método para crear imagen Game Over
    public void imagenGameOver(){
        
        //Imagen Game Over 
        var imagenGameOver = new Image(getClass().getResourceAsStream("/images/GameOver.png"));
        imagenGameOverView = new ImageView(imagenGameOver);
        this.getChildren().add(imagenGameOverView);
    }
    
     public void quitarImagenGameOver(){
         this.getChildren().remove(imagenGameOverView);
    }
     
    public void quitarLetreros() {
        this.getChildren().remove(labelResultadoAgua);
        this.getChildren().remove(labelResultadoTocado);
        this.getChildren().remove(labelResultadoGana);  
        this.getChildren().remove(labelInicio);
    }
    
    public void ponerLetreros() {
        this.getChildren().add(labelInicio);
    }
    
}
