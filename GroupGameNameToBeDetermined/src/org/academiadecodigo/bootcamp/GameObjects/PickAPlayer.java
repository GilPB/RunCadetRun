package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum PickAPlayer {
    GIL(Gil.JPG, "estava um gajo no comboio todo maluco"),
    FRED(fred2.JPG, "fds só cheguei a casa à uma");
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
    ANTÓNIO(),
    JOHNNYSINS();*/

    private String catchPhrase;
    private Picture photos;

    PickAPlayer(Picture photos, String phrase){
        this.photos=photos;
        catchPhrase=phrase;
    }
}
