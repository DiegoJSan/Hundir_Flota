/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegosanchez.hundir_flota;


import java.net.URISyntaxException;
import java.net.URL;
import javafx.scene.media.AudioClip;


/**
 *
 * @author Diego
 */
public class Sonidos {
    
    
    
    //Método para sonido explosion Barco
    public void explosionBarco(){
        
        AudioClip  sonidoExplosionBarco;
        
        //Sonido de explosión naves enemigas //   
        URL urlExplosionNaves = getClass().getResource("/sonidos/explosion_Naves.mp3");
        if(urlExplosionNaves != null) {
            try {
                sonidoExplosionBarco = new AudioClip(urlExplosionNaves.toURI().toString());
            } catch (URISyntaxException ex) {
                System.out.println("Error en el formato de ruta de archivo de audio");
            }            
        } else {
        System.out.println("No se ha encontrado el archivo de audio");
        }
    }
}
