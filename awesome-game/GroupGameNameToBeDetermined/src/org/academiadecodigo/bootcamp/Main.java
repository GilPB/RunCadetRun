package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameObjects.PickAPlayer;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
    public static void main(String[] args) {

        Field field = new Field();
        Game game = new Game(field);
        Sound introSound = new Sound("intromusictest.wav");
        introSound.play(true);
        introSound.setLoop(4000);

        while(!game.solveThis){
            Thread.yield();
        }
        introSound.stop();
        Sound gameSound = new Sound("bumblebee.wav");
        gameSound.play(true);
        gameSound.setLoop(4000);
        game.start(game.choose);
        if (game.isWinner()) {
            gameSound.stop();
            Sound winnerSong = new Sound("winnersong.wav");
            winnerSong.play(true);
        }
        if(game.isLoser()){
            gameSound.stop();
            Sound loserSound = new Sound("loosersound.wav");
            loserSound.play(true);
        }
    }
}
