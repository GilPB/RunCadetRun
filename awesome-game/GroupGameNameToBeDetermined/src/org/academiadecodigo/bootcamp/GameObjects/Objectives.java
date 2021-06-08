package org.academiadecodigo.bootcamp.GameObjects;

public enum Objectives {
    DUCK("", 200),
    MONKEY("", 300),
    RAGNAR("", 500),
    UNICORN("",1000),
    BIGDUCK("", 1500),
    BABYYODA("", 3000),
    FINALPRIZE("graduate.png", 5000);

    private int points;
    private String pic;

    private Objectives(String pic, int points){
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
