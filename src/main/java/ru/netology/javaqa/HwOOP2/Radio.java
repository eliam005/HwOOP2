package ru.netology.javaqa.HwOOP2;

public class Radio {

    private int currentVolume;
    private int currentRadiostation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }

        this.currentVolume = currentVolume;
    }


    public void setCurrentRadiostation(int currentRadiostation) {

        if (currentRadiostation < 0) {
            return;
        }

        if (currentRadiostation > 9) {
            return;
        }

        this.currentRadiostation = currentRadiostation;
    }
}
