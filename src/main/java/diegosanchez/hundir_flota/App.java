package diegosanchez.hundir_flota;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class App extends Application {
    
    boolean barco1Creado;
    boolean barco2Creado;
    boolean barco3Creado;
    boolean barco4Creado;
    
    @Override
    public void start(Stage stage) {
        Pane paneRoot = new Pane();
        var scene = new Scene(paneRoot, 640, 480);
        stage.setScene(scene);
        stage.show();
       
        Tablero tableroJugador1;
        tableroJugador1 = new Tablero();
        
        //Crear los barcos en el tablero       
        tableroJugador1.cantBarcos1(4);
        tableroJugador1.cantBarcos2(3);
        tableroJugador1.cantBarcos3(2);
        tableroJugador1.cantBarcos4(1);
        
        System.out.println("Resultado de disparo en casilla 4, 2 = " + tableroJugador1.getCasillaDisparo(4, 2));
        int disparo = tableroJugador1.getCasillaDisparo(4, 2);
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