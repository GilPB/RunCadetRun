package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameEnvironment.Position;

public class Mcs extends Person{

    public Mcs(Field field, Position pos, PickAPlayer player){
        super(field,pos,player);
    }

    public void move(CodeCadets player){
        int nextMove;
        int colDiff = Math.abs(getPos().getCol()-player.getPos().getCol());
        int rowDiff = Math.abs(getPos().getRow()-player.getPos().getRow());
        int colDir = getPos().getCol()-player.getPos().getCol();
        int rowDir = getPos().getRow()-player.getPos().getRow();
        if(colDiff > rowDiff){
            if(colDir < 0 ){
                nextMove = 3;
            } else {
                nextMove = 1;
            }
        } else if(colDiff==rowDiff){
            if(colDir < 0){
                nextMove = (int) (Math.random()*2);
            } else {
                nextMove = (int) ((Math.random()*2)+2);
            }
        } else {
            if(rowDir < 0){
                nextMove = 2;
            } else {
                nextMove = 0;
            }
        }

        switch(nextMove) {
            case 0:
                moveUp();
                break;
            case 1:
                moveLeft();
                break;
            case 2:
                moveDown();
                break;
            case 3:
                moveRight();
                break;
        }
    }

    public void moveRandom(CodeCadets player){
        int nextMove;
        int colDiff = Math.abs(getPos().getCol()-player.getPos().getCol());
        int rowDiff = Math.abs(getPos().getRow()-player.getPos().getRow());
        int colDir = getPos().getCol()-player.getPos().getCol();
        int rowDir = getPos().getRow()-player.getPos().getRow();
        if(colDiff > rowDiff){
            if(colDir < 0 ){
                nextMove = 3;
            } else {
                nextMove = 1;
            }
        } else if(colDiff==rowDiff){
            if(colDir < 0){
                nextMove = (int) ((Math.random()*2)+2);
            } else {
                nextMove = (int) (Math.random()*2);
            }
        } else {
            if(rowDir < 0){
                nextMove = 2;
            } else {
                nextMove = 0;
            }
        }

        if(Math.random() < 0.5){
            nextMove = (int) (Math.random()*4);
        }

        switch(nextMove) {
            case 0:
                moveDown();
                break;
            case 1:
                moveLeft();
                break;
            case 2:
                moveUp();
                break;
            case 3:
                moveRight();
                break;
        }
    }
}
