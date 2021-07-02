package com.imbackt.main;

import java.awt.*;

public class BasicEnemy extends GameObject {

    public BasicEnemy(int x, int y, ID id) {
        super(x, y, id);

        velocityX = 5;
        velocityY = 5;
    }

    @Override
    public void tick() {
        x += velocityX;
        y += velocityY;

        if (y <= 0 || y >= Game.HEIGHT - 32) velocityY *= -1;
        if (x <= 0 || x >= Game.WIDTH - 32) velocityX *= -1;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, 16, 16);
    }
}
