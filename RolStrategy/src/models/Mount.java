package models;

import interfaces.IMount;

public class Mount implements IMount {
    enums.Mount type;
    String name;
    String speed;

    @Override
    public enums.Mount getType() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public float getSpeed() {
        return 0;
    }

    @Override
    public float travelDuration(float distance) {
        return 0;
    }
}
