package exception;

import data.Hotel;
import data.Services;



public class Launcher {

    public static void main(String... args) {
        try {
            //SystemUtilHelper.consolePrint("Concesionario brumbrum App 2.0");
            Hotel Hotel1 = new Hotel();
            //Hotel.setPrice(123.45);

            //moto.setColor("Blanco");
            System.out.println("hotel 1:::::::::::: :");
            Hotel1.setName("Grupotel Sinphony Of the Space");
            //Hotel.start();
            //SystemUtilHelper.consolePrint("pista que voy!");
            //moto.brake();
            Hotel hotel2 = new Hotel();
            System.out.println("Hotel 2:::::::::::::");
            hotel2.setName("Grupotel Blue Big Bay ");
            hotel2.getName("algo");

            //SystemUtilHelper.consolePrint("yuhu");


        } catch (Exception e) {
            SystemUtilHelper.logError(e);
        }

    }
}
