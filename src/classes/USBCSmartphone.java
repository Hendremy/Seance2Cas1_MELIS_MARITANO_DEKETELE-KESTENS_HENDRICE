package classes;

import interfaces.Chargeable;

public class USBCSmartphone implements Chargeable {

    @Override
    public void charger() {
        System.out.println("Charging USB-C phone");
    }
}