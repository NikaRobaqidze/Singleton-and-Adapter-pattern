/*
 * Author: Nika Robaqidze
 * Email: nika42568@gmail.com

 * Scenarios:
 * User have two mobile chargers: USB type C and USB type B.
 * Each charger have different voltage on output.
 * User need adapter for USB type C to convert (transform)
 * voltage of USB type B.
 */

package ge.tsu;

import ge.tsu.utils.UsbTypeB;
import ge.tsu.utils.UsbTypeC;
import ge.tsu.utils.UsbTypeCAdapter;

public class Launcher {
    public static void main(String[] args) {

        // Initialize charger with default value of voltage.
        UsbTypeB utb = new UsbTypeB();

        // Initialize charger and set value of voltage by hand.
        UsbTypeC utc = new UsbTypeC(1.7);

        // Print data of chargers.
        System.out.println("Usb type B voltage " + utb.getChargePower());
        System.out.println("Usb type C voltage " + utc.getPowerOfCharge());

        // Transform voltage and print result.
        System.out.println(
                "Transform usb type B voltage for Usb type C. Result: "
                + new UsbTypeCAdapter(utc).getChargePower()
        );

        // Transform voltage back to check adapter correct work.
        consumeTypeB(new UsbTypeCAdapter(utc));
    }

    // To transform voltage back.
    static void consumeTypeB(UsbTypeB utb){
        System.out.println("Charge voltage: " + utb.getChargePower());
    }
}