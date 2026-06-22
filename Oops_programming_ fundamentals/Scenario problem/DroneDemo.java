class Drone {
    private int droneId;
    private int batteryPercentage;
    static String companyName = "SkyLogistics";

    public Drone(int droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    public void startDelivery() {
        if (batteryPercentage > 20) {
            System.out.println("Drone " + droneId + " started delivery.");
            batteryPercentage -= 20;
        } else {
            System.out.println("Drone " + droneId + " has low battery!");
        }
    }

    public void displayStatus() {
        System.out.println("Drone ID: " + droneId +
                           ", Battery: " + batteryPercentage + "%" +
                           ", Company: " + companyName);
    }
}

public class DroneDemo {
    public static void main(String[] args) {
        Drone d1 = new Drone(1, 80);
        Drone d2 = new Drone(2, 50);
        Drone d3 = new Drone(3, 25);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}


