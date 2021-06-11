package org.academiadecodigo.bootcamp.GameObjects;

public enum Objectives {
    DUCK("rubberduck.png", 200),
    MONKEY("monkey.png", 300),
    BEAR("bear.png", 500),
    RAGNAR("ragnar.png", 1000),
    UNICORN("unicorn.png",1500),
    BABYYODA("babyyoda.png", 3000),
    FINALPRIZE("grad.png", 50000);

    private int points;
    private String pic;

    Objectives(String pic, int points){
        this.points=points;
        this.pic=pic;
    }

    public int getPoints(){
        return points;
    }

    public String getPic(){
        return pic;
    }
}
