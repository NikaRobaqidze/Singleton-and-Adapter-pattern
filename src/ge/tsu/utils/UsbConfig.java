package ge.tsu.utils;

/*
 * Singleton config class. Configurations of chargers reading from specific .conf file.
 * File has created only for visualization. Now it include only voltage of charger.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class UsbConfig {

    // Voltage of charger.
    private double powerVoltage;

    // Parametric constructor to set voltage by hand.
    public UsbConfig(double powerVoltage) {
        this.powerVoltage = powerVoltage;
    }

    // Default constructor to set voltage from file.
    public UsbConfig() {

        try {

            // Configuration file (.conf) must in specific directory to read and get value from it.
            Path configPath = Path.of(System.getProperty("user.dir"))
                    .resolve("src").resolve("ge").resolve("tsu")
                    .resolve("configures").resolve("config.data");

            // Read lines from files.
            List<String> allLines = Files.readAllLines((configPath));
            // Set value from file.
            this.powerVoltage = Double.parseDouble(allLines.get(0));

        } catch (IOException e){

            this.powerVoltage = 0.0;
            e.printStackTrace();
        }
    }

    // To get voltage value of charger.
    public double getPowerVoltage() {
        return powerVoltage;
    }

    @Override
    public String toString() {
        return "UsbConfig{" +
                "powerVoltage=" + powerVoltage +
                '}';
    }
}
