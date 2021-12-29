public class Truck extends Transport {

    int maxFreight;

    public Truck (int maxSpeed, String brand, int fuelConsumption, int id, String typeTransportation, int maxFreight) {
        super (maxSpeed, brand, fuelConsumption, id, typeTransportation);
        this.maxFreight = maxFreight;
    }

    public String toString () {
        return ("Марка: " + brand + ", " + "макс. скорость (км/ч): " + maxSpeed + ", " + "потребление топлива (л/100 км): " + fuelConsumption
                + ", " + "уникальный ID: " + id + ", " + "тип перевозок: " + typeTransportation + ", " + "грузоподъемность (кг): "
                + maxFreight);
    }
}
