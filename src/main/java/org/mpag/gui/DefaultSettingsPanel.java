package org.mpag.gui;

import javax.swing.*;

public abstract class DefaultSettingsPanel extends JPanel {
    protected ContentPanel parent;

    public DefaultSettingsPanel(ContentPanel parent) {
        this.parent = parent;
    }

    public abstract void initButtons();
    public abstract void initLayout();
}
