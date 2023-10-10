package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int numberRadioStation = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = numberRadioStation-1;
    private int currentRadioStation;
    private int currentSoundVolume;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;

    public void setNextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation++;
        }
    }

    public void setPrevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public void setRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
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


