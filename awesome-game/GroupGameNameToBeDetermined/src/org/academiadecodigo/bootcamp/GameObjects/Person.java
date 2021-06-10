package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameEnvironment.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Person {

    private String picName;
    private PickAPlayer player;
    private Position pos;
    private Picture pic;
    private Field field;

    public Person(Field field, Position pos, PickAPlayer player){
        this.player = player;
        picName = player.getPhotos();
        this.field = field;
        this.pos = pos;
        pic = new Picture(field.colToX(pos.getCol()), field.rowToY(pos.getRow()), picName);
        pic.draw();
    }

    public Picture getPic() {
        return pic;
    }

    public Field getField() {
        return field;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public void moveRight(){
        if((getPic().getX()+getPic().getWidth())>=getField().getPicture().getWidth()){
            return;
        }
        getPic().translate(Field.CELL_SIZE, 0);
        getPos().setCol(getPos().getCol()+1);

    }
    public void moveLeft(){
        if(getPic().getX()==getField().getPicture().getX()){
            return;
        }
        getPic().translate(-(Field.CELL_SIZE), 0);
        getPos().setCol(getPos().getCol()-1);
    }
    public void moveUp(){
        if(getPic().getY()==getField().getPicture().getY()){
            return;
        }
        getPic().translate(0, -(Field.CELL_SIZE));
        getPos().setRow(getPos().getRow()-1);

    }
    public void moveDown() {
        if (getPic().getMaxY() >= getField().getPicture().getHeight()) {
            return;
        }
        getPic().translate(0, Field.CELL_SIZE);
        getPos().setRow(getPos().getRow()+1);
    }
}
