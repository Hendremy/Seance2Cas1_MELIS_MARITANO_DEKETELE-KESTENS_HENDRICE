package classes;

import interfaces.Chargeable;

public class Phone implements Chargeable {

    private final ChargeType chargeType;

    public Phone(ChargeType chargeType){
        this.chargeType = chargeType;
    }

    @Override
    public ChargeType getChargeType() {
        return this.chargeType;
    }    
}
