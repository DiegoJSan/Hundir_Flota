package diegosanchez.hundir_flota;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class App extends Application {
    
   
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
        //
        tableroJugador1.cantBarcos1(4);
        
        do{
            barco2Creado = tableroJugador1.generarBarco2();
        } while (barco2Creado == false);
        do{
            barco2Creado = tableroJugador1.generarBarco2();
        } while (barco2Creado == false);
        
        do{
            barco3Creado = tableroJugador1.generarBarco3();
        } while (barco3Creado == false);
        
        do{
           barco4Creado = tableroJugador1.generarBarco4();
        } while (barco4Creado == false);
        
        tableroJugador1.mostrarPorConsola();    
    }
    
    public static void main(String[] args) {
        launch();
    }

}