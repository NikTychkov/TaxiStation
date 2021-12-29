import java.util.Arrays;

public class FuelSorting {

    TaxiStation taxiStation = new TaxiStation();

    public void showSortingTransportFuelConsumption () {

        Transport[] transportFuelConsumptionSorting = Arrays.copyOf(taxiStation.setTaxiStation(), taxiStation.setTaxiStation().length);
        Arrays.sort(transportFuelConsumptionSorting);
        for (int i = 0; i < transportFuelConsumptionSorting.length; i++) {
            System.out.println(Arrays.asList(transportFuelConsumptionSorting[i]));
        }
    }

}

