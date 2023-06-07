package ge.tsu.utils;

/*
* Adapter class that convert (transform) voltage of power.
* Logic: transform voltage of one charger to another one.
* Extends class that that must be converted.
*/

public class UsbTypeCAdapter extends UsbTypeB {

    // Class for what need the adapter.
    private UsbTypeC usbTypeC;

    // Parametric constructor to set object for adapting.
    public UsbTypeCAdapter(UsbTypeC usbTypeC) {
        this.usbTypeC = usbTypeC;
    }

    // To set constructor object that must be adapted.
    private UsbTypeCAdapter(double chargePower) {
        super(chargePower);
    }

    // To transform voltage of another object.
    static public double Transform(UsbTypeB utb){

        return utb.chargePower.getPowerVoltage();
    }

    @Override
    public double getChargePower() {
        return usbTypeC.getPowerOfCharge();
    }

    @Override
    public String toString() {
        return "UsbTypeCAdapter{" +
                "usbTypeC=" + usbTypeC +
                ", chargePower=" + chargePower +
                '}';
    }
}
