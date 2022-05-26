package ex2_sensors_and_temperature.application;

import java.util.concurrent.ThreadLocalRandom;

// Part 1: Standard Sensor
public class TemperatureSensor implements Sensor {

    private boolean isOn;

    public TemperatureSensor() {
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn() {
        isOn = true;
        System.out.println("Sensor now online");
    }

    public void setOff() {
        isOn = false;
        System.out.println("Sensor now offline");
    }

    public int read() {
        int randomNum = ThreadLocalRandom.current().nextInt(-30, 30 + 1);
        if (!isOn()) {
            throw new IllegalStateException("Sensor must be on");
        }
        return randomNum;
    }

}

