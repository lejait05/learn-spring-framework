package com.in28minutes.learnspringframework.game;

public class PacManGame implements GamingConsole {

    public void up() {
        System.out.println("Chomp up");
    }

    public void down() {
        System.out.println("Chomp down");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Chomp right");
    }
}

