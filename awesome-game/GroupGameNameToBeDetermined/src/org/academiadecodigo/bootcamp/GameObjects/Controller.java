package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controller implements KeyboardHandler {
    private Keyboard keyboard;
    private CodeCadets player;

    public Controller(CodeCadets player){
        keyboard = new Keyboard(this);
        this.player =player;
    }

    public void init(){
        KeyboardEvent moveRightEvent = new KeyboardEvent();
        KeyboardEvent moveLeftEvent = new KeyboardEvent();
        KeyboardEvent moveUpEvent = new KeyboardEvent();
        KeyboardEvent moveDownEvent = new KeyboardEvent();
        KeyboardEvent stopMoveRight = new KeyboardEvent();
        KeyboardEvent stopMoveLeft = new KeyboardEvent();
        KeyboardEvent stopMoveUp = new KeyboardEvent();
        KeyboardEvent stopMoveDown = new KeyboardEvent();


        moveRightEvent.setKey(KeyboardEvent.KEY_RIGHT);
        moveRightEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveLeftEvent.setKey(KeyboardEvent.KEY_LEFT);
        moveLeftEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveUpEvent.setKey(KeyboardEvent.KEY_UP);
        moveUpEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveDownEvent.setKey(KeyboardEvent.KEY_DOWN);
        moveDownEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        stopMoveRight.setKey(KeyboardEvent.KEY_RIGHT);
        stopMoveRight.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        stopMoveLeft.setKey(KeyboardEvent.KEY_LEFT);
        stopMoveLeft.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        stopMoveUp.setKey(KeyboardEvent.KEY_UP);
        stopMoveUp.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        stopMoveDown.setKey(KeyboardEvent.KEY_DOWN);
        stopMoveDown.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(moveRightEvent);
        keyboard.addEventListener(moveLeftEvent);
        keyboard.addEventListener(moveUpEvent);
        keyboard.addEventListener(moveDownEvent);
        keyboard.addEventListener(stopMoveDown);
        keyboard.addEventListener(stopMoveUp);
        keyboard.addEventListener(stopMoveLeft);
        keyboard.addEventListener(stopMoveRight);
    }



    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey()== KeyboardEvent.KEY_RIGHT){
            player.moveRight();

        } else if(keyboardEvent.getKey()== KeyboardEvent.KEY_LEFT){
            player.moveLeft();

        } else if(keyboardEvent.getKey()== KeyboardEvent.KEY_UP){
            player.moveUp();

        } else if (keyboardEvent.getKey()== KeyboardEvent.KEY_DOWN){
            player.moveDown();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
