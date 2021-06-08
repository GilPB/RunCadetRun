package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameEnvironment.Position;
import org.academiadecodigo.bootcamp.GameObjects.*;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Position playerPos = new Position((field.xToCol(field.getWidth()+Field.PADDING)/2), (field.yToRow(field.getHeight()+Field.PADDING)/2), field);
        Mcs mc = new Mcs(field, new Position(field), PickAPlayer.FRED);
        CodeCadets pika = new CodeCadets(field, playerPos, PickAPlayer.GIL);
        Points grad= new Points(field, new Position(field), Objectives.FINALPRIZE);
        Controller controller= new Controller(field, pika);
        controller.init();
    }
}
