package enums;

public enum MountType {
    HORSE("Horse"),
    DRAGON("Dragón"),
    NOMOUNT("Sin montura");

    private final String mountType;

    MountType(final String mountType) {
        this.mountType = mountType;
    }

    @Override
    public String toString() {
        return mountType;
    }
}