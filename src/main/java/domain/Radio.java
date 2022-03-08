package domain;

public class Radio {

    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0 || newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int nextCurrentStation() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
        return currentStation;
    }

    public int prevCurrentStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
        return currentStation;
    }


    public int currentVolume;

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0 || newCurrentVolume >= 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }
    public void decreaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}
