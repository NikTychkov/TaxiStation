import java.util.Arrays;

public class TaxiStation {

    Transport transport1 = new Car(320, "BMW 5 модели", 25, 1, "пассажирские", 4, "ультима");
    Transport transport2 = new Bus(150, "ПАЗ", 24, 2, "пассажирские", 40, "частные");
    Transport transport3 = new Truck(160, "MAN", 50, 3, "грузовые", 2000);
    Transport transport4 = new Car(180, "Жигули 6 модели", 6, 4, "пассажирские", 4, "эконом");
    Transport transport5 = new Car(240, "Hyundai Accent", 10, 5, "пассажирские", 4, "эконом");
    Transport transport6 = new Car(300, "Toyota Camry 40", 16, 6, "пассижирские", 4, "комфорт");
    Transport transport7 = new Bus(180, "Mercedes", 80, 7, "пассажирские", 80, "туристические");
    Transport transport8 = new Truck(150, "Камаз", 120, 8, "грузовые", 3500);
    Transport transport9 = new Truck(210, "Volvo", 100, 9, "грузовые", 3000);
    Transport transport10 = new Bus(230, "Hyundai", 90, 10, "пассажирские", 60, "туристические");

    public Transport[] setTaxiStation() {
        Transport[] taxiStation = new Transport[10];
        taxiStation[0] = transport1;
        taxiStation[1] = transport2;
        taxiStation[2] = transport3;
        taxiStation[3] = transport4;
        taxiStation[4] = transport5;
        taxiStation[5] = transport6;
        taxiStation[6] = transport7;
        taxiStation[7] = transport8;
        taxiStation[8] = transport9;
        taxiStation[9] = transport10;
        return taxiStation;
    }

    public void printTaxiStation () {
        for (int i = 0; i < setTaxiStation().length; i++) {
            System.out.println(Arrays.asList(setTaxiStation()[i]));
        }
    }

}
