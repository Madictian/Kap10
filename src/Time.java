import java.util.Date;

public class Time {
    private double hour;
    private double minute;
    private double second;

    public Time() {
        long elapsed = System.currentTimeMillis() / 1000;
        this.second = elapsed % 60;
        this.minute = (elapsed / 60) % 60;
        this.hour = (elapsed / (60 * 60)) % 24 + 1;
    }

    public Time(long elapsed){
        Time date = new Time(elapsed);
        this.hour = date.getHour();
        this.minute = date.getMinute();
        this.second = date.getSecond();
    }
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }


    public double getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;

    }

    public double getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(long elapsed) {
        elapsed /= 1000;
        this.second = elapsed % 60;
        this.minute = (elapsed / 60) % 60;
        this.hour = (elapsed / (60 * 60)) % 24;

    }
}
