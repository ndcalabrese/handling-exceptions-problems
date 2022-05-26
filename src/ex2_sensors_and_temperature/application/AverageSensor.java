package ex2_sensors_and_temperature.application;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.concurrent.ThreadLocalRandom;

// Part 3: Average Sensor
public class AverageSensor implements Sensor {

    private boolean isOn;
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
        this.isOn = false;
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
        System.out.println("Sensor added.");
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn() {
        isOn = true;
        for ( Sensor sensor : sensors ) {
            sensor.setOn();
        }
        System.out.println("All sensors online.");
    }

    public void setOff() {
        isOn = false;
        for ( Sensor sensor : sensors ) {
            setOff();
        }
        System.out.println("All sensors offline.");
    }

    public int read() {
        int avgInt = 0;
        if (!isOn()) {
            throw new IllegalStateException("Sensor must be on");
        }
        OptionalDouble avg = sensors.stream()
                .map(Sensor::read)
                .mapToInt(Integer::valueOf)
                .average();

        if (avg.isPresent()) {
            avgInt = (int) avg.getAsDouble();
        }
        readings.add(avgInt);

        return avgInt;
    }

    public List<Integer> readings() {
        return readings;
    }

}

