package diegosanchez.hundir_flota;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class App extends Application {

    @Override
    public void start(Stage stage) {
        Pane paneRoot = new Pane();
        var scene = new Scene(paneRoot, 640, 480);
        stage.setScene(scene);
        stage.show();
        
        Tablero TableroJugador1 = new Tablero();
        TableroJugador1.generarbarco1(4);
        TableroJugador1.generarbarco2(3);
        TableroJugador1.generarbarco3(2);
        TableroJugador1.generarbarco4(1);
    }
    
    public static void main(String[] args) {
        launch();
    }

}