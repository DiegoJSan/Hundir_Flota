/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegosanchez.hundir_flota;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Diego
 */
public class Marcador extends VBox {
    
    public void Marcador(){
        //Label puntos = new Label("puntos");
        VBox VboxPuntuacion = new VBox();
        VboxPuntuacion.setMinWidth(80);
        VboxPuntuacion.setAlignment(Pos.CENTER);
        VboxPuntuacion.setSpacing(100);
        
        //Layout para puntuación actual
        VBox VBoxPuntuacionActual = new VBox();
        VBoxPuntuacionActual.setSpacing(10);
        VboxPuntuacion.getChildren().add(VBoxPuntuacionActual);
        
        Text textoPuntos = new Text ("Puntos:");
        textoPuntos.setFont(Font.font(20));
        textoPuntos.setFill(Color.GREEN);
    }    
}
