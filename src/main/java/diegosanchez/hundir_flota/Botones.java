package diegosanchez.hundir_flota;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 * Clase para la cración y control de botones
 * @author Diego J. Sánchez
 */
public class Botones extends VBox {
    
    //Propiedades de la clase
    Letrero letrero;
    TableroVista tableroVista;
    Sonidos sonido;
  
    /**
     * Método para la creación de los botones y sus acciones
     * @param marcador objeto de la clase Marcador
     * @param letrero objeto de la clase Letrero
     * @param tableroJugador1 objeto de la clase Tablero
     * @param tableroVista objeto de la clase TableroVista
     * @param sonido objeto de la clase Sonidos
     */
    public Botones(Marcador marcador, Letrero letrero, Tablero tableroJugador1, TableroVista tableroVista, Sonidos sonido){
        
        //Parámetros propios
        this.letrero = letrero;
        this.tableroVista = tableroVista;
        this.sonido = sonido;
        
        // Un botón con el texto especificado.
        Button buttonReiniciar = new Button("Reiniciar");
        buttonReiniciar.setOnAction((ActionEvent e) -> {
            //Acciones cuando se pulsa el botón
            System.out.println("Reinicio Partida ");
            sonido.sonidoReinicioPartida();
            marcador.puntos_J1 = 5; 
            letrero.tiroAgua = false;
            letrero.quitarImagenGameOver();
            letrero.quitarLetreros();
            letrero.ponerLetreros();
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
            //Mostrar por consola mensaje inicial
            System.out.println("Dispare en Casilla");
        });
        
        //Parámetros propios
        this.setAlignment(Pos.CENTER);
        this.setPrefWidth(200);
        this.getChildren().add(buttonReiniciar);
    }
}
