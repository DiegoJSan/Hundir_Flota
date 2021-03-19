package diegosanchez.hundir_flota;

import java.net.URISyntaxException;
import java.net.URL;
import javafx.scene.media.AudioClip;

/**
 * Clase par acrear los sonidos
 * @author Diego J.Sánchez
 */
public class Sonidos {
    
    //Propiedades de la clase
    AudioClip sonidoDisparoAgua;
    AudioClip sonidoExplosionBarcos;
    AudioClip sonidoGameOver;
    AudioClip sonidoGanaPartida;
    AudioClip sonidoReinicioPartida;
    
    /**
     * Método para sonido explosión Barcos
     */
    public void sonidoDisparoTocado(){
        
        //Sonido de explosión barcos //   
        URL urlExplosionBarcos = getClass().getResource("/sonidos/explosion_barcos.mp3");
        if(urlExplosionBarcos != null) {
            try {
                sonidoExplosionBarcos = new AudioClip(urlExplosionBarcos.toURI().toString());
            } catch (URISyntaxException ex) {
                System.out.println("Error en el formato de ruta de archivo de audio");
            }            
        } else {
        System.out.println("No se ha encontrado el archivo de audio");
        }
        //Play para reproducir sonido
        sonidoExplosionBarcos.play();
        System.out.println("Sonido Tocado");
    }
    
    /**
     * Método para sonido disaro en agua
     */
    public void sonidoDisparoAgua(){
        
        //Sonido de disparo al agua //   
        URL urlDisparoAgua = getClass().getResource("/sonidos/splash34.mp3");
        if(urlDisparoAgua != null) {
            try {
                sonidoDisparoAgua = new AudioClip(urlDisparoAgua.toURI().toString());
            } catch (URISyntaxException ex) {
                System.out.println("Error en el formato de ruta de archivo de audio");
            }            
        } else {
        System.out.println("No se ha encontrado el archivo de audio");
        }
        //Play para reproducir sonido
        sonidoDisparoAgua.play();
        System.out.println("Sonido Agua");
    }
    
    /**
     * //Método para sonido fin de partida
     */
    public void sonidoGameOver(){
        
        //Sonido de perder partida //   
        URL urlGameOver = getClass().getResource("/sonidos/gameOver.mp3");
        if(urlGameOver != null) {
            try {
                sonidoGameOver = new AudioClip(urlGameOver.toURI().toString());
            } catch (URISyntaxException ex) {
                System.out.println("Error en el formato de ruta de archivo de audio");
            }            
        } else {
        System.out.println("No se ha encontrado el archivo de audio");
        }
        //Play para reproducir sonido
        sonidoGameOver.play();
        System.out.println("Sonido Game Over");
    }
    
    /**
     * Método para sonido fin de partida
     */
    public void sonidoGanaPartida(){
        
        //Sonido de Ganar partia //   
        URL urlGanaPartida = getClass().getResource("/sonidos/ganar.mp3");
        if(urlGanaPartida != null) {
            try {
                sonidoGanaPartida = new AudioClip(urlGanaPartida.toURI().toString());
            } catch (URISyntaxException ex) {
                System.out.println("Error en el formato de ruta de archivo de audio");
            }            
        } else {
        System.out.println("No se ha encontrado el archivo de audio");
        }
        //Play para reproducir sonido
        sonidoGanaPartida.play();
        System.out.println("Sonido Gana Partida");
    }
    
    /**
     * //Método para sonido reinicio partida
     */
    public void sonidoReinicioPartida(){
        
        //Sonido de reinicio de partida //   
        URL urlReinicioPartida = getClass().getResource("/sonidos/reinicio.mp3");
        if(urlReinicioPartida != null) {
            try {
                sonidoReinicioPartida = new AudioClip(urlReinicioPartida.toURI().toString());
            } catch (URISyntaxException ex) {
                System.out.println("Error en el formato de ruta de archivo de audio");
            }            
        } else {
        System.out.println("No se ha encontrado el archivo de audio");
        }
        //Play para reproducir sonido
        sonidoReinicioPartida.play();
        System.out.println("Sonido Reinicio Partida");
    } 
}
