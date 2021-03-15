
package diegosanchez.hundir_flota;

import static java.lang.Math.random;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 *
 * @author Diego
 */
public class Botones extends VBox {
    
    Letrero letrero;
  

    public Botones(Marcador marcador, Letrero letreo){
        
        this.letrero = letrero;
        
        /*Label labelBarcosHundidosJ1_1 = new Label ("Barcos Hundidos");
        labelBarcosHundidosJ1_1.setFont(Font.font(20));
        labelBarcosHundidosJ1_1.setAlignment(Pos.CENTER);
        
        Label labelBarcosHundidosJ1_2 = new Label ("Jugador 1: ");
        labelBarcosHundidosJ1_2.setFont(Font.font(20));
        labelBarcosHundidosJ1_2.setAlignment(Pos.CENTER);*/
        
        // Un botón con una leyenda de texto vacía.
        //Button buttonBoton1 = new Button("Comenzar");
        // Un botón con la leyenda de texto especificada.
        Button buttonBoton2 = new Button("Reiniciar");
        buttonBoton2.setOnAction((ActionEvent e) -> {
            marcador.puntos_J1 = 5; 
            letrero.quitarImagenGameOver();
        });
        this.setAlignment(Pos.CENTER);
        this.setPrefWidth(200);
        
        //this.getChildren().add(labelBarcosHundidosJ1_1);
        //this.getChildren().add(labelBarcosHundidosJ1_2);
        //this.getChildren().add(buttonBoton1);
        this.getChildren().add(buttonBoton2);
    }
    
    
}
