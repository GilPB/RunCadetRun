package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameEnvironment.Position;
import org.academiadecodigo.bootcamp.GameObjects.CodeCadets;
import org.academiadecodigo.bootcamp.GameObjects.Controller;
import org.academiadecodigo.bootcamp.GameObjects.Mcs;
import org.academiadecodigo.bootcamp.GameObjects.PickAPlayer;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Position pos = new Position();
        Mcs mc = new Mcs(field, pos, PickAPlayer.FRED);
        CodeCadets pika = new CodeCadets(field, pos, PickAPlayer.JOHNNYSINS);
        Controller controller= new Controller(field, pika);
        controller.init();
    }
}
