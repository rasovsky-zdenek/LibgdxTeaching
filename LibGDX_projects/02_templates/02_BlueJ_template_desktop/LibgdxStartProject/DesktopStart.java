/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

/**
 *
 * @author Rasovsky
 */
public class DesktopStart {

    /**
     * Startovaci metoda
     * vytvori se objekt game a ten je predan backendu, ktery bude volat prislusne metody v tride MyGame.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyGame game = new MyGame(); 
       new LwjglApplication(game,"MyGame",1280,720);
       
    }
    
}
