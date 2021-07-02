package com.imbackt.main;

import java.awt.*;

public class Player extends GameObject {

    public Player(int x, int y, ID id) {
        super(x, y, id);
    }

    @Override
    public void tick() {
        x += velocityX;
        y += velocityY;
    }

    @Override
    public void render(Graphics g) {
        if (id == ID.PLAYER)
            g.setColor(Color.WHITE);
        if (id == ID.PLAYER2)
            g.setColor(Color.CYAN);
        g.fillRect(x, y, 32, 32);
    }
}
