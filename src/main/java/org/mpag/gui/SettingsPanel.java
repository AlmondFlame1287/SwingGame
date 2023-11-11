package org.mpag.gui;

import javax.swing.*;

public class SettingsPanel extends DefaultSettingsPanel {
    public SettingsPanel(ContentPanel parent) {
        super(parent);

        this.initLayout();
        this.initButtons();
    }

    @Override
    public void initLayout() {
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        this.setLayout(layout);
    }

    @Override
    public void initButtons() {
        final JButton audioPanel = new JButton("Audio");
        final JButton goBack = new JButton("Back");

        audioPanel.addActionListener(evt -> this.parent.changePanel("audio_settings"));
        goBack.addActionListener(evt -> this.parent.changePanel("menu"));

        this.add(audioPanel);
        this.add(goBack);
    }
}
