package interfaces;

import enums.Mount;

public interface IMount {
    Mount getType();
    String getName();
    float getSpeed();
    float travelDuration(float distance);
}
