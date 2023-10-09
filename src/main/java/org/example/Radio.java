package org.example;

public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;

    }

    public void setNextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void setPrevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation--;
        }
    }

    public void setRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void setNextSoundVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        }
    }

    public void setPrevSoundVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        }
    }
}

