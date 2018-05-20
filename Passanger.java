import java.sql.Time;
//import java.io.OutputStream.*;
import java.util.Scanner;

public class Passanger implements AllData{
    private Date date;
    private Bus bus;
    private String name;
    private String contactNumber;
    private String currentLocation;
    private String dropOfLocation;
    private Rounting rounting=null;

    public Passanger(String name, String contactNumber, Rounting rounting, String currentLocation, String dropOfLocation) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.currentLocation = currentLocation;
        this.dropOfLocation = dropOfLocation;

    }
    public Passanger(String name, String contactNumber, String currentLocation, String dropOfLocation){
        this.name = name;
        this.contactNumber = contactNumber;
        this.currentLocation = currentLocation;
        this.dropOfLocation = dropOfLocation;

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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

//    public String getCurrentLocation() {
//        return currentLocation;
//    }
//
//    public void setCurrentLocation(String currentLocation) {
//        this.currentLocation = currentLocation;
//    }
//
//    public String getDropOfLocation() {
//        return dropOfLocation;
//    }
//
//    public void setDropOfLocation(String dropOfLocation) {
//        this.dropOfLocation = dropOfLocation;
//    }

    Scanner scanner = new Scanner(System.in);

    public   boolean ticketBooking() {
        System.out.println("We Need More Check in Order to Book Yoyr Tickets!!");

        if (routeConfirmation()) {
                System.out.println("Yes we have more un use Seats You can booke your Ticket");
                System.out.println("Press 1 for Ticket Booking!!");
                    int i = scanner.nextInt();
                System.out.println("Your Tickets are confirmed");
//                busInfo();
//            System.out.println(date.getYear());
//            System.out.println(date.getMonth());
                return true;
            }
            else {
                System.out.println("No Your Routes are not Founded in our Plan You cannot book tickets");
            }
            return true;
        }
        public void busInfo() {

                System.out.println(bus.dataOfBus());
                System.out.println(date.getDay());
                System.out.println(date.getMonth());
                System.out.println(date.getYear());

            }


//            int i = scanner.nextInt();
//            System.out.println("Your Tickets are confirmed with folling bus Information");
//            bus.dataOfBus();
//            System.out.println(date.getDay());
//            System.out.println(date.getMonth());
//            System.out.println(date.getYear());
//            return true;
//        }


//    if route found from
//
// file than we call ride confirmation method;

        public Boolean routeConfirmation() {
            if(verifyCurrentLocation()){
                if (verifyDropOfLocation() == true){
                    System.out.println("Now your Route is Confirmed");
                    return true;

                }
                else {
                    return false;
                }
                }
            else{
                return false;
            }
        }

        public double fareCalculation(double kilometers,double totalTime){
            double fare = kilometers * totalTime;
            boolean peak=true;

            if(peak == true){
                double peakFare = fare * 1.5;
                return peakFare;
            }
            else{
                return fare;
            }

        }

//           Scanner scanner = new Scanner(System.in);
//           currentLocation = scanner.nextLine();
//           dropOfLocation = scanner.nextLine();
//
////        if (currentLocation.equalsIgnoreCase(rounting.pickUpRoute[0])) {
//            if (dropOfLocation.equalsIgnoreCase(rounting.dropOfRoutes[0])) {
//                System.out.println("Route Found");
//                return true;
//
//            } else {
//                System.out.println("Sorry No Route Found");
//                return false;
//            }

//        } else {
//            System.out.println("Sorry No Route Found");
//        }
//        return false;

    public boolean verifyCurrentLocation(){
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tEnter Your Currnt Location");
        String currentLocation = scanner.nextLine();
                if (currentLocation.equalsIgnoreCase("Maymar")) {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tCurrent Location Route found");
                    return true;
                }
                else{
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tno route found");
                    verifyCurrentLocation();
                    return false;
                }

    }
    public boolean  verifyDropOfLocation(){
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tEnter Your Drop of Location");
        String dropOfLocation = scanner.nextLine();
        if (dropOfLocation.equals("Stadium")) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tRoute Found");
            return true;
        } else if(dropOfLocation.equalsIgnoreCase("Karsaz")){
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tRoute Found");
            return true;
        }
        else if(dropOfLocation.equalsIgnoreCase("Shahra-e-Faisal")){
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tRoute Found");
            return true;
        }
        else if(dropOfLocation.equalsIgnoreCase("WaterPump")){
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tRoute Found");
            return true;
        }
        else if(dropOfLocation.equalsIgnoreCase("Tariq Road")){
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tRoute Found");
            return true;
        }
        else{
            System.out.println("\t\t\t\t\t\t\tEnter A valid input");
            verifyDropOfLocation();
            return false;
        }
    }
    public void ratings(){
        System.out.println("\t\t\t\t\t\t\t\t\t\tHere is our rating Scheme For driver\n \t\t\t\t\t\t\t\t\t\tEnter number of stars to Rate");
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * * * * * * * * * * * * * * *");
        System.out.println("\t\t\t\t\t\t\t\t\t\t***** == Very Good ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t**** == Good ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t*** == Fair ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t** == Not Good ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t* == Very Bad ");
        Scanner s = new Scanner(System.in);
            System.out.println("\t\t\t\t\t\t\t\t\t\tEnter Stars According To Our Scheme For Driver");
            String stars = s.nextLine();
            String[] rating={stars};
            System.out.println(rating[0]);

            if (stars.equals("*****")) {

                System.out.println("\t\t\t\t\t\t\t\t\t\tVery Good Driver");
            }
            else if (stars.equals("****")) {
                System.out.println("\t\t\t\t\t\t\t\t\t\tGood Driver");
            }
            else if (stars.equals("***")) {
                System.out.println("\t\t\t\t\t\t\t\t\t\tFair Driver");
            }
            else if (stars.equals("**")) {
                System.out.println("\t\t\t\t\t\t\t\t\t\tNot Good Driver");
            }
            else if (stars.equals("*")) {
                System.out.println("\t\t\t\t\t\t\t\t\t\tVery Bad Driver");
            }
            else {
                System.out.println("\t\t\t\t\t\t\t\t\t\tEnter A valid input");
                ratings();
            }
        }

    @Override
    public void printData() {
        System.out.println("Name\t"+name+"\tContact\t"+contactNumber+"\tCurrent Loaction\t"+currentLocation+"\tDropOfLocation\t"+dropOfLocation);
    }
}