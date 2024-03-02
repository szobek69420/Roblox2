package main.java.org.game;

import main.java.org.game.Graphics.GameRenderer;
import main.java.org.game.Graphics.Image;
import main.java.org.game.Graphics.Text;
import main.java.org.game.physics.PhysicsEngine;
import main.java.org.linalg.Vec2;

public class Isten {
    private PhysicsEngine physicsEngine;
    private GameRenderer renderer;

    public Isten() {

    }

    public void gameLoop() {
        //call update for updatables
        renderer.repaint();
    }

    public void init() {
        physicsEngine = new PhysicsEngine();
        renderer = new GameRenderer();

        addRenderables();
    }

    private void addRenderables() {

        String imagePath = "C:\\Users\\kuruc\\OneDrive\\Desktop\\Projlab\\Roblox2\\src\\Roblox2\\assets\\cube.jpg";

        renderer.addRenderable(new Text("Hello!", new Vec2(150, 100), 68, 255, 255, 255));
        renderer.addRenderable(new Image(new Vec2(200,200), 1, 1, new Vec2(100,100), imagePath));
    }

    public GameRenderer getRenderer() {
        return renderer;
    }
}
