package main.java.org.game.Graphics;

import java.awt.*;
import main.java.org.linalg.*;

public class Text extends Renderable {

    private final String text;
    private final Font font;
    private final Color color;

    public Text() {
        font = new Font("Dialog", Font.PLAIN, 14);
        color = Color.WHITE;
        text = "Basic Text";
    }
    public Text(String text, Vec2 pos, int fontSize, int r, int g, int b) {

        this.position = pos;
        font = new Font("Dialog", Font.BOLD, fontSize);
        color = new Color(r,g,b);
        this.text = text;
    }
    @Override
    public void render(Graphics graphics) {

        //Set font
        graphics.setFont(font);

        //Shadow
        graphics.setColor(Color.black);
        graphics.drawString(text, (int)position.x+5, (int)position.y+5);

        //Text with its color
        graphics.setColor(color);
        graphics.drawString(text, (int)position.x, (int)position.y);
    }
}