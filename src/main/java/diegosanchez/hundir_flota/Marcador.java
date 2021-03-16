/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegosanchez.hundir_flota;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author Diego
 */
public class Marcador extends VBox {
    
    int puntos_J1 = 5;
    int puntoMaximos = 0;
    boolean finalPartida = false;
    Label LabelPuntuacionJugador1;
    Label LabelPuntuacionMaxima;
    Letrero letrero;
    Botones botones;
    
    public Marcador(Tablero tableroJugador1, Letrero letrero){
        
        this.letrero = letrero;
        
        Label labelPuntosJugador1 = new Label ("Puntos Jugador 1: ");
        labelPuntosJugador1.setFont(Font.font(20));
        labelPuntosJugador1.setAlignment(Pos.CENTER);
        
        String stringPuntos_J1 = String.valueOf(puntos_J1);
        LabelPuntuacionJugador1 = new Label (stringPuntos_J1);
        LabelPuntuacionJugador1.setFont(Font.font(20));
        LabelPuntuacionJugador1.setAlignment(Pos.CENTER);
        
        Label labelPuntosMaximo = new Label ("Puntuación Maxima: ");
        labelPuntosMaximo.setFont(Font.font(20));
        labelPuntosMaximo.setAlignment(Pos.CENTER);
        
        String stringPuntosMaximmo = String.valueOf(puntoMaximos);
        LabelPuntuacionMaxima = new Label (stringPuntosMaximmo);
        LabelPuntuacionMaxima.setFont(Font.font(20));
        LabelPuntuacionMaxima.setAlignment(Pos.CENTER);
        
        
        this.setAlignment(Pos.CENTER);
        this.setPrefWidth(200);

        
        this.getChildren().add(labelPuntosJugador1);
        this.getChildren().add(LabelPuntuacionJugador1);
        this.getChildren().add(labelPuntosMaximo);
        this.getChildren().add(LabelPuntuacionMaxima);
    }  
    
    public void puntuacion (int [][] apuntes, int columnaClic, int filaClic, int resultado) {
        
        //System.out.println("Apunte: " + apuntes[columnaClic][filaClic]);
        
        if (resultado == 1 && apuntes[columnaClic][filaClic] == 0 && finalPartida == false){
            puntos_J1 += 1;
            System.out.println("Puntos Jugador 1: " + puntos_J1);
            LabelPuntuacionJugador1.setText(String.valueOf(puntos_J1));
        };
        
        if (resultado == 2 && apuntes[columnaClic][filaClic] == 0 && finalPartida == false){
            puntos_J1 += 3;
            System.out.println("Puntos Jugador 1: " + puntos_J1);
            LabelPuntuacionJugador1.setText(String.valueOf(puntos_J1));
        };
        
        if (resultado == 3 && apuntes[columnaClic][filaClic] == 0 && finalPartida == false){
            puntos_J1 += 5;
            System.out.println("Puntos Jugador 1: " + puntos_J1);
            LabelPuntuacionJugador1.setText(String.valueOf(puntos_J1));
        };
        
        if (resultado == 4 && apuntes[columnaClic][filaClic] == 0 && finalPartida == false){
            puntos_J1 += 6;
            System.out.println("Puntos Jugador 1: " + puntos_J1);
            LabelPuntuacionJugador1.setText(String.valueOf(puntos_J1));
        };
        
        if (resultado == 0 && finalPartida == false){
            puntos_J1 -= 1;
            System.out.println("Puntos Jugador 1: " + puntos_J1);
            LabelPuntuacionJugador1.setText(String.valueOf(puntos_J1));
        };
        
        //Actualizacion de máximo de puntos
        if (puntos_J1 > puntoMaximos) {
                //Cambiar la nueva puntuación
                puntoMaximos = puntos_J1;
                LabelPuntuacionMaxima.setText(String.valueOf(puntoMaximos));
        }
        
        if (puntos_J1 <= 0){
            if (finalPartida == false) {
                letrero.imagenGameOver();
            }
            letrero.quitarLetreros();
            System.out.println("Game Over");
            finalPartida = true;
        } 
    }
}
