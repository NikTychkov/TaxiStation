public class Transport implements Comparable<Transport> {

    int maxSpeed;
    String brand;
    int fuelConsumption;
    int id;
    String typeTransportation;


    public Transport(int maxSpeed, String brand, int fuelConsumption, int id, String typeTransportation) {
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
        this.id = id;
        this.typeTransportation = typeTransportation;
    }

    public String toString () {
        return ("Марка: " + brand + ", " + "макс. скорость: " + maxSpeed + ", " + "потребление топлива: " + fuelConsumption
                + ", " + "уникальный ID: " + id + ", " + "тип перевозок: " + typeTransportation);
    }

    public Transport () {

    }

    @Override
    public int compareTo(Transport o) {
        return fuelConsumption - o.fuelConsumption;
    }

}
