package ie.atu;

public class Trawler extends Ship{
    private int cargo;

    public Trawler() {
        this.cargo = 0;
    }

    public Trawler(int cargo) {
        this.cargo = cargo;
    }

    public Trawler(String name, String year, int crew, int cargo) {
        super(name, year, crew);
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public void vesselDetails() {
        System.out.println("Trawler's name: " + super.getName() + ", cargo in tonnage: " + getCargo());
    }
}
