package org.javaclass.util;

import javax.swing.*;
import java.awt.*;

public
class AnimatedCircle extends JPanel {

    private int x = 0;
    private int y = 0;

    public AnimatedCircle() {
        Timer timer = new Timer(10, e -> {
            x += 1;
            y += 1;
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
    }


}