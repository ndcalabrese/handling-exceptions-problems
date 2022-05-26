package ex2_sensors_and_temperature.application;

// Part 1: Standard Sensor
public class StandardSensor implements Sensor {

    private boolean isOn;
    private int number;

    public StandardSensor(int number) {
        try {
            this.number = number;
        } catch (Exception e) {
            System.out.println("Error: enter an integer");
        }
        this.isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn() {

    }

    public void setOff() {

    }

    public int read() {
        return number;
    }

}

