package assignment;


class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay = 1000.0; // Example rate

    // Default constructor
    CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Basic";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    double calculateCost() {
        return rentalDays * ratePerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + calculateCost());
    }
}
