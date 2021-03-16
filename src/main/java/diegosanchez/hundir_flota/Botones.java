
package diegosanchez.hundir_flota;

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
    TableroVista tableroVista;
  

    public Botones(Marcador marcador, Letrero letrero, Tablero tableroJugador1, TableroVista tableroVista){
        
        this.letrero = letrero;
        this.tableroVista = tableroVista;
        
        // Un botón con la leyenda de texto especificada.
        Button buttonReiniciar = new Button("Reiniciar");
        buttonReiniciar.setOnAction((ActionEvent e) -> {
            System.out.println("Reinicio Partida ");
            marcador.puntos_J1 = 5; 
            letrero.quitarImagenGameOver();
            letrero.quitarLetreros();
            tableroJugador1.recuento = 0;
            marcador.LabelPuntuacionJugador1.setText(String.valueOf(marcador.puntos_J1));
            marcador.finalPartida = false;
            //Crear los barcos en el tablero  
            tableroJugador1.generarBarco0();
            tableroVista.borrarCasillas();
            tableroJugador1.cantBarcos4(1);
            tableroJugador1.cantBarcos3(2);
            tableroJugador1.cantBarcos2(3);
            tableroJugador1.cantBarcos1(4);
            //Mostrar el tablero       
            tableroJugador1.mostrarPorConsolaBarco();
            //Establecer todos los auntes a cero
            tableroJugador1.mostrarPorConsolaApuntesCero();
            //Llamar al método constructor TableroVista
            tableroVista.crearCasillas();
        });
        this.setAlignment(Pos.CENTER);
        this.setPrefWidth(200);
        this.getChildren().add(buttonReiniciar);
    }
    
    
}
