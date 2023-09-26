package classes;

import interfaces.Chargeable;
import interfaces.Charger;

public class StandardCharger implements Charger{
    Chargeable phone;

    public StandardCharger(Chargeable phone) {
        this.phone = phone;
    }

    @Override
    public void connectPhone() {
        System.out.println("Charging SimplePhone ...");
    }
}
