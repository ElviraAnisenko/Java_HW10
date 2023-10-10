package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldAddRadioStationAndSwitchMax() {
        Radio radio = new Radio(11);
        radio.setRadioStation(10);
        radio.setNextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldRadioStationSwitchNearMaxLimit() {
        Radio radio = new Radio();
        radio.setRadioStation(8);
        radio.setNextRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioStationSwitchMin() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.setPrevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldAddRadioStationAndSwitchMin() {
        Radio radio = new Radio(11);
        radio.setRadioStation(0);
        radio.setPrevRadioStation();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioStationSwitchNearMinLimit() {
        Radio radio = new Radio();
        radio.setRadioStation(1);
        radio.setPrevRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioStationSwitchOverMaxLimit() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.setRadioStation(10);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldAddRadioStationAndSwitchOverMaxLimit() {
        Radio radio = new Radio(11);
        radio.setRadioStation(10);
        radio.setRadioStation(11);
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioStationSwitchOverMinLimit() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.setRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioStationSwitchWithinBorders() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        radio.setRadioStation(7);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddRadioStation() {
        Radio radio = new Radio(11);
        int expected = 11;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxRadioStation() {
        Radio radio = new Radio(11);
        int expected = 10;
        int actual = radio.getMaxRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseMinRadioStation() {
        Radio radio = new Radio(11);
        int expected = 0;
        int actual = radio.getMinRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeSwitchMax() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.setNextSoundVolume();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeSwitchNearMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(99);
        radio.setNextSoundVolume();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeSwitchMin() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.setPrevSoundVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldVolumeSwitchNearMinLimit() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(1);
        radio.setPrevSoundVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldInstallMinVolumeLimit() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getMinSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldInstallMaxVolumeLimit() {
        Radio radio = new Radio();
        int expected = 100;
        int actual = radio.getMaxSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}