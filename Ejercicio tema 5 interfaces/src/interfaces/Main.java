package interfaces;

import clases.Auto;

public class Main {

    static AutoCRUD autoCRUD = new AutoCRUDImpl();

    public static void main(String[] args){

        Auto xTrail0 = new Auto ("Nissan", "X-TRAIL", 2023, "Blanco", 55, 0, true, 1.8 ,5, true);

        Auto xTrail1 = new Auto ("Nissan", "X-TRAIL", 2020, "Negro", 55, 0, false, 1.6 ,5, true);

        Auto xTrail2 = new Auto ("Nissan", "X-TRAIL", 2022, "Gris", 55, 0, false, 1.2 ,5, false);

        autoCRUD.save(new Auto());
        autoCRUD.findAll();
        autoCRUD.delete();

    }
}