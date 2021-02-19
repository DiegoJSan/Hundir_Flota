package diegosanchez.hundir_flota;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class App extends Application {
    
    boolean barco4Creado;
    
    @Override
    public void start(Stage stage) {
        Pane paneRoot = new Pane();
        var scene = new Scene(paneRoot, 640, 480);
        stage.setScene(scene);
        stage.show();
       
        
        Tablero TableroJugador1 = new Tablero();
        //TableroJugador1.generarBarco1(4);
        //TableroJugador1.generarBarco2(3);
        //TableroJugador1.generarBarco3(2);
        //TableroJugador1.generarBarco4();
        
        do {
           barco4Creado = TableroJugador1.generarBarco4();
        } while (barco4Creado == false);
        TableroJugador1.mostrarPorConsola();    
    }
    
    public static void main(String[] args) {
        launch();
    }

}