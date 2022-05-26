package ex2_sensors_and_temperature.application;

public class Program {

    public static void main(String[] args) {
        // Part 1: Standard Sensor
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());
        System.out.println();

        // Part 3: Average Sensor
        Sensor kumpula = new TemperatureSensor();
        kumpula.setOn();
        System.out.println("temperature in Kumpula "
                + kumpula.read() + " degrees Celsius");

        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region "
                + helsinkiRegion.read() + " degrees Celsius");
        System.out.println();

        // Part 4: All readings
        System.out.println("temperature in Helsinki region "
                + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region "
                + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region "
                + helsinkiRegion.read() + " degrees Celsius");

        System.out.println("readings: " + helsinkiRegion.readings());
    }

}