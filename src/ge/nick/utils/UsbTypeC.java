package ge.nick.utils;

/**
 * Class imitate mobile USB type C charger.
 * Example class for scenarios to show pattern work.
 */

public class UsbTypeC {

    // Voltage of charger.
    protected UsbConfig powerOfCharge;

    // Default constructor to set voltage from file.
    public UsbTypeC() {
        this.powerOfCharge = new UsbConfig();
    }

    // Parametric constructor to set voltage by hand.
    public UsbTypeC(double powerOfCharge) {
        this.powerOfCharge = new UsbConfig(powerOfCharge);
    }

    // To get voltage value of charger.
    public double getPowerOfCharge() {
        return powerOfCharge.getPowerVoltage();
    }

    @Override
    public String toString() {
        return "UsbTypeC{" +
                "powerOfCharge=" + powerOfCharge +
                '}';
    }
}
