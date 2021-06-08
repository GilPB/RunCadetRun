package org.academiadecodigo.bootcamp.GameEnvironment;

public class Position {

    private Field field;
    private int col;
    private int row;

    public Position(Field field){
        this.field=field;
        col = (int) Math.floor(Math.random() * field.xToCol(field.getWidth()));
        row = (int) Math.floor(Math.random() * field.yToRow(field.getHeight()));
        System.out.println(col);
        System.out.println(row);
    }

    public Position(int col, int row, Field field) {
        this.field=field;
        this.row = row;
        this.col = col;
    }

    public int getCol(){
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
