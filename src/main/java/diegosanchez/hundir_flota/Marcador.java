/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegosanchez.hundir_flota;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Diego
 */
public class Marcador extends VBox {
    
    public Marcador(){
        
        
        Label labelPuntosJugador1 = new Label ("Puntos Jugador 1: ");
        labelPuntosJugador1.setFont(Font.font(20));
        labelPuntosJugador1.setAlignment(Pos.CENTER);
        
        Label LabelPuntuacionJugador1 = new Label ("0");
        LabelPuntuacionJugador1.setFont(Font.font(20));
        LabelPuntuacionJugador1.setAlignment(Pos.CENTER);
        
        Label labelPuntosJugador2 = new Label ("Puntos Jugador 2: ");
        labelPuntosJugador2.setFont(Font.font(20));
        labelPuntosJugador2.setAlignment(Pos.CENTER);
        
        Label LabelPuntuacionJugador2 = new Label ("0");
        LabelPuntuacionJugador2.setFont(Font.font(20));
        LabelPuntuacionJugador2.setAlignment(Pos.CENTER);
        
        
        this.setAlignment(Pos.CENTER);
        this.setPrefWidth(200);

        
        this.getChildren().add(labelPuntosJugador1);
        this.getChildren().add(LabelPuntuacionJugador1);
        this.getChildren().add(labelPuntosJugador2);
        this.getChildren().add(LabelPuntuacionJugador2);
    }    
}
