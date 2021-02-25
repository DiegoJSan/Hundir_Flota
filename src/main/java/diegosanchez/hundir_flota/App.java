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
        var scene = new Scene(paneRoot, 640, 480);
        stage.setScene(scene);
        stage.show();
       
        Tablero tableroJugador1 = new Tablero();
        
        TableroVista tableroVista = new TableroVista();
        paneRoot.setCenter(tableroVista);
        
        
        //Crear los barcos en el tablero       
        tableroJugador1.cantBarcos4(1);
        tableroJugador1.cantBarcos3(2);
        tableroJugador1.cantBarcos2(3);
        tableroJugador1.cantBarcos1(4);
        
        //comprovar qúe hay en la casilla elegida
        int disparo = tableroJugador1.getCasillaDisparo(4, 6);      
        System.out.println("Resultado de disparo en casilla 4, 6 = " + disparo);
        if (disparo == 0){
            System.out.println("Agua");
            } else{ 
            System.out.println("Tocado"); 
        }
        //Mostrar el tablero       
        tableroJugador1.mostrarPorConsola();    
    }
    
    public static void main(String[] args) {
        launch();
    }

}