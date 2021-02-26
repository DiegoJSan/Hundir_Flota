
package diegosanchez.hundir_flota;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class TableroVista extends GridPane {
        
    public TableroVista(Tablero tableroJugador1) {
        for(int y=0; y<10; y++) {
            for (int x=0; x<10; x++) {
                int numeroPosicion = tableroJugador1.getCasillaDisparo(x, y);
                String stringNumeroPosicion = String.valueOf(numeroPosicion);
                Label etiquetaTablero = new Label(stringNumeroPosicion);
                this.add(etiquetaTablero, x, y);
            }
        }
    }
}
