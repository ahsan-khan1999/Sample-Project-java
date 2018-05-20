public class Date implements AllData{

    private String  day;
    private int month;
    private int year;
    private Passanger passanger;

    public Date(String day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date(String day, int month, int year,Passanger passanger) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.passanger=passanger;
    }
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void printData() {
        System.out.println("Day\t"+day +"\tMonth\t"+month+"\tYear\t"+year);
    }
}
