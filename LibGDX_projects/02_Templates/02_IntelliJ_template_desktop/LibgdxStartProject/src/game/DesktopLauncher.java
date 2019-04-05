package game;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
    /**
     * Startovaci metoda
     * vytvori se objekt game a ten je predan backendu, ktery bude volat prislusne metody v tride MyGame.
     * @param args
     */
    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "MyGame";
        config.width = 1280;
        config.height = 720;
        new LwjglApplication(new MyGame(), config);
    }
}
