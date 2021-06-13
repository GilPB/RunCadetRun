package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameEnvironment.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CodeCadets extends Person{

    private int lifeNumber;

    public CodeCadets(Field field, Position pos, PickAPlayer player){
        super(field, pos, player);
        lifeNumber = 3;
    }

    public boolean isDead(){
        return lifeNumber == 0;
    }

    public void gotCaught(){
        lifeNumber--;
    }
}
