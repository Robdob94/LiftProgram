import java.util.Scanner; // Import Scanner class for user input

// Class representing the Lift
class Lift {
    private int currentFloor; // Current floor where the lift is located
    private boolean doorsOpen; // Status of the lift doors

    public Lift() {
        this.currentFloor = 1; // Assume the lift starts on the ground floor
        this.doorsOpen = false; // Doors are initially closed
    }

    // Getter for the current floor
    public int getCurrentFloor() {
        return currentFloor;
    }

    // Getter for door status
    public boolean areDoorsOpen() {
        return doorsOpen;
    }

    // Method to open the lift doors
    public void openDoors() {
        doorsOpen = true;
        System.out.println("Doors opening...");
    }

    // Method to close the lift doors
    public void closeDoors() {
        doorsOpen = false;
        System.out.println("Doors closing...");
    }

    // Method to move the lift up one floor
    public void moveUp() {
        if (currentFloor < 4) {
            currentFloor++;
            System.out.println("Lift is moving up to floor " + currentFloor);
        } else {
            System.out.println("Lift is already at the top floor.");
        }
    }

    // Method to move the lift down one floor
    public void moveDown() {
        if (currentFloor > 1) {
            currentFloor--;
            System.out.println("Lift is moving down to floor " + currentFloor);
        } else {
            System.out.println("Lift is already at the ground floor.");
        }
    }
}

// Class representing the Lift Control System
class LiftControlSystem {
    private Lift lift; // Instance of the Lift class

    public LiftControlSystem() {
        this.lift = new Lift(); // Initialize the lift
    }

    // Method to move the lift to a specified floor
    public void goToFloor(int floor) {
        lift.closeDoors(); // Close the doors before moving
        while (lift.getCurrentFloor() < floor) {
            lift.moveUp();
        }
        while (lift.getCurrentFloor() > floor) {
            lift.moveDown();
        }
        System.out.println("Lift has reached floor " + floor);
        lift.openDoors(); // Open the doors after reaching the floor
    }

    // Method to show the current status of lift
    public void showStatus() {
        System.out.println("Current floor: " + lift.getCurrentFloor());
        System.out.println("Doors " + (lift.areDoorsOpen() ? "open" : "closed"));
    }

    // Method to call the lift to the user's current floor
    public void callLift(int floor) {
        System.out.println("Calling the lift to floor " + floor + "...");
        goToFloor(floor); // Use goToFloor method to move the lift to the user's floor
    }
}

// Main class to run the code
public class LiftOperation {
    public static void main(String[] args) {
        LiftControlSystem liftControl = new LiftControlSystem(); // Create a new LiftControlSystem instance
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // User calls the lift to their current floor at the start
        System.out.println("Enter your current floor (1-4) to call the lift:");
        int startFloor = scanner.nextInt(); // Read the current floor input from the user
        if (startFloor >= 1 && startFloor <= 4) {
            liftControl.callLift(startFloor); // Call the lift to the user's current floor
        } else {
            System.out.println("Invalid floor number. Starting at ground floor (1).");
        }

        // Loop to keep the lift system running
        while (true) {
            System.out.println("\nEnter floor number (1-4) or 0 to exit:");
            int floor = scanner.nextInt(); // Read user input for floor number
            if (floor == 0) {
                break; // Exit the loop if user enters 0
            } else if (floor >= 1 && floor <= 4) {
                liftControl.goToFloor(floor); // Move lift to the specified floor
                liftControl.showStatus(); // Show the current status of the lift
            } else {
                System.out.println("Invalid floor number. Please enter a number between 1 and 4.");
            }
        }

        scanner.close(); // Close the scanner object
        System.out.println("Lift system shut down."); // Indicate that the system is shutting down
    }
}
