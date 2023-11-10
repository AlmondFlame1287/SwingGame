package org.mpag.gui;

import javax.swing.*;
import java.awt.*;

public abstract class DefaultPanel extends JPanel {
    /**
     * Implement this method in your class to draw stuff on the screen.
     * @param g Graphics component
     */
    public void draw(Graphics g) {}

    /**
     * Implement this method in your class to clear whatever the <code>draw</code> method created.
     * @param g Graphics component
     */
    public void clear(Graphics g) {
        g.setColor(this.getBackground());
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.draw(g);
    }
}
