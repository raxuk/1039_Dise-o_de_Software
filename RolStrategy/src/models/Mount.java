package models;

import enums.MountType;
import interfaces.IMount;

public class Mount implements IMount {
    private MountType type;
    private String name;
    private float speed;

    public Mount(MountType type, String name, float speed) {
        this.type = type;
        this.name = name;
        this.speed = speed;
    }

    @Override
    public MountType getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float travelDuration(float distance) {
        return 0;
    }
}
