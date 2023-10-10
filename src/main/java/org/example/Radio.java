package org.example;

public class Radio {
    private int numberRadioStation = 10;
    private int minRadiostation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation;
    private int currentSoundVolume;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;

    public Radio(int numberRadioStation) {
        this.numberRadioStation = numberRadioStation;
        this.maxRadioStation = numberRadioStation - 1;
    }

    public Radio() {
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadiostation;
    }

    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadiostation;
        } else {
            currentRadioStation++;
        }
    }

    public void setPrevRadioStation() {
        if (currentRadioStation == minRadiostation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public void setRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        if (newCurrentRadioStation < minRadiostation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {

        currentSoundVolume = newCurrentSoundVolume;
    }

    public void setNextSoundVolume() {
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume++;
        }
    }

    public void setPrevSoundVolume() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume--;
        }
    }
}

