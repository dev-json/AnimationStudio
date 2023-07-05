package de.jxson.animationstudio.api.cutscene.builder;

import de.jxson.animationstudio.api.camera.Camera;
import de.jxson.animationstudio.api.cutscene.Cutscene;

public interface CutsceneBuilder {

    CutsceneBuilder setCutsceneId(String id);
    CutsceneBuilder setCamera(Camera camera);

    Cutscene build();

}
