public class Test {
    public static void main(String[] args) {

        Rounting rounting = new Rounting();
        Passanger passanger =  new Passanger("Ali","02145544","Maymar","Stadium");

        Driver driver = new Driver("Ali",213543,"2 years");
        Bus bus = new Bus(new Date("Monday",06,2018),driver,"W11","red","asd-987", 2018,35,05,passanger,rounting);
        Time time = new Time(1,03,45);
        Date date = new Date("Monday",9,2018);

        rounting.displayRoutes();
        passanger.verifyCurrentLocation();
        passanger.verifyDropOfLocation();
        passanger.ticketBooking();
        System.out.println("With this bus"+bus.dataOfBus());
        System.out.println("No of seats in bus"+bus.NoOfSeats());

        System.out.println("Now Avilable Seats \t"+bus.nowAvilableSeats());
        bus.addPassangers();
        System.out.println("Monthly Salery For Driver \t\t"+driver.monthlySalery(3));
        System.out.println("Total Fare Of Passanger \t"+passanger.fareCalculation(7.59 , time.getHours()+time.getMinutes()+time.getSeconds()));
        driver.ratings();
        passanger.ratings();

        time.printData();
        date.printData();
        passanger.printData();
        driver.printData();

//        driver.addDrivers(new Driver());
//        bus.routingHistory();




    }
}
