package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameObjects.PickAPlayer;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
    public static void main(String[] args) {

        Field field = new Field();
        Game game = new Game(field);
        Sound gameSound = new Sound("resources/bumblebee.wav");
        gameSound.play(true);
        gameSound.setLoop(4000);
        while(!game.solveThis){
            Thread.yield();
        }
        game.start(game.choose);
    }
}
