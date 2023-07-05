package de.jxson.animationstudio;

import de.jxson.animationstudio.api.AnimationAPI;
import de.jxson.animationstudio.api.camera.Camera;
import de.jxson.animationstudio.api.cutscene.Cutscene;
import de.jxson.animationstudio.api.path.CameraPath;
import de.jxson.animationstudio.impl.AnimationAPICaller;
import org.bukkit.plugin.java.JavaPlugin;

public class AnimationStudio extends JavaPlugin {

    private static AnimationStudio instance;
    private AnimationAPICaller animationAPICaller;

    @Override
    public void onEnable() {
        AnimationStudio.instance = this;
        this.animationAPICaller = new AnimationAPICaller();

        /* This is a test camera */

        CameraPath path1 = AnimationAPI.createCameraPath().setLocation(null).setDuration(3).build();
        CameraPath path2 = AnimationAPI.createCameraPath().setLocation(null).setDuration(3).build();
        CameraPath path3 = AnimationAPI.createCameraPath().setLocation(null).setDuration(3).build();
        CameraPath path4 = AnimationAPI.createCameraPath().setLocation(null).setDuration(3).build();
        CameraPath path5 = AnimationAPI.createCameraPath().setLocation(null).setDuration(3).build();

        Camera camera = AnimationAPI.createCamera("EXAMPLE_CAMERA")
                .addCameraPath(path1)
                .addCameraPath(path2)
                .addCameraPath(path3)
                .addCameraPath(path4)
                .addCameraPath(path5)
                .build();

        Cutscene cutscene = AnimationAPI.createCutscene("EXAMPLE_CUTSCENE").setCamera(camera).build();

    }

    @Override
    public void onDisable() {
        this.animationAPICaller.onShutdown();
    }
}
