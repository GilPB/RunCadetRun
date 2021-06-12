package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.Game;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class ChooseAPlayerController implements KeyboardHandler {

    private Game newGame;
    private Keyboard mainKeys;


    public ChooseAPlayerController(Game newGame) {
        this.newGame = newGame;
        mainKeys = new Keyboard(this);
    }

    public void init() {
        KeyboardEvent alberto = new KeyboardEvent();
        KeyboardEvent carla = new KeyboardEvent();
        KeyboardEvent fred = new KeyboardEvent();
        KeyboardEvent gil = new KeyboardEvent();
        KeyboardEvent hugo = new KeyboardEvent();
        KeyboardEvent joana = new KeyboardEvent();
        KeyboardEvent joao = new KeyboardEvent();
        KeyboardEvent joni = new KeyboardEvent();
        KeyboardEvent miguel = new KeyboardEvent();
        KeyboardEvent nuno = new KeyboardEvent();
        KeyboardEvent pedro = new KeyboardEvent();
        KeyboardEvent rui = new KeyboardEvent();
        alberto.setKey(KeyboardEvent.KEY_1);
        carla.setKey(KeyboardEvent.KEY_2);
        fred.setKey(KeyboardEvent.KEY_3);
        gil.setKey(KeyboardEvent.KEY_4);
        hugo.setKey(KeyboardEvent.KEY_5);
        joana.setKey(KeyboardEvent.KEY_6);
        joao.setKey(KeyboardEvent.KEY_7);
        joni.setKey(KeyboardEvent.KEY_8);
        miguel.setKey(KeyboardEvent.KEY_9);
        nuno.setKey(KeyboardEvent.KEY_0);
        pedro.setKey(KeyboardEvent.KEY_A);
        rui.setKey(KeyboardEvent.KEY_S);
        alberto.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        carla.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        fred.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        gil.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        hugo.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        joana.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        joao.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        joni.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        miguel.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        nuno.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        pedro.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        rui.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        mainKeys.addEventListener(alberto);
        mainKeys.addEventListener(carla);
        mainKeys.addEventListener(fred);
        mainKeys.addEventListener(gil);
        mainKeys.addEventListener(hugo);
        mainKeys.addEventListener(joana);
        mainKeys.addEventListener(joao);
        mainKeys.addEventListener(joni);
        mainKeys.addEventListener(miguel);
        mainKeys.addEventListener(nuno);
        mainKeys.addEventListener(pedro);
        mainKeys.addEventListener(rui);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_1) {
            newGame.choose=PickAPlayer.ALBERTO;
            newGame.solveThis = true;
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_2) {
            newGame.choose=PickAPlayer.CARLA;
            newGame.solveThis = true;
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_3) {
            newGame.choose=PickAPlayer.FRED;
            newGame.solveThis = true;
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_4) {
            newGame.choose=PickAPlayer.GIL;
            newGame.solveThis = true;
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_5) {
            newGame.choose=PickAPlayer.HUGO;
            newGame.solveThis = true;
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_6) {
            newGame.choose=PickAPlayer.JOANA;
            newGame.solveThis = true;
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_7) {
            newGame.choose=PickAPlayer.JOÃO;
            newGame.solveThis = true;
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_8) {
            newGame.choose=PickAPlayer.JÓNI;
            newGame.solveThis = true;
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_9) {
            newGame.choose=PickAPlayer.MIGUEL;
            newGame.solveThis = true;
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_0) {
            newGame.choose=PickAPlayer.NUNO;
            newGame.solveThis = true;
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_A) {
            newGame.choose=PickAPlayer.PEDRO;
            newGame.solveThis = true;
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_S) {
            newGame.choose = PickAPlayer.RUI;
            newGame.solveThis = true;
        }
    }
}