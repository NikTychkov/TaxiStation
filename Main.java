import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("                    Станция такси");
        System.out.println();

        System.out.println("Пожалуйста, введите команду из списка ниже");
        System.out.println();

        System.out.println("Команды:");
        System.out.println();
        System.out.println("Команда: " + "1" + " (Описание: Список всех транспортных средств)");
        System.out.println("Команда: " + "2" + " (Описание: Выбор транспортных средств по необходимой скорости)");
        System.out.println("Команда: " + "3" + " (Описание: Список транспортных средств по потребляемому топливу в порядке возрастания)");
        System.out.println("Команда: " + "4" + " (Описание: Завершить программу)");
        System.out.println();

        Scanner console = new Scanner(System.in);

        while (true) {
            String command = console.nextLine();
            if (command.equals("4")) break; {

                if (command.equals("1")) {
                    TaxiStation taxiStation = new TaxiStation();
                    taxiStation.printTaxiStation();
                    System.out.println();
            }

                if (command.equals("2")) {
                    System.out.println("Пожалуйста, укажите необходимую скорость передвижения");
                    SpeedDemand speedDemand = new SpeedDemand();
                    speedDemand.showSpeedDemandTransport(console.nextInt());
                    System.out.println();
                }

                if (command.equals("3")) {
                    FuelSorting fuelSorting = new FuelSorting();
                    fuelSorting.showSortingTransportFuelConsumption();
                }
            }
        }
    }
}
