// Location.java
/**
 * Represents a Location in the food delivery system.
 */

class Location {
    private double latitude; // The latitude coordinate.
    private double longitude; // The longitude coordinate.

    /**
     * Constructs a Location object with latitude and longitude coordinates.
     * @param latitude The latitude coordinate.
     * @param longitude The longitude coordinate.
     */
    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Gets the latitude coordinate.
     * @return The latitude coordinate.
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Gets the longitude coordinate.
     * @return The longitude coordinate.
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the latitude coordinate.
     * @param latitude The latitude coordinate.
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Sets the longitude coordinate.
     * @param longitude The longitude coordinate.
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Formats the location information into a string.
     * @return The formatted string representing the location information.
     */
    @Override
    public String toString() {
        return "(" + latitude + ", " + longitude + ")";
    }
}
// End of file
