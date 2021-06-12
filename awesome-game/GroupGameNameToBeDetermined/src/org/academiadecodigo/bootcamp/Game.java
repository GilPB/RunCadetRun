package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.bootcamp.GameEnvironment.Position;
import org.academiadecodigo.bootcamp.GameObjects.*;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private Integer score = 0;
    private int delay = 300;
    private PickAPlayer playerOne;
    private ObjectivesFactory objectivesFactory;
    private Points[] pointsObj = new Points[5];
    private Field field;
    private boolean playerWins = false;
    private Picture menu;
    private Picture instructions;
    private Picture chooseAPlayer;
    private MainMenuController controller1 = new MainMenuController(this);
    private MainMenuController2 controller2;
    private ChooseAPlayerController controller3;
    public PickAPlayer choose;
    public boolean solveThis = false;

    public Game(Field field){
        this.field = field;
        objectivesFactory = new ObjectivesFactory(field);
        menu = new Picture(Field.PADDING,Field.PADDING, "runcadetrun.png");
        instructions= new Picture(Field.PADDING,Field.PADDING,"instructions.png");
        chooseAPlayer= new Picture(Field.PADDING,Field.PADDING,"chooseplayer.png");
        menu.draw();
        controller1.init();
    }

    public void getInstructions(){
        controller1 = null;
        instructions.draw();
        controller2=new MainMenuController2(this);
        controller2.init();

    }

    public void chooseAPlayerMenu(){
        controller2 = null;
        chooseAPlayer.draw();
        controller3=new ChooseAPlayerController(this);
        controller3.init();
    }

    public void start(PickAPlayer player){
        Picture live1 = new Picture(Field.PADDING, field.getHeight()+10, "lives.png");
        Picture live2 = new Picture(live1.getMaxX() + 10, field.getHeight()+10, "lives.png");
        Picture live3 = new Picture(live2.getMaxX() + 10, field.getHeight()+10, "lives.png");
        live1.draw();
        live2.draw();
        live3.draw();
        Text printScore;
        Picture[] lives= {live1, live2, live3};
        playerOne=player;
        field.drawField();
        Position playerPos = new Position(8,8,field);
        Mcs mc = new Mcs(field, new Position(field), PickAPlayer.RAQUEL);
        CodeCadets newPlayer = new CodeCadets(field, playerPos, playerOne);
        Controller controller= new Controller(newPlayer);
        controller.init();
        spawnObj();
        boolean highScoreReached = false;
        Points winCon = null;
        Mcs mc2 = null;
        Mcs mc3 = null;


        while (!newPlayer.isDead() && !playerWins){
            printScore = new Text(field.getWidth() -85, field.getHeight() +10, "Score: "+score.toString());
            printScore.draw();
            if(newPlayer.getPos().getCol() == mc.getPos().getCol() && newPlayer.getPos().getRow() == mc.getPos().getRow()){
                newPlayer.gotCaught();
                if(lives[2] != null){
                    lives[2].delete();
                    lives[2] = null;
                } else if (lives[1] != null){
                    lives[1].delete();
                    lives[1] = null;
                } else {
                    lives[0].delete();
                }
            }
            if(mc2!=null){
                mc2.move();
                if(newPlayer.getPos().getCol() == mc2.getPos().getCol() && newPlayer.getPos().getRow() == mc2.getPos().getRow()){
                    newPlayer.gotCaught();
                    if(lives[2] != null){
                        lives[2].delete();
                        lives[2] = null;
                    } else if (lives[1] != null){
                        lives[1].delete();
                        lives[1] = null;
                    } else {
                        lives[0].delete();
                    }
                }
            }
            if(mc3!=null){
                mc3.move();
                if(newPlayer.getPos().getCol() == mc3.getPos().getCol() && newPlayer.getPos().getRow() == mc3.getPos().getRow()){
                    newPlayer.gotCaught();
                    if(lives[2] != null){
                        lives[2].delete();
                        lives[2] = null;
                    } else if (lives[1] != null){
                        lives[1].delete();
                        lives[1] = null;
                    } else {
                        lives[0].delete();
                    }
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
                if (newPlayer.getPos().getRow() == winCon.getPos().getRow() && newPlayer.getPos().getCol() == winCon.getPos().getCol()) {
                    winCon.collect();
                    playerWins=true;
                }
            }
            if(pointsObj[0]!=null) {
                for (int p = 0; p < pointsObj.length; p++) {
                    if (newPlayer.getPos().getRow() == pointsObj[p].getPos().getRow() && newPlayer.getPos().getCol() == pointsObj[p].getPos().getCol()) {
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
            printScore.delete();


        }

        if(newPlayer.isDead()){
            Picture gameOver = new Picture(Field.PADDING, Field.PADDING, "gameover.png");
            gameOver.draw();
        } else {
            Picture winner = new Picture(Field.PADDING, Field.PADDING, "winner.png");
            winner.draw();
        }
    }

    public void spawnObj(){
         for(int i = 0; i< pointsObj.length; i++){
             pointsObj[i] = objectivesFactory.spawnObjectives();
         }
    }
}
