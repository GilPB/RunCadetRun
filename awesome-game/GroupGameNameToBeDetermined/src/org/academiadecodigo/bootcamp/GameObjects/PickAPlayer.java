package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum PickAPlayer {
    GIL("Gil.JPG", ""),
    FRED("fred2.JPG", "");
    /*
    HUGO();
    RUI(),
    NUNO(),
    JOANA(),
    PEDRO(),
    MIGUEL(),
    CARLA(),
    ALBERTO(),
    JOÃO(),
    JÓNI(),
    CHRISTINA(),
    RAQUEL(),
    CATARINA(),
    ANTÓNIO();*/


    private String catchPhrase;
    private String photos;

    PickAPlayer(String photos, String phrase){
        this.photos = photos;
        catchPhrase=phrase;
    }

    public String getPhotos(){
        return photos;
    }
}
