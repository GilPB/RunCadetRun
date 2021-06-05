package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameObjects.CodeCadets;
import org.academiadecodigo.bootcamp.GameObjects.Controller;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        CodeCadets pika = new CodeCadets(field);
        Controller controller= new Controller(field, pika);
        controller.init();
    }
}
