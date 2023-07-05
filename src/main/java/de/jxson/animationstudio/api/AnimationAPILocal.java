package de.jxson.animationstudio.api;

import de.jxson.animationstudio.api.camera.builder.CameraBuilder;
import de.jxson.animationstudio.api.cutscene.Cutscene;
import de.jxson.animationstudio.api.cutscene.builder.CutsceneBuilder;
import de.jxson.animationstudio.api.path.builder.CameraPathBuilder;

public interface AnimationAPILocal {

    CutsceneBuilder createCutscene(String id);
    CameraBuilder createCamera(String id);
    CameraPathBuilder createCameraPath();

}
