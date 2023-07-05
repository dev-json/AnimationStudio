package de.jxson.animationstudio.api.camera.builder;

import de.jxson.animationstudio.api.camera.Camera;
import de.jxson.animationstudio.api.path.CameraPath;

public interface CameraBuilder {

    CameraBuilder setCameraId(String id);

    CameraBuilder addCameraPath(CameraPath cameraPath);

    CameraBuilder addCameraPath(CameraPath cameraPath, int index);

    Camera build();

}
