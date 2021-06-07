package org.academiadecodigo.bootcamp.GameEnvironment;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field {
    private Picture picture;
    public static final int PADDING = 10;
    public static final int CELL_SIZE = 30;
    private int col;
    private int row;


    public Field(){
        picture = new Picture(PADDING,PADDING, "ac_logo.png");
        picture.draw();
    }

    public Picture getPicture() {
        return picture;
    }

    public int getCol(){
        return col;
    }

    public int getRow() {
        return row;
    }

    public int colToX(int col){
        return PADDING + (col * CELL_SIZE);
    }

    public int rowToY(int row){
        return PADDING + (row * CELL_SIZE);
    }
}
