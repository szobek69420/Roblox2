package main.java.org.manager;

import main.java.org.game.Graphics.GameRenderer;

import javax.swing.*;
import java.awt.*;

public class GameManager {

    JFrame frame;
    JPanel currentPanel;
    public GameRenderer gameRenderer;


    public GameManager() {
        //Create frame and add GameRenderer
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameRenderer = new GameRenderer();
        frame.add(gameRenderer);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setBackground(new Color(100,100,100));

        currentPanel = gameRenderer;

        //Create Isten class
    }

    public void changePanel(JPanel panel) {
        frame.setContentPane(panel);
        panel.requestFocusInWindow();
        frame.revalidate();
        currentPanel.setFocusable(false);
        currentPanel = panel;
        currentPanel.setFocusable(true);
    }

}
