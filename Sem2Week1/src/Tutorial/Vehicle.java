
package Tutorial;

public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;
    
    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public abstract void accelerate();
    
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
    
    public void pedalToTheMetal() {
        while(currentSpeed != maxSpeed) {
            accelerate();
        }
    }
    
    // An instance of Vehicle cannot be created since Vehicle is an abstract class that cannot be instantiated.
    
}
