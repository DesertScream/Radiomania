package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void exceedingTheMinimumStationValue() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(14);
        int expected = 14;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
//    @Test
//    void theZeroStationValue() {
//        Radio radio = new Radio();
//        radio.setCurrentStation(0);
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//    @Test
//    void theOneStationValue() {
//        Radio radio = new Radio();
//        radio.setCurrentStation(1);
//        int expected = 1;
//        int actual = radio.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//    @Test
//    void the8StationValue() {
//        Radio radio = new Radio();
//        radio.setCurrentStation(8);
//        int expected = 8;
//        int actual = radio.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//    @Test
//    void the9StationValue() {
//        Radio radio = new Radio();
//        radio.setCurrentStation(9);
//        int expected = 9;
//        int actual = radio.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//    @Test
//    void the10StationValue() {
//        Radio radio = new Radio();
//        radio.setCurrentStation(10);
//        int expected = radio.getCurrentStation();
//        int actual = radio.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//    @Test
//    public void nextMaxStation() {
//        Radio radio = new Radio();
//
//        radio.setToMaxStation();
//        radio.nextStation();
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        assertEquals(expected, actual);
//    }
//
    @Test
    public void nextMidMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
//
//    @Test
//    public void prevMinStation() {
//        Radio radio = new Radio();
//
//        radio.setToMinStation();
//        radio.prevStation();
//
//        int expected = 9;
//        int actual = radio.getCurrentStation();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void prevMinMidStation() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(9);
//        radio.prevStation();
//
//        int expected = 8;
//        int actual = radio.getCurrentStation();
//
//        assertEquals(expected, actual);
//    }
//
//
//    @Test
//    void negativeVolumeLimitValue() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(-1);
//        int expected = radio.currentVolume;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//    }
//    @Test
//    void volumeLimitValueZero() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(0);
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//    }
//    @Test
//    void volumeLimitValue1() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(1);
//        int expected = 1;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//    }
//    @Test
//    void volumeLimitValue9() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(9);
//        int expected = 9;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//    }
//    @Test
//    void volumeLimitValueNine() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(10);
//        int expected = 10;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//    }
//    @Test
//    void volumeLimitValueNegativeEleven() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(11);
//        int expected = radio.currentVolume;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void nextMidVolume() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(9);
//        radio.increaseVolume();
//
//        int expected = 10;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void nextMaxVolume() {
//        Radio radio = new Radio();
//
//        radio.setToMaxVolume();
//        radio.increaseVolume();
//
//        int expected = radio.currentVolume;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void nextMinVolume() {
//        Radio radio = new Radio();
//
//        radio.setToMinVolume();
//        radio.decreaseVolume();
//
//        int expected = radio.currentVolume;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//    @Test
//    public void nextMinMidVolume() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(5);
//        radio.decreaseVolume();
//
//        int expected = radio.currentVolume;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }





}
