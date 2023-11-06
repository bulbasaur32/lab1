import java.awt.*;



public class Car implements Movable {

    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name

    public double x = 0.0;
    public double y = 0.0;
    public double direction = 0.0;


    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }

    public void move(double duration){
        double distance = currentSpeed * Math.max(duration, 0);
        double radianDirection = Math.toRadians(direction);
        x += Math.sin(radianDirection) * distance;
        y += Math.cos(radianDirection) * distance;
    }

    public void turnLeft(double angle){
        direction -= angle;
    }

    public void turnRight(double angle){
        direction += angle;
    }

}
