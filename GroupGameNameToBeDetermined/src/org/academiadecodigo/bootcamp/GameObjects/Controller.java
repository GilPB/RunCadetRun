package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameObjects.CodeCadets;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controller implements KeyboardHandler {
    private Keyboard keyboard;
    private CodeCadets smoothOOPerators;

    public Controller(Field background, CodeCadets player){
        keyboard = new Keyboard(this);
        smoothOOPerators=player;
    }

    public void init(){
        KeyboardEvent moveRightEvent = new KeyboardEvent();
        KeyboardEvent moveLeftEvent = new KeyboardEvent();
        KeyboardEvent moveUpEvent = new KeyboardEvent();
        KeyboardEvent moveDownEvent = new KeyboardEvent();

        moveRightEvent.setKey(KeyboardEvent.KEY_RIGHT);
        moveRightEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveLeftEvent.setKey(KeyboardEvent.KEY_LEFT);
        moveLeftEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveUpEvent.setKey(KeyboardEvent.KEY_UP);
        moveUpEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveDownEvent.setKey(KeyboardEvent.KEY_DOWN);
        moveDownEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveRightEvent);
        keyboard.addEventListener(moveLeftEvent);
        keyboard.addEventListener(moveUpEvent);
        keyboard.addEventListener(moveDownEvent);
    }



    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey()== KeyboardEvent.KEY_RIGHT){
            smoothOOPerators.moveRight();
        } else if(keyboardEvent.getKey()== KeyboardEvent.KEY_LEFT){
            smoothOOPerators.moveLeft();
        } else if(keyboardEvent.getKey()== KeyboardEvent.KEY_UP){
            smoothOOPerators.moveUp();
        } else if (keyboardEvent.getKey()== KeyboardEvent.KEY_DOWN){
            smoothOOPerators.moveDown();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
