package de.jxson.animationstudio.api.path.builder;

import de.jxson.animationstudio.api.path.CameraPath;
import org.bukkit.Location;

public interface CameraPathBuilder {

    CameraPathBuilder setDuration(int seconds);
    CameraPathBuilder setLocation(Location location);

    CameraPath build();

}
