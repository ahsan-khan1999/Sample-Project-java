import java.util.ArrayList;
import java.util.List;
public class Bus extends Vehicals implements AllData{
    private Date date;
    private Driver driver=null;
    private String busName;
    private String color;
    private String registrationNumber;
    private int model;
    private int noOfSeats;
    private int noOfTrips;
    private Rounting rounting=null;
    private Passanger passanger=null;
    public Bus(Date date,Driver driver,String busName, String color, String registrationNumber, int model, int noOfSeats,int noOfTrips,Passanger passanger,Rounting rounting) {
        this.date=date;
        this.driver=driver;
        this.busName = busName;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.noOfSeats = noOfSeats;
        this.noOfTrips= noOfTrips;
        this.passanger=passanger;
        this.rounting=rounting;
    }
    public Bus(String busName, String color, String registrationNumber, int model, int noOfSeats,int noOfTrips){
        this.busName = busName;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.noOfSeats = noOfSeats;
        this.noOfTrips= noOfTrips;
//        this.passanger=passanger;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public Rounting getRounting() {
        return rounting;
    }

    public void setRounting(Rounting rounting) {
        this.rounting = rounting;
    }

    public Passanger getPassanger() {
        return passanger;
    }

    public void setPassanger(Passanger passanger) {
        this.passanger = passanger;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }


    public int NoOfSeats() {
//        passanger = null;
            int noOfPassangers=0;
            ArrayList<Passanger> busList = new ArrayList<Passanger>();
            busList.add(new Passanger("Ahsan","16843","Maymar","Stadium"));
            noOfPassangers++;
            noOfSeats++;
        System.out.println(new Passanger("Ahsan","16843","Maymar","Stadium")+"Date "+"Date Of Ading Passsanger"+"\t Day \t"+date.getDay()+"\t Year \t"+date.getYear()+"\tMonth \t"+date.getMonth());
            return noOfSeats+noOfPassangers;
        }
        public void addPassangers(){
        int noOfPassangers=0;
        ArrayList<Passanger> arrayList = new ArrayList<>();
        arrayList.add(new Passanger("Ahsan","12244","Gulshan","Cent"));
            noOfPassangers++;
            noOfSeats--;
                System.out.println("Number of passangers \t"+noOfPassangers+"\tDate\t "+"\tDate Of Ride\t"+"\tDay \t"+date.getDay()+"\t Year \t"+date.getYear()+"\tMonth \t"+date.getMonth());
            System.out.println("Number of Seats left\t"+noOfSeats);
        }

    public int nowAvilableSeats(){

            ArrayList<Passanger> arrayList = new ArrayList<>();
            arrayList.add(new Passanger("Haris","1254015","maymar","karsaz"));

//            arrayList.add(new Date("Monday",03,2018));

        System.out.println("Name of passanger added to bus\t"+arrayList.get(0).getName()+"\tContact of passsanger\t"+arrayList.get(0).getContactNumber()+"\tDate Of Ride\t"+"\tDay\t /"+date.getDay()+"\t Year \t/"+date.getYear()+"\tDay \t/"+date.getMonth());
            noOfSeats--;
        return noOfSeats;
    }
    public int getNoOfTrips() {
        return noOfTrips;
    }

    public void setNoOfTrips(int noOfTrips) {
        this.noOfTrips = noOfTrips;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String dataOfBus()
    {
        return ("\tBus Name\t"+busName+"\tColor \t"+color+"\tRegistration Number\t"+registrationNumber);
    }


    public int noOfTrips(){
        return noOfTrips++;
    }
    public void routingHistory(){
        System.out.println(rounting.dropOfRoutes);
        System.out.println(rounting.dropOfRoutes);
    }

    @Override
    public void printData() {
        System.out.println(("\tBus Name\t"+busName+"\tColor \t"+color+"\tRegistration Number\t"+registrationNumber));
    }
}
