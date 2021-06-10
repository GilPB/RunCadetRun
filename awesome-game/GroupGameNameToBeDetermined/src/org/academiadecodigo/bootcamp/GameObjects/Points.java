package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameEnvironment.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Points {

    private String picName;
    private Objectives pick;
    private Position pos;
    private Picture pic;
    private Field field;
    private boolean collected;

    public Points(Field field, Position pos, Objectives pick){
        this.pick=pick;
        picName = pick.getPic();
        this.field = field;
        this.pos = pos;
        pic = new Picture(field.colToX(pos.getCol()), field.rowToY(pos.getRow()), picName);
        pic.draw();
    }

    public boolean isCollected() {
        return collected;
    }

    public Position getPos() {
        return pos;
    }

    public int collect(){
        collected=true;
        pic.delete();
        pos=null;
        return pick.getPoints();
    }
}
