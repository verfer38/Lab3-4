package model;

public class Location {
    private String alias;
    private String description;
    private LocationType type;
    double latitude;
    double longitude;

    public Location(String alias, String description, LocationType type, double latitude, double longitude) {
        this.alias = alias;
        this.description = description;
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public String toString() {
        return alias + " (" + description + ") " + "на широте " + latitude + " на долготе " + longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return alias.equals(location.alias) &&
               type == location.type;
    }


    @Override
    public int hashCode() {
        return 31 * alias.hashCode() + type.hashCode();
    }

    public enum LocationType {
        PALACE, FOREST, FIELD, SWAMP
    }
}