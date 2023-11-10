package org.mpag.gui;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends DefaultPanel {
    private final ContentPanel parent;

    public MenuPanel(ContentPanel parent) {
        this.parent = parent;

        this.initLayout();
        this.initTitle();
        this.initButtons();
    }

    private void initLayout() {
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        this.setLayout(layout);
    }

    private void initTitle() {

    }

    private void initButtons() {
        final JButton start = new JButton("Start game");
        final JButton settings = new JButton("Settings");
        final JButton exit = new JButton("Exit");

//        start.addActionListener(evt -> ); TODO: Start game
//        settings.addActionListener(evt -> ); TODO: Open settings
        exit.addActionListener(evt -> System.exit(0));

        this.add(start);
        this.add(settings);
        this.add(exit);
    }
}
