package org.academiadecodigo.bootcamp.GameEnvironment;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field {
    private Picture picture;
    public static final int PADDING = 10;


    public Field(){
        picture = new Picture(PADDING,PADDING, "a3wMrK7_460s.jpg");
        picture.draw();
    }

    public Picture getPicture() {
        return picture;
    }
}
