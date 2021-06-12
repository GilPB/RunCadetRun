package org.academiadecodigo.bootcamp.GameEnvironment;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field {
    private Picture picture;
    public static final int PADDING = 10;
    public static final int CELL_SIZE = 50;
    private int width;
    private int height;


    public Field() {
        picture = new Picture(PADDING, PADDING, "ac_logo.png");
        width = PADDING + picture.getWidth();
        height = PADDING + picture.getHeight();
        System.out.println(xToCol(width));
        System.out.println(yToRow(height));
    }

    public void drawField(){
        picture.draw();
    }

    public Picture getPicture() {
        return picture;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int colToX(int col){
        return PADDING + (col * CELL_SIZE);
    }

    public int rowToY(int row){
        return PADDING + (row * CELL_SIZE);
    }

    public int yToRow(int y){
        return y / (CELL_SIZE + PADDING);
    }

    public int xToCol(int x){
        return x / (CELL_SIZE + PADDING);
    }
}
