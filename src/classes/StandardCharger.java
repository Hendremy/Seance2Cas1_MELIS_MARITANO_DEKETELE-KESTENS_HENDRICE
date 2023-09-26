package classes;
import interfaces.Chargeable;
import interfaces.Charger;

public class StandardCharger implements Charger{

    @Override
    public void connect(Chargeable phone) {
        String charging = "";
        switch(phone.getChargeType()){
            case SIMPLE:
                charging = "Charging SimplePhone ...";
                break;
            case USBC:
                charging = "Charging USBCSmartPhone";
                break;
            default:
                charging = "Charging method unknown";
                break;
        }
        System.out.println(charging);
    }
}
