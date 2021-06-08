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

    public void moveRight(){
        if((getPic().getX()+getPic().getWidth())>=getField().getPicture().getWidth()){
            return;
        }
        getPic().translate(Field.CELL_SIZE, 0);

    }
    public void moveLeft(){
        if(getPic().getX()==getField().getPicture().getX()){
            return;
        }
        getPic().translate(-(Field.CELL_SIZE), 0);
    }
    public void moveUp(){
        if(getPic().getY()==getField().getPicture().getY()){
            return;
        }
        getPic().translate(0, -(Field.CELL_SIZE));

    }
    public void moveDown() {
        if (getPic().getMaxY() >= getField().getPicture().getHeight()) {
            return;
        }
        getPic().translate(0, Field.CELL_SIZE);
    }

    public void gotCaught(){
        lifeNumber--;
    }
}
