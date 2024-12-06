package model.bean;

public enum Resolution {
    HD_720P("1280x720"),
    FULL_HD_1080P("1920x1080"),
    QUAD_HD_1440P("2560x1440"),
    ULTRA_HD_4K("3840x2160"),
    ULTRA_HD_8K("7680x4320");

    private final String resolution;

    // Constructor to initialize the resolution
    Resolution(String resolution) {
        this.resolution = resolution;
    }

    // Getter method to retrieve the resolution as a string
    public String getResolution() {
        return resolution;
    }

    // Optional: Override toString to return a more user-friendly representation
    @Override
    public String toString() {
        return this.name() + " (" + resolution + ")";
    }
}
