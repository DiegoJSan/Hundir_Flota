
package diegosanchez.hundir_flota;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

/**
 *
 * @author Diego
 */
public class Letrero extends HBox{
    
   
    Label labelResultadoAgua;
    Label labelResultadoTocado;
            
    public Letrero () {
        
        labelResultadoAgua = new Label ("Agua");
        labelResultadoAgua.setFont(Font.font(20));
        labelResultadoAgua.setAlignment(Pos.CENTER);
        labelResultadoAgua.setVisible(false);
        
        labelResultadoTocado = new Label ("Tocado");
        labelResultadoTocado.setFont(Font.font(20));
        labelResultadoTocado.setAlignment(Pos.CENTER);
        labelResultadoTocado.setVisible(false);
        
        this.setAlignment(Pos.CENTER);
        
        this.getChildren().add(labelResultadoAgua);
        this.getChildren().add(labelResultadoTocado);
    }
       
    public void tiro (int resultado) {      
        if (resultado == 0) {
            System.out.println("Letrero: Agua");
            labelResultadoAgua.setVisible(true);
            labelResultadoTocado.setVisible(false);
        } else {
            System.out.println("Letrero: Tocado");
            labelResultadoAgua.setVisible(false);
            labelResultadoTocado.setVisible(true);
        }
    }
    
}
