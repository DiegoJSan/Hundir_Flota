package diegosanchez.hundir_flota;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class App extends Application {
    
    
    
    @Override
    public void start(Stage stage) {
        
        
        
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
        
        //Crear objeto y mostrar el método para la parte gráfica del Letrero
        Letrero letrero = new Letrero();
        paneRoot.setTop(letrero);
        
        //Crear objeto y mostrar el método para la parte gráfica del marcador
        Marcador marcador = new Marcador(tableroJugador1, letrero);
        paneRoot.setLeft(marcador); 
        
        //Crear objeto y mostrar el método para la parte gráfica del tablero
        TableroVista tableroVista = new TableroVista(tableroJugador1, letrero, marcador);
        paneRoot.setCenter(tableroVista); 
        
        //Crear objeto y mostrar el método para la parte gráfica del Recuento
        Botones botones = new Botones(marcador, letrero, tableroJugador1, tableroVista);
        paneRoot.setRight(botones);
        
          
        
        
        //Mostrar el tablero       
        tableroJugador1.mostrarPorConsolaBarco();   
    }
    
    public static void main(String[] args) {
        launch();
    }

}