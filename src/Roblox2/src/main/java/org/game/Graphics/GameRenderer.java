package main.java.org.game.Graphics;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameRenderer extends JPanel {

    private ArrayList<Renderable> renderables;

    public GameRenderer() {
        this.setPreferredSize(new Dimension(500, 500));
        setFocusable(true);
        setDoubleBuffered(true);
        renderables = new ArrayList<>();
    }

    public void addRenderable(Renderable r) {
        renderables.add(r);
    }

    public void paint(Graphics graphics) {

        setBackground(new Color(50,50,50));

        if(renderables.isEmpty()) return;
        for(int i = 0; i < renderables.size(); i++) {
            renderables.get(i).render(graphics);
        }

        graphics.dispose();

    }

}
