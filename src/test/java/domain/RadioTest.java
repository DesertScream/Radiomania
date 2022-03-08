package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
//    public void test() {
//        Radio rad = new Radio();
//        rad.setCurrentStation(-1);
//        int expected = 0;
//        int actual = rad.getCurrentStation();
//        assertEquals(expected, actual);
//    }
    public void testNextCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        int expected = 0;
        int actual = rad.nextCurrentStation();
        assertEquals(expected, actual);
    }
}
