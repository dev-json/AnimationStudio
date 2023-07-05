package de.jxson.animationstudio.api.path;

import org.bukkit.Location;

public interface CameraPath {

    CameraPath getPreviousPath();
    CameraPath getNextPath();
    int getDuration();
    Location getLocation();

}
