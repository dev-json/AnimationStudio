package de.jxson.animationstudio.impl;

import de.jxson.animationstudio.api.AnimationAPI;
import de.jxson.animationstudio.api.AnimationAPILocal;
import de.jxson.animationstudio.api.camera.builder.CameraBuilder;
import de.jxson.animationstudio.api.cutscene.builder.CutsceneBuilder;
import de.jxson.animationstudio.api.path.builder.CameraPathBuilder;

public class AnimationAPICaller implements AnimationAPILocal {

    public AnimationAPICaller()
    {
        new AnimationAPI(this);
    }

    public void onShutdown()
    {

    }

    @Override
    public CutsceneBuilder createCutscene(String id) {
        return null;
    }

    @Override
    public CameraBuilder createCamera(String id) {
        return null;
    }

    @Override
    public CameraPathBuilder createCameraPath() {
        return null;
    }
}
