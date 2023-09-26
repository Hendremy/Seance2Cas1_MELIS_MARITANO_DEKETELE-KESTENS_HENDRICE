import classes.SimplePhone;
import classes.StandardCharger;
import classes.USBCSmartphone;
import interfaces.Chargeable;

public class App
{
    public static void main( String[] args )
    {
        Chargeable simplePhone = new USBCSmartphone();
        StandardCharger standardCharger = new StandardCharger(simplePhone);
        standardCharger.connectPhone();
    }
}