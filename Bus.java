public class Bus extends Transport {

    int capacity;
    String typeBusTransportation;

    public Bus (int maxSpeed, String brand, int fuelConsumption, int id, String typeTransportation, int capacity, String typeBusTransportation) {
        super(maxSpeed, brand, fuelConsumption, id, typeTransportation);
        this.capacity = capacity;
        this.typeBusTransportation = typeBusTransportation;
    }

    public String toString () {
        return ("Марка: " + brand + ", " + "макс. скорость (км/ч): " + maxSpeed + ", " + "потребление топлива (л/100 км): " + fuelConsumption
                + ", " + "уникальный ID: " + id + ", " + "тип перевозок: " + typeTransportation + ", " + "вместимость (PAX): "
        + capacity + ", " + "тип автобусных перевозок: " + typeBusTransportation);
    }
}
