import classes.ChargeType;
import classes.Phone;
import classes.StandardCharger;
import interfaces.Chargeable;

public class App
{
    public static void main( String[] args )
    {
        Chargeable simplePhone = new Phone(ChargeType.USB3);
        StandardCharger standardCharger = new StandardCharger();
        standardCharger.connect(simplePhone);
    }
}