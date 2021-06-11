package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameEnvironment.Position;
import org.academiadecodigo.bootcamp.GameObjects.*;

public class Game {

    private int score;
    private int delay = 300;
    private PickAPlayer playerOne;
    private ObjectivesFactory objectivesFactory;
    private Points[] pointsObj = new Points[5];
    private Field field;
    private boolean playerWins = false;

    public Game(PickAPlayer player){
        this.playerOne=player;
        field = new Field();
        objectivesFactory = new ObjectivesFactory(field);
    }



    public void start(){

        //Position playerPos = new Position((field.xToCol(field.getWidth())/2), (field.yToRow(field.getHeight()/2)), field);
        Position playerPos = new Position(8,8,field);
        Mcs mc = new Mcs(field, new Position(field), PickAPlayer.RAQUEL);
        CodeCadets player = new CodeCadets(field, playerPos, playerOne);
        Controller controller= new Controller(player);
        controller.init();
        spawnObj();
        boolean highScoreReached = false;
        Points winCon = null;
        Mcs mc2 = null;
        Mcs mc3 = null;


        while (!player.isDead() && !playerWins){
            System.out.println(player.getLifeNumber());
            if(player.getPos().getCol() == mc.getPos().getCol() && player.getPos().getRow() == mc.getPos().getRow()){
                player.gotCaught();
            }
            if(mc2!=null){
                mc2.move();
                if(player.getPos().getCol() == mc2.getPos().getCol() && player.getPos().getRow() == mc2.getPos().getRow()){
                    player.gotCaught();
                }
            }
            if(mc3!=null){
                mc3.move();
                if(player.getPos().getCol() == mc3.getPos().getCol() && player.getPos().getRow() == mc3.getPos().getRow()){
                    player.gotCaught();
                }
            }

            if(score>= 5000 && mc2 == null){
                mc2 = new Mcs(field, new Position(field), PickAPlayer.CHRISTINA);
                delay = 250;
            }

            if(score>= 15000 && mc3 == null){
                mc3 = new Mcs(field, new Position(field), PickAPlayer.CATARINA);
                delay = 150;
            }

            if(score >= 25000 && pointsObj[0]!= null){
                highScoreReached=true;
                for (int i = 0; i< pointsObj.length;i++){
                    pointsObj[i].collect();
                }
            }
            if(highScoreReached && pointsObj[0] != null) {
                pointsObj[0]=null;
                winCon = new Points(field, Objectives.FINALPRIZE);

            } else if (highScoreReached){
                if (player.getPos().getRow() == winCon.getPos().getRow() && player.getPos().getCol() == winCon.getPos().getCol()) {
                    winCon.collect();
                    playerWins=true;
                }
            }
            if(pointsObj[0]!=null) {
                for (int p = 0; p < pointsObj.length; p++) {
                    if (player.getPos().getRow() == pointsObj[p].getPos().getRow() && player.getPos().getCol() == pointsObj[p].getPos().getCol()) {
                        score += pointsObj[p].collect();
                        pointsObj[p] = objectivesFactory.spawnObjectives();
                        System.out.println(score);
                    }
                }
            }
            try {
                Thread.sleep(delay);
            } catch (InterruptedException c){
                break;
            }
            mc.move();


        }
    }

    public void spawnObj(){
         for(int i = 0; i< pointsObj.length; i++){
             pointsObj[i] = objectivesFactory.spawnObjectives();
         }
    }
}
