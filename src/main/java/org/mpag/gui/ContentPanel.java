package org.mpag.gui;

import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel {
    private final MenuPanel menuPanel;
    private final GamePanel gamePanel;
    private final CardLayout layout;

    public ContentPanel() {
        this.menuPanel = new MenuPanel(this);
        this.gamePanel = new GamePanel(this);
        this.layout = new CardLayout();

        this.initLayout();
    }

    private void initLayout() {
        this.setLayout(this.layout);
        this.add(menuPanel, "menu");
        this.add(gamePanel, "game");
    }

    public void changePanel(String panelName) {
        this.layout.show(this, panelName);
    }
}
