package com.imbackt.main;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject {

    public Player(int x, int y, ID id) {
        super(x, y, id);

        Random r = new Random();
        velocityX = r.nextInt(5) + 1;
        velocityY = r.nextInt(5);
    }

    @Override
    public void tick() {
        x += velocityX;
        y += velocityY;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 32, 32);
    }
}
