package com.imbackt.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;

    public KeyInput(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        handler.objects.forEach(object -> {
            if (object.id == ID.PLAYER) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_A -> object.velocityX = -5;
                    case KeyEvent.VK_D -> object.velocityX = 5;
                    case KeyEvent.VK_W -> object.velocityY = -5;
                    case KeyEvent.VK_S -> object.velocityY = 5;
                }
            }
        });
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) System.exit(1);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        handler.objects.forEach(object -> {
            if (object.id == ID.PLAYER) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_A, KeyEvent.VK_D -> object.velocityX = 0;
                    case KeyEvent.VK_W, KeyEvent.VK_S -> object.velocityY = 0;
                }
            }
        });
    }
}
