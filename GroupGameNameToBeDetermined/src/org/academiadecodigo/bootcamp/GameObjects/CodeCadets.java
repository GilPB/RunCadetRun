package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameEnvironment.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CodeCadets extends Person{


    public CodeCadets(Field field, Position pos, PickAPlayer player){
        super(field, pos, player);
    }

    public void moveRight(){
        if(getPic().getMaxX()>=getField().getPicture().getWidth()){
            return;
        }
        getPic().translate(30, 0);

    }
    public void moveLeft(){
        if(getPic().getX()==getField().getPicture().getX()){
            return;
        }
        getPic().translate(-30, 0);
    }
    public void moveUp(){
        if(getPic().getY()==getField().getPicture().getY()){
            return;
        }
        getPic().translate(0, -30);

    }
    public void moveDown() {
        if (getPic().getMaxY() >= getField().getPicture().getHeight()) {
            return;
        }
        getPic().translate(0, 30);
    }
}
