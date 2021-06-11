package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum PickAPlayer {
    RAQUEL("raquel.png"),
    CHRISTINA("chris.png"),
    GIL("gil.png"),
    FRED("fred.png"),
    HUGO("hugo.png"),
    RUI("rui.png"),
    NUNO("nuno.png"),
    JOANA("joana.png"),
    PEDRO("pedro.png"),
    MIGUEL("miguel.png"),
    CARLA("carla.png"),
    ALBERTO("alberto.png"),
    JOÃO("joao.png"),
    JÓNI("joni.png"),
    CATARINA("catarina.png");

    private String photos;

    PickAPlayer(String photos){
        this.photos = photos;
    }

    public String getPhotos(){
        return photos;
    }
}
