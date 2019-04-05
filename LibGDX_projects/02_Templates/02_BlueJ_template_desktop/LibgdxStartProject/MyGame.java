import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class MyGame extends ApplicationAdapter {
    SpriteBatch batch; //batch je potrebny pro vykresleni textur pomoci graficke karty
    Texture img; //img obsahuje vykreslovany obrazek (texturu)
    
    /**
     * Metoda create je volana pri spousteni hry,
     * vytvorime zde potrebne objekty
     */
    @Override
    public void create() {
         batch = new SpriteBatch();
         img = new Texture(Gdx.files.internal("assets/badlogic.jpg"));  
    }
    
    /**
     * Metoda render je volana cca 60x za 1s (dulezite pro animace)
     */
    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
                
        batch.begin();
                batch.draw(img, 0, 0);
                batch.end();
    }
    
    /**
     * Metoda dispose je volana pri ukonceni hry,
     * do metody je treba umistit objekty trid, ktere maji metodu dispose
     */
    @Override
    public void dispose () {
        batch.dispose();
        img.dispose();
    }
    
    
}
