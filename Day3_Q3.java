class Vehicle {                                                                 // Parent
    public void startEngine() {
        System.out.println("Vehicle engine started.");
    }
}

class Car extends Vehicle {                                                   // Child 1
    public void startEngine() {
        System.out.println("Car engine started with a key.");
    }
}

class Motorcycle extends Vehicle {                                            // Child 2
    public void startEngine() {
        System.out.println("Motorcycle engine started with a button press.");
    }
}


public class Day3_Q3 {
    public static void vehicleTestDrive(Vehicle v) {
        v.startEngine();                                               // calling start engine method.
    }

    public static void main(String[] args) {
        Vehicle hyundai = new Car();
        Vehicle java = new Motorcycle();
        
        vehicleTestDrive(hyundai);          
        vehicleTestDrive(java);   
    }
}