package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CodeCadets extends Person{
    private Picture picture;
    private Field field;

    public CodeCadets(Field field){

        this.field=field;
        picture = new Picture(Field.PADDING, Field.PADDING, "pikachu.png");
        picture.draw();
    }

    public void moveRight(){
        if(picture.getMaxX()>=field.getPicture().getWidth()){
            return;
        }
        picture.translate(10, 0);

    }
    public void moveLeft(){
        if(picture.getX()==field.getPicture().getX()){
            return;
        }
        picture.translate(-10, 0);
    }
    public void moveUp(){
        if(picture.getY()==field.getPicture().getY()){
            return;
        }
        picture.translate(0, -10);

    }
    public void moveDown() {
        if (picture.getMaxY() >= field.getPicture().getHeight()) {
            return;
        }
        picture.translate(0, 10);
    }
}
