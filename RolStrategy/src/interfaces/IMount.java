package interfaces;

import enums.MountType;

public interface IMount {
    MountType getType();
    String getName();
    float getSpeed();
    float travelDuration(float distance);
}
