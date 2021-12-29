public class Car extends Transport {

    int capacity;
    String segment;

    public Car (int maxSpeed, String brand, int fuelConsumption, int id, String typeTransportation, int capacity, String segment) {
        super (maxSpeed, brand, fuelConsumption, id, typeTransportation);
        this.capacity = capacity;
        this.segment = segment;
    }

    public String toString () {
        return ("Марка: " + brand + ", " + "макс. скорость (км/ч): " + maxSpeed + ", " + "потребление топлива (л/100 км): " + fuelConsumption
                + ", " + "уникальный ID: " + id + ", " + "тип перевозок: " + typeTransportation + ", " + "вместимость (PAX): " + capacity
                + ", " + "сегмент: " + segment);
    }
}
