package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameEnvironment.Position;

public class Mcs extends Person{
    public Mcs(Field field, Position pos, PickAPlayer player){
        super(field,pos,player);
    }

    public void move(){
        switch((int) (Math.random()*4)) {
            case 0:
                moveUp();
                break;
            case 1:
                moveDown();
                break;
            case 2:
                moveLeft();
                break;
            case 3:
                moveRight();
                break;
        }
    }
}
