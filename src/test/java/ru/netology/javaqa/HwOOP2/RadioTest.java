package ru.netology.javaqa.HwOOP2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test

    public void RadiostationNumberCorrect() {

        Radio radio = new Radio();

        radio.setCurrentRadiostation(5);

        int actual = radio.getCurrentRadiostation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadiostationNumberIncorrectMinus() {

        Radio radio = new Radio();

        radio.setCurrentRadiostation(-5);

        int actual = radio.getCurrentRadiostation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadiostationNumberAboveTheBorders() {

        Radio radio = new Radio();

        radio.setCurrentRadiostation(10);

        int actual = radio.getCurrentRadiostation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadiostationNumberAboveTheBordersMinus1() {

        Radio radio = new Radio();

        radio.setCurrentRadiostation(-1);

        int actual = radio.getCurrentRadiostation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadiostationNumberZeroStation() {

        Radio radio = new Radio();

        radio.setCurrentRadiostation(0);

        int actual = radio.getCurrentRadiostation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void VolumeNumberZeroStation() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void VolumeNumberAboveTheBordersMinus1() {

        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void VolumeNumberAboveTheBorders() {

        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void VolumeNumberCorrect() {

        Radio radio = new Radio();

        radio.setCurrentVolume(75);

        int actual = radio.getCurrentVolume();
        int expected = 75;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void VolumeNumberInCorrect() {

        Radio radio = new Radio();

        radio.setCurrentVolume(150);

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);

    }


}