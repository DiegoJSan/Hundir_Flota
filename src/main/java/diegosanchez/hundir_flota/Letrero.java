
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
    Label labelResultadoHundido;
    ImageView imagenGameOverView;
    boolean tiroAgua;
    boolean tiroTocado;
            
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
        
        labelResultadoHundido = new Label (" Y Hundido");
        labelResultadoHundido.setFont(Font.font(TAMAÑO));
        labelResultadoHundido.setAlignment(Pos.CENTER);
        labelResultadoHundido.setVisible(false);
        
        //this.getChildren().add(labelResultadoAgua);
        //this.getChildren().add(labelResultadoTocado);
        
        this.setAlignment(Pos.CENTER);
        
        //this.getChildren().add(labelResultadoHundido);
    }
       
    public void tiro (int resultado/*, Tablero tableroJugador1, int columnaClic, int filaClic*/) {  
        
        if (resultado == 0 && tiroAgua == false) {
            System.out.println("Letrero: Agua");
            tiroAgua = true;
            tiroTocado = false;
            this.getChildren().add(labelResultadoAgua);
            this.getChildren().remove(labelResultadoTocado);
            /*labelResultadoAgua.setVisible(true);
            labelResultadoTocado.setVisible(false);
            labelResultadoHundido.setVisible(false);*/
        } 
        
        if (resultado != 0 && tiroTocado == false) {
            System.out.println("Letrero: Tocado");
            tiroAgua = false;
            tiroTocado = true;
            this.getChildren().remove(labelResultadoAgua);
            this.getChildren().add(labelResultadoTocado);
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
        
        
        
        //Posicionar imagen Game Over
        /*imagenGameOverView.setLayoutX(ANCHO_PANTALLA/2 );
        imagenGameOverView.setLayoutY(ALTO_PANTALLA/2 );*/
    }
    
     public void quitarImagenGameOver(){
         this.getChildren().remove(imagenGameOverView);
    }
     
    public void quitarLetreros() {
        this.getChildren().remove(labelResultadoAgua);
        this.getChildren().remove(labelResultadoTocado);
    }
    
}
