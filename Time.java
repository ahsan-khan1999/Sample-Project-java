public class Time implements AllData{

    private double hours=0.0;
    private double minutes=0.0;
    private double seconds =0.0;

    public Time(double hours, double minutes, double seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getMinutes() {
        return minutes;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    public double getSeconds() {
        return seconds;
    }

    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }

    @Override
    public void printData() {
        System.out.println("Hour\t"+hours+"\tMinutes\t"+minutes+"\tSeconds\t"+seconds);
    }
}
