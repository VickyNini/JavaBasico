package clases;

import herencia.SmartPhone;
import herencia.SmartWatch;

public class Main {

    public static void main(String[] args) {
        String caracteristicas = "";
        System.out.println("Los smartphones que hay en stock son:\n ");

        SmartPhone xiaomi11TPro = new SmartPhone ("Xiaomi 11T Pro", "Xiaomi", "Andoid", "Tipo C", "Gris", 6.67, 5000, true, 395, "108 + 8 + 5", 16, 204, 164.1, 78.1, 111.05, 12, 256);
        xiaomi11TPro.imprimir(caracteristicas);
        System.out.println(xiaomi11TPro.datos);

        SmartPhone samsungGalaxyS23Plus = new SmartPhone ("Samsung Galaxy S23 Plus","Samsung", "Andoid", "Tipo C", "Negro", 6.6, 4700, true, 390, "50 + 12 + 10", 12, 195, 157.8, 76.2, 91.39, 8, 256);
        samsungGalaxyS23Plus.imprimir(caracteristicas);
        System.out.println(samsungGalaxyS23Plus.datos);

        SmartPhone appleiPhone14Plus = new SmartPhone ("Apple iPhone 14 Plus","Apple", "IOS", "Lightning", "Blanco", 6.7, 4323, true, 458, "48 + 12 + 12", 12, 203, 160.8, 78.1, 97.96, 4, 512);
        appleiPhone14Plus.imprimir(caracteristicas);
        System.out.println(appleiPhone14Plus.datos);

        System.out.println("Los smartwatch que hay en stock son:\n ");

        SmartWatch galaxyWatch5Pro = new SmartWatch( "Galaxy Watch Pro","Samsung", "Andoid", "Inalambrico", "Negro", 1.4, 590, true, 454,"Negro", true, true, false);
        galaxyWatch5Pro.imprimir(caracteristicas);
        System.out.println(galaxyWatch5Pro.datos);

        SmartWatch citizenCZSmart = new SmartWatch( "Citizen CZ Smart","Citizen", "Google Wear OS", "Inalambrico", "Acero", 1.28, 590, true, 460,"Negro", true, true, true);
        citizenCZSmart.imprimir(caracteristicas);
        System.out.println(citizenCZSmart.datos);

        SmartWatch appleWatchSeries8 = new SmartWatch( "Apple Watch Series 8","Apple", "IOS", "Inalambrico", "Blanco", 1.9, 309, true, 329,"Rosa", false, true, false);
        appleWatchSeries8.imprimir(caracteristicas);
        System.out.println(appleWatchSeries8.datos);




    }
}
