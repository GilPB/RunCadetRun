package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.GameObjects.PickAPlayer;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MainMenuController implements KeyboardHandler {

    private Game newGame;
    private Keyboard mainKeys;


    public MainMenuController(Game newGame) {
        this.newGame = newGame;
        mainKeys = new Keyboard(this);
    }

    public void init() {
        KeyboardEvent gameStart = new KeyboardEvent();
        gameStart.setKey(KeyboardEvent.KEY_SPACE);
        gameStart.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        mainKeys.addEventListener(gameStart);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            newGame.getInstructions();
        }
    }
}
