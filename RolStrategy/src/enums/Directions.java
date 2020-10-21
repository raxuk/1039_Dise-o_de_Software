package enums;

public enum Directions {
    NORTH("Norte"),
    SOUTH("Sur"),
    EAST("Este"),
    WEST("Oeste");

    private final String direction;

    Directions(final String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return direction;
    }
}