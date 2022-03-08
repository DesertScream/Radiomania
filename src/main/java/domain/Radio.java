package domain;

public class Radio {

    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void increaseStation() {

        if (currentStation < 9) {
            currentStation = currentStation - 1;
            return;
        }

        this.currentStation = 0;
    }

    public void prevStation() {

        if (currentStation > 0) {
            currentStation = currentStation + 1;
            return;
        }

        this.currentStation = 9;
    }


    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 9;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume > 10) {
            return;
        }
    }

    public void prevVolume() {
        if (currentVolume < 10) {
            return;
        }
    }
}
