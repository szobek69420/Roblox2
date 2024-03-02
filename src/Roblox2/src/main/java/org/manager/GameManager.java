package main.java.org.manager;

import main.java.org.game.Graphics.GameRenderer;
import main.java.org.game.Isten;

import javax.swing.*;
import java.awt.*;

public class GameManager {

    private JFrame frame;
    private JPanel currentPanel;
    private Isten isten;

    public GameManager() {
        //Create frame
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setBackground(new Color(50,50,50));
        //Create Isten class
        isten = new Isten();
        isten.init();
        frame.add(isten.getRenderer());
        currentPanel = isten.getRenderer();
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
