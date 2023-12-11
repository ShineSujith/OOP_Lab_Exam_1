package ie.atu;

public class VessalApp {
    public static void main(String[] args) {
        Ship ship1 = new Ship("Ship", "1945", 10);
        Ferry ship2 = new Ferry("Ferry", "2010", 14, 60);
        Trawler ship3 = new Trawler("Trawler", "1845", 30, 1500);

        ship1.vesselDetails();
        ship2.vesselDetails();
        ship3.vesselDetails();
    }
}