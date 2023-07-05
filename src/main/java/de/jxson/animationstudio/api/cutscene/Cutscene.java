package de.jxson.animationstudio.api.cutscene;

import de.jxson.animationstudio.api.camera.Camera;

public interface Cutscene {

    String getId();

    Camera getCamera();

    void save();
    void play();
    void stop();

}
