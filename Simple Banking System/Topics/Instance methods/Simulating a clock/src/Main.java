class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        this.minutes++;
        if (minutes == 60) {
            hours++;
            minutes = 0;
        }
    }
}