package ge.tsu.utils;

/*
 * Class imitate mobile USB type B charger.
 * Example class for scenarios to show pattern work.
 */

public class UsbTypeB {

    // Configuration of USB.
    protected UsbConfig chargePower;

    // Default constructor that set default values of config.
    public UsbTypeB() {
        this.chargePower = new UsbConfig();
    }

    // Parametric constructor to set config of charger with values by hand.
    public UsbTypeB(double chargePower) {
        this.chargePower = new UsbConfig(chargePower);
    }

    // To get power (voltage) of charger.
    public double getChargePower() {
        return chargePower.getPowerVoltage();
    }

    @Override
    public String toString() {
        return "UsbTypeB{" +
                "chargePower=" + chargePower +
                '}';
    }
}
