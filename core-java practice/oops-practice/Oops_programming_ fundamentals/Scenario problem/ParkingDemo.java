class Vehicle {
    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void display() {
        System.out.println("Number: " + vehicleNumber +
                           ", Owner: " + ownerName +
                           ", Type: " + vehicleType);
    }
}

public class ParkingDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];
        vehicles[0] = new Vehicle("UP85A1234", "Drishya", "Car");
        vehicles[1] = new Vehicle("UP85B5678", "Aditi", "Bike");
        vehicles[2] = new Vehicle("UP85C1111", "krati", "Car");
        vehicles[3] = new Vehicle("UP85D2222", "skand", "Bike");
        vehicles[4] = new Vehicle("UP85E3333", "mahek", "Car");
        vehicles[5] = new Vehicle("UP85F4444", "mahi", "Bike");
        vehicles[6] = new Vehicle("UP85G5555", "Arjun", "Car");
        vehicles[7] = new Vehicle("UP85H6666", "avi", "Bike");
        vehicles[8] = new Vehicle("UP85I7777", "Meena", "Car");
        vehicles[9] = new Vehicle("UP85J8888", "Rohit", "Bike");

        System.out.println("Cars:");
        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Car")) {
                v.display();
            }
        }

        System.out.println("Bikes:");
        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }
}
