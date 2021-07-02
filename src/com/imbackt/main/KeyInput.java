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
            if (object.id == ID.PLAYER2) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT -> object.velocityX = -5;
                    case KeyEvent.VK_RIGHT -> object.velocityX = 5;
                    case KeyEvent.VK_UP -> object.velocityY = -5;
                    case KeyEvent.VK_DOWN -> object.velocityY = 5;
                }
            }
        });
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
            if (object.id == ID.PLAYER2) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT -> object.velocityX = 0;
                    case KeyEvent.VK_UP, KeyEvent.VK_DOWN -> object.velocityY = 0;
                }
            }
        });
    }
}
