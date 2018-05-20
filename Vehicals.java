public abstract class Vehicals implements AllData{

    private int numberOfVechicals;
    public Vehicals(){}
    public Vehicals(int numberOfVechicals) {
        this.numberOfVechicals = numberOfVechicals;
    }

    public int getNumberOfVechicals() {
        return numberOfVechicals;
    }

    public void setNumberOfVechicals(int numberOfVechicals) {
        this.numberOfVechicals = numberOfVechicals;
    }

    @Override
    public void printData() {
        System.out.println("Number Of Vehicals"+numberOfVechicals);
    }
}
