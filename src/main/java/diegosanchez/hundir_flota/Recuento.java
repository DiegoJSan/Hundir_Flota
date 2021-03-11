
package diegosanchez.hundir_flota;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author Diego
 */
public class Recuento extends VBox {
    
    

    public Recuento(){
        
        Label labelBarcosHundidosJ1_1 = new Label ("Barcos Hundidos");
        labelBarcosHundidosJ1_1.setFont(Font.font(20));
        labelBarcosHundidosJ1_1.setAlignment(Pos.CENTER);
        
        Label labelBarcosHundidosJ1_2 = new Label ("Jugador 1: ");
        labelBarcosHundidosJ1_2.setFont(Font.font(20));
        labelBarcosHundidosJ1_2.setAlignment(Pos.CENTER);
        
        this.setAlignment(Pos.CENTER);
        this.setPrefWidth(200);
        
        this.getChildren().add(labelBarcosHundidosJ1_1);
        this.getChildren().add(labelBarcosHundidosJ1_2);
    }
    
    
}
