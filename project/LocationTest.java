// javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" LocationTest.java
// java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore LocationTest

import org.junit.Test;
import static org.junit.Assert.*;

public class LocationTest {

    @Test
    public void testGetLatitude_1() {
        Location location = new Location(40.0, -74.0);
        assertEquals(40.0, location.getLatitude(), 0.0001);
    }

    @Test
    public void testGetLatitude_2() {
        Location location = new Location(-33.0, 151.0);
        assertEquals(-33.0, location.getLatitude(), 0.0001);
    }

    @Test
    public void testGetLatitude_3() {
        Location location = new Location(0.0, 0.0);
        assertEquals(0.0, location.getLatitude(), 0.0001);
    }

    @Test
    public void testGetLatitude_4() {
        Location location = new Location(90.0, -180.0);
        assertEquals(90.0, location.getLatitude(), 0.0001);
    }

    @Test
    public void testSetLatitude_1() {
        Location location = new Location(40.0, -74.0);
        location.setLatitude(35.0);
        assertEquals(35.0, location.getLatitude(), 0.0001);
    }

    @Test
    public void testSetLatitude_2() {
        Location location = new Location(-33.0, 151.0);
        location.setLatitude(-35.0);
        assertEquals(-35.0, location.getLatitude(), 0.0001);
    }

    @Test
    public void testSetLatitude_3() {
        Location location = new Location(0.0, 0.0);
        location.setLatitude(10.0);
        assertEquals(10.0, location.getLatitude(), 0.0001);
    }

    @Test
    public void testSetLatitude_4() {
        Location location = new Location(90.0, -180.0);
        location.setLatitude(-90.0);
        assertEquals(-90.0, location.getLatitude(), 0.0001);
    }

    @Test
    public void testGetLongitude_1() {
        Location location = new Location(40.0, -74.0);
        assertEquals(-74.0, location.getLongitude(), 0.0001);
    }

    @Test
    public void testGetLongitude_2() {
        Location location = new Location(-33.0, 151.0);
        assertEquals(151.0, location.getLongitude(), 0.0001);
    }

    @Test
    public void testGetLongitude_3() {
        Location location = new Location(0.0, 0.0);
        assertEquals(0.0, location.getLongitude(), 0.0001);
    }

    @Test
    public void testGetLongitude_4() {
        Location location = new Location(90.0, -180.0);
        assertEquals(-180.0, location.getLongitude(), 0.0001);
    }

    @Test
    public void testSetLongitude_1() {
        Location location = new Location(40.0, -74.0);
        location.setLongitude(-70.0);
        assertEquals(-70.0, location.getLongitude(), 0.0001);
    }

    @Test
    public void testSetLongitude_2() {
        Location location = new Location(-33.0, 151.0);
        location.setLongitude(152.0);
        assertEquals(152.0, location.getLongitude(), 0.0001);
    }

    @Test
    public void testSetLongitude_3() {
        Location location = new Location(0.0, 0.0);
        location.setLongitude(-10.0);
        assertEquals(-10.0, location.getLongitude(), 0.0001);
    }

    @Test
    public void testSetLongitude_4() {
        Location location = new Location(90.0, -180.0);
        location.setLongitude(180.0);
        assertEquals(180.0, location.getLongitude(), 0.0001);
    }

    @Test
    public void testToString_1() {
        Location location = new Location(40.0, -74.0);
        assertEquals("(40.0, -74.0)", location.toString());
    }

    @Test
    public void testToString_2() {
        Location location = new Location(-33.0, 151.0);
        assertEquals("(-33.0, 151.0)", location.toString());
    }

    @Test
    public void testToString_3() {
        Location location = new Location(0.0, 0.0);
        assertEquals("(0.0, 0.0)", location.toString());
    }

    @Test
    public void testToString_4() {
        Location location = new Location(90.0, -180.0);
        assertEquals("(90.0, -180.0)", location.toString());
    }
}
// End of file
