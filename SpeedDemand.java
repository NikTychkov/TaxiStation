import java.util.Arrays;

public class SpeedDemand {

    int speedDemand;

    TaxiStation taxiStation = new TaxiStation();

    public void showSpeedDemandTransport (int speedDemand) {
        this.speedDemand = speedDemand;
        for (int i = 0; i < taxiStation.setTaxiStation().length; i++) {
            if (taxiStation.setTaxiStation()[i].maxSpeed > speedDemand)
            System.out.println(Arrays.asList(taxiStation.setTaxiStation()[i]));
        }
    }

}
