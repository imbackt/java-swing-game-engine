package com.imbackt.main;

import java.awt.*;

public class Game extends Canvas implements Runnable {

    public static final int WIDTH = 640;
    public static final int HEIGHT = WIDTH / 12 * 9;

    public Game() {
        new Window(WIDTH, HEIGHT, "Game!", this);
    }

    public synchronized void start() {

    }

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        new Game();
    }
}
