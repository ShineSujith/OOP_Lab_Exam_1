package ie.atu;

public class Ship {
    private String name;
    private String year;
    private int crew;

    public Ship() {
        this.name = "";
        this.year = "";
        this.crew = 0;
    }

    public Ship(String name, String year, int crew) {
        this.name = name;
        this.year = year;
        this.crew = crew;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public int getCrew() {
        return crew;
    }

    public void vesselDetails() {
        System.out.println("Ship's name: " + getName()
                + ", crew number: " + getCrew() + ", year ship was built: " + getYear());
    }
}
