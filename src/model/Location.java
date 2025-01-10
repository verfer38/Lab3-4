package model;

public class Location {
    private String name;
    private String description;
    private LocationType type;

    public Location(String name, String description, LocationType type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + description + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return name.equals(location.name) && 
               type == location.type;
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + type.hashCode();
    }

    public enum LocationType {
        PALACE, FOREST, FIELD, SWAMP
    }
}