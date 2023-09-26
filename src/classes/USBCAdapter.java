package classes;

import interfaces.Chargeable;

public class USBCAdapter implements Chargeable{
    private USBCSmartphone smartphone;

    public USBCAdapter(USBCSmartphone phone){
        this.smartphone = phone;
    }

    @Override
    public void charger() {
        this.smartphone.chargeWithUSBCCable();
    }
}
