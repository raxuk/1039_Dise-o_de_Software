package enums;

public enum Mount {
    HORSE("Horse"),
    DRAGON("Dragón"),
    NOMOUNT("Sin montura");

    private final String mountType;

    Mount(final String mountType) {
        this.mountType = mountType;
    }

    @Override
    public String toString() {
        return mountType;
    }
}