package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameEnvironment.Field;

public class ObjectivesFactory {

    private Field field;

    public ObjectivesFactory(Field field){
        this.field=field;
    }

    public Points spawnObjectives(){
        Points newObjectives;

        switch((int) (Math.random()*(Objectives.values().length-1))){
            case 0:
                newObjectives = new Points(field, Objectives.DUCK);
                break;
            case 1:
                newObjectives = new Points(field, Objectives.RAGNAR);
                break;
            case 2:
                newObjectives = new Points(field, Objectives.MONKEY);
                break;
            case 3:
                newObjectives = new Points(field, Objectives.BEAR);
                break;
            case 4:
                newObjectives = new Points(field, Objectives.BABYYODA);
                break;
            case 5:
                newObjectives = new Points(field, Objectives.UNICORN);
                break;
            default:
                newObjectives = new Points(field, Objectives.DUCK);
        }
        return newObjectives;
    }
}
