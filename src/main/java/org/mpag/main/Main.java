package org.mpag.main;

import org.mpag.gui.ContentPanel;

import javax.swing.*;

import static org.mpag.utils.Constants.DEFAULT_WINDOW_HEIGHT;
import static org.mpag.utils.Constants.DEFAULT_WINDOW_WIDTH;


public class Main extends JFrame {

    public Main() {
        this.initDefaultOperations();
        this.initWindow();
        this.setVisible(true);
    }

    /**
     * Initializes title, size and window resizability.
     */
    private void initWindow() {
        this.setTitle("Game");
        this.setSize(DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT);
        this.setResizable(false); // To change in the future
        this.setContentPane(new ContentPanel());
    }

    /**
     * Initializes window position and default close operation.
     */
    private void initDefaultOperations() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}