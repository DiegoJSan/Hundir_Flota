package diegosanchez.hundir_flota;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Clase general donde se inicializa la aplicación
 * @author Diego J. Sánchez
 * @version: 29/03/2021/A
 */
public class App extends Application {
    /**
     * Clase de iniciación de la aplicación
     * @param stage Ventana de inicio de juego
     */
    @Override
    public void start(Stage stage) {
        
        //Crear objeto para la ventana inicial
        BorderPane paneRoot = new BorderPane();
        var scene = new Scene(paneRoot, 900, 600);
        stage.setScene(scene);
        stage.show();
        
        //Crear objeto tablero para jugador 1
        Tablero tableroJugador1 = new Tablero();  
        
        //Crear los barcos en el tablero       
        tableroJugador1.cantBarcos4(1);
        tableroJugador1.cantBarcos3(2);
        tableroJugador1.cantBarcos2(3);
        tableroJugador1.cantBarcos1(4);
        
        //Crear objeto para los sonido
        Sonidos sonido = new Sonidos();
        
        //Crear objeto y mostrar el método para la parte gráfica del Letrero
        Letrero letrero = new Letrero();
        paneRoot.setTop(letrero);
        
        //Crear objeto y mostrar el método para la parte gráfica del marcador
        Marcador marcador = new Marcador(tableroJugador1, letrero);
        paneRoot.setLeft(marcador); 
        
        //Crear objeto y mostrar el método para la parte gráfica del tablero
        TableroVista tableroVista = new TableroVista(tableroJugador1, letrero, marcador, sonido);
        paneRoot.setCenter(tableroVista); 
        
        //Crear objeto y mostrar el método para la parte gráfica del Recuento
        Botones botones = new Botones(marcador, letrero, tableroJugador1, tableroVista, sonido);
        paneRoot.setRight(botones);
        
        //Mostrar en consola al iniciar el juego
        System.out.println("Dispare en Casilla");
        
        //Mostrar el tablero       
        tableroJugador1.mostrarPorConsolaBarco();   
    }
    
    public static void main(String[] args) {
        launch();
    }
}