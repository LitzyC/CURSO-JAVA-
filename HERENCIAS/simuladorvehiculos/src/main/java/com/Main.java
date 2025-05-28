package com;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Coche("Toyota", 2024, "Corolla"));
        vehiculos.add(new Moto ("Yamaha", 2025, "MT-07"));
        vehiculos.add(new Bicicleta("BMC", 2019, "Roadmachine"));

        for (Vehiculo tipoVehiculo : vehiculos) {
            tipoVehiculo.arrancar();
            tipoVehiculo.detener();
            System.out.println(" ");
        }
    }
}