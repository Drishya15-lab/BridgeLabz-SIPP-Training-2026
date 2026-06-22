class ChargingStation {
    private int stationId;
    private int unitsConsumed;
    static int totalStations = 0;
    static double electricityRate = 10.0;

    public ChargingStation(int stationId, int unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {
        System.out.println("Station ID: " + stationId +
                           ", Units: " + unitsConsumed +
                           ", Bill: Rs " + calculateBill());
    }
}

public class ChargingDemo {
    public static void main(String[] args) {
        ChargingStation s1 = new ChargingStation(101, 50);
        ChargingStation s2 = new ChargingStation(102, 70);
        ChargingStation s3 = new ChargingStation(103, 40);
        ChargingStation s4 = new ChargingStation(104, 90);
        ChargingStation s5 = new ChargingStation(105, 60);

        ChargingStation.electricityRate = 12.0;

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + ChargingStation.totalStations);
    }
}
