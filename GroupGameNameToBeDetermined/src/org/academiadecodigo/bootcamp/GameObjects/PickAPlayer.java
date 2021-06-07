package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum PickAPlayer {
    GIL("Gil.JPG", "estava um gajo no comboio todo maluco"),
    FRED("fred2.JPG", "fds só cheguei a casa à uma"),
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
    ANTÓNIO(),*/
    JOHNNYSINS("images.jpeg", "Did someone order a Pizza??");

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
