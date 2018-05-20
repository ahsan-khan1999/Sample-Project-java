import java.util.ArrayList;
import java.util.Scanner;

public class Driver implements AllData{
    private String name;
    private long number;
    private String experience;
    private Bus bus;


    public Driver(Bus bus, String name, long number, String experience) {
        this.bus = bus;
        this.name = name;
        this.number = number;
        this.experience = experience;
    }
    public Driver(String name, long number, String experience){

        this.name=name;
        this.number=number;
        this.experience=experience;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void addDrivers(Driver driver){
        ArrayList<Driver> arrayList = new ArrayList<Driver>();
        arrayList.add(new Driver(new Bus("D8","blue","BFD-898",2018,35,5),"D7",65723,"2_years"));
    }

    public double monthlySalery(int noOfTrips){
        double amountPerTrip = 200;
        double saleryPerDay = noOfTrips * 200;
        double monthlySalery = saleryPerDay * 30;
        return monthlySalery;
    }

    public int noOfTripsOfDrives(int noOfTrips){
        return noOfTrips++;
    }

    public void ratings(){
        System.out.println("\t\t\t\t\t\t\t\t\t\tHere is our rating Scheme\n \t\t\t\t\t\t\t\t\t\tEnter number of stars to Rate");
        System.out.println("\t\t\t\t\t\t\t\t\t\t***** == Very Good ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t**** == Good ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t*** == Fair ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t** == Not Good ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t* == Very Bad ");
        Scanner s = new Scanner(System.in);
            System.out.println("\t\t\t\t\t\t\t\t\t\tEnter Stars According To Our Scheme For Passanger");
        System.out.println(" *  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * * * * * * * * * * * * * * *");
            String stars = s.nextLine();
            String[] rating={stars};
        System.out.println(rating[0]);

            if (stars.equals("*****")) {

                System.out.println("\t\t\t\t\t\t\t\t\t\tVery Good Passanger");
            } else if (stars.equals("****")) {
                System.out.println("\t\t\t\t\t\t\t\t\t\tGood Passanger");
            } else if (stars.equals("***")) {
                System.out.println("\t\t\t\t\t\t\t\t\t\tFair Passanger");
            } else if (stars.equals("**")) {
                System.out.println("\t\t\t\t\t\t\t\t\t\tNot Good Passanger");
            } else if (stars.equals("*")) {
                System.out.println("\t\t\t\t\t\t\t\t\t\tVery Bad Passanger");
            } else {
                System.out.println("\t\t\t\t\t\t\t\t\t\tEnter A valid input");
                ratings();
            }
        }

    @Override
    public void printData() {
        System.out.println("Name \t"+name+"\tNumber \t"+number+"\tExperience \t"+ experience);
    }
}



