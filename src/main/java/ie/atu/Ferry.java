package ie.atu;

public class Ferry extends Ship {
    private int passengers;

    public Ferry() {
        this.passengers = 0;
    }
    public Ferry(int passengers) {
        this.passengers = passengers;
    }

    public Ferry(String name, String year, int crew, int passengers) {
        super(name, year, crew);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void vesselDetails() {
        System.out.println("Ferry's name: "+super.getName() + " number of passengers: " + getPassengers());
    }
}
