package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameEnvironment.Position;
import org.academiadecodigo.bootcamp.GameObjects.*;

public class Main {
    public static void main(String[] args) {
        Sound gameSound = new Sound("resources/pacman.wav");
        gameSound.play(true);
        Game g= new Game(PickAPlayer.FRED);
        g.start();
    }
}
