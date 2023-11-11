package org.mpag.gui;

import javax.swing.*;

public class AudioPanel extends DefaultSettingsPanel {

    public AudioPanel(ContentPanel parent) {
        super(parent);

        this.initLayout();
        this.initButtons();
    }

    @Override
    public void initButtons() {
        JLabel volumeLabel = new JLabel("Volume");
        // TODO: Add Sound class
        JSlider slider = new JSlider();

        this.add(volumeLabel);
        this.add(slider);
    }

    @Override
    public void initLayout() {
        // TODO: Finish implementation
    }
}
