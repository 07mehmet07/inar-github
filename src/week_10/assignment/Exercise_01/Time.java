package week_10.assignment.Exercise_01;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapsedTime) {
        this.setTime(elapsedTime);

    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }
    public void setTime(long elapsedTime){
        second = (elapsedTime / 1000) % 60;
        minute = ((elapsedTime / 1000) / 60) % 60;
        hour = (((elapsedTime / 1000) / 60) / 60) % 24;
    }
}
