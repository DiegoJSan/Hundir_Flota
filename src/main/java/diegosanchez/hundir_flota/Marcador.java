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
 * Clase donde se va indicando la puntuación
 * @author Diego J. Sánchez
 */
public class Marcador extends VBox {
    
    //Variables
    int puntos_J1 = 5;
    int puntoMaximos = 0;
    boolean finalPartida = false;
    
    //Propiedades de la clase
    Label LabelPuntuacionJugador1;
    Label LabelPuntuacionMaxima;
    Letrero letrero;
    Botones botones;
    Sonidos sonido;
    
    /**
     * Método para crear las etiquedas de las puntuaciones
     * @param tableroJugador1 objeto de la clase tablero
     * @param letrero objeto de la clase Letrero
     */
    public Marcador(Tablero tableroJugador1, Letrero letrero){
        
        //Parámetro propio
        this.letrero = letrero;
        this.setAlignment(Pos.CENTER);
        this.setPrefWidth(200);
        
        //Etiqueta para juagaror 1
        Label labelPuntosJugador1 = new Label ("Puntos Jugador 1: ");
        labelPuntosJugador1.setFont(Font.font(20));
        labelPuntosJugador1.setAlignment(Pos.CENTER);
        
        //Etiqueta que muestra la puntuacion de jugador 1
        String stringPuntos_J1 = String.valueOf(puntos_J1);
        LabelPuntuacionJugador1 = new Label (stringPuntos_J1);
        LabelPuntuacionJugador1.setFont(Font.font(20));
        LabelPuntuacionJugador1.setAlignment(Pos.CENTER);
        
        //Etiqueta para puntuación máxima
        Label labelPuntosMaximo = new Label ("Puntuación Maxima: ");
        labelPuntosMaximo.setFont(Font.font(20));
        labelPuntosMaximo.setAlignment(Pos.CENTER);
        
        //Etiqueta que muestra la puntuación máxima
        String stringPuntosMaximmo = String.valueOf(puntoMaximos);
        LabelPuntuacionMaxima = new Label (stringPuntosMaximmo);
        LabelPuntuacionMaxima.setFont(Font.font(20));
        LabelPuntuacionMaxima.setAlignment(Pos.CENTER);
        
        //Parámetros propios
        this.getChildren().add(labelPuntosJugador1);
        this.getChildren().add(LabelPuntuacionJugador1);
        this.getChildren().add(labelPuntosMaximo);
        this.getChildren().add(LabelPuntuacionMaxima);
    }  
    
    /**
     * Método para modificar la puntuación
     * @param apuntes array que apunta los resultados de los disparos
     * @param columnaClic número de columna donde se hace clic
     * @param filaClic número de fila donde se hace clic
     * @param resultado número del resultado del disparo
     * @param sonido objeto de la clase Sonidos
     */
    public void puntuacion (int [][] apuntes, int columnaClic, int filaClic, int resultado, Sonidos sonido ) {
        
        //Parámetros propios
        this.sonido = sonido;
        
        //Comprobar el resultado del disparo para cambiar puntuación, modificar etiquetas y reproducir sonidos
        if (resultado == 1 && apuntes[columnaClic][filaClic] == 0 && finalPartida == false){
            puntos_J1 += 1;
            System.out.println("Puntos Jugador 1: " + puntos_J1);
            LabelPuntuacionJugador1.setText(String.valueOf(puntos_J1));
            sonido.sonidoDisparoTocado();
        }
        
        if (resultado == 2 && apuntes[columnaClic][filaClic] == 0 && finalPartida == false){
            puntos_J1 += 3;
            System.out.println("Puntos Jugador 1: " + puntos_J1);
            LabelPuntuacionJugador1.setText(String.valueOf(puntos_J1));
            sonido.sonidoDisparoTocado();
        }
        
        if (resultado == 3 && apuntes[columnaClic][filaClic] == 0 && finalPartida == false){
            puntos_J1 += 5;
            System.out.println("Puntos Jugador 1: " + puntos_J1);
            LabelPuntuacionJugador1.setText(String.valueOf(puntos_J1));
            sonido.sonidoDisparoTocado();
        }
        
        if (resultado == 4 && apuntes[columnaClic][filaClic] == 0 && finalPartida == false){
            puntos_J1 += 6;
            System.out.println("Puntos Jugador 1: " + puntos_J1);
            LabelPuntuacionJugador1.setText(String.valueOf(puntos_J1));
            sonido.sonidoDisparoTocado();
        }
        
        if (resultado == 0 && apuntes[columnaClic][filaClic] == 0 && finalPartida == false){
            puntos_J1 -= 1;
            System.out.println("Puntos Jugador 1: " + puntos_J1);
            LabelPuntuacionJugador1.setText(String.valueOf(puntos_J1));
            sonido.sonidoDisparoAgua();
        }
        
        //Actualizacion de máximo de puntos
        if (puntos_J1 > puntoMaximos) {
                //Cambiar la nueva puntuación
                puntoMaximos = puntos_J1;
                LabelPuntuacionMaxima.setText(String.valueOf(puntoMaximos));
        }
        
        //Comprobar los puntos para fin de partida
        if (puntos_J1 <= 0 ){
            //Comrobar que la partida no está terminada
            if (finalPartida == false) {
                letrero.imagenGameOver();
                sonido.sonidoGameOver();
            }
            letrero.quitarLetreros();
            System.out.println("Game Over");
            finalPartida = true;
        } 
    }
}
