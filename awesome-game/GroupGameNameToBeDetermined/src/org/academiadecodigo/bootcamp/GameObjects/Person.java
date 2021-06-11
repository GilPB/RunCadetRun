package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameEnvironment.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Person {

    private PickAPlayer player;
    private Field field;
    private Position pos;
    private Picture pic;


    public Person(Field field, Position pos, PickAPlayer player){
        this.field=field;
        this.player = player;
        this.pos = pos;
        pic = new Picture(field.colToX(pos.getCol()), field.rowToY(pos.getRow()), player.getPhotos());
        pic.draw();
    }

    public Picture getPic() {
        return pic;
    }
    public Position getPos() {
        return pos;
    }

    public void moveRight(){
        if((pic.getX()+pic.getWidth())>=field.getPicture().getWidth()){
            return;
        }
        pic.translate(Field.CELL_SIZE, 0);
        pos.setCol(getPos().getCol() + 1);
    }
    public void moveLeft(){
        if(getPic().getX()==field.getPicture().getX()){
            return;
        }
        getPic().translate(-(Field.CELL_SIZE), 0);
        getPos().setCol(getPos().getCol()-1);
    }
    public void moveUp(){
        if(getPic().getY()==field.getPicture().getY()){
            return;
        }
        getPic().translate(0, -(Field.CELL_SIZE));
        getPos().setRow(getPos().getRow()-1);

    }
    public void moveDown() {
        if (getPic().getMaxY() >= field.getPicture().getHeight()) {
            return;
        }
        getPic().translate(0, Field.CELL_SIZE);
        getPos().setRow(getPos().getRow()+1);
    }
}
