package de.jxson.animationstudio.api;

import de.jxson.animationstudio.api.camera.builder.CameraBuilder;
import de.jxson.animationstudio.api.cutscene.builder.CutsceneBuilder;
import de.jxson.animationstudio.api.path.builder.CameraPathBuilder;

public class AnimationAPI {

    private static AnimationAPILocal local;

    public AnimationAPI(AnimationAPILocal local)
    {
        AnimationAPI.local = local;
    }

    public static CutsceneBuilder createCutscene(String id)
    {
        return local.createCutscene(id);
    }

    public static CameraBuilder createCamera(String id)
    {
        return local.createCamera(id);
    }

    public static CameraPathBuilder createCameraPath()
    {
        return local.createCameraPath();
    }

}