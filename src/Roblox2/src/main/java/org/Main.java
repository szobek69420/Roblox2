package main.java.org;

import main.java.org.linalg.Vec2;
import main.java.org.manager.GameManager;
import main.java.org.game.Graphics.*;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        GameManager gameManager = new GameManager();
        String imagePath = "./assets/cube.jpg";
        gameManager.gameRenderer.addRenderable(new Text("Hello!", new Vec2(150, 100), 68, 255, 255, 255));
        gameManager.gameRenderer.addRenderable(new Image(new Vec2(200,200), 1, 1, new Vec2(100,100), imagePath));

        while(true) {
            gameManager.gameRenderer.repaint();
        }

    }
}