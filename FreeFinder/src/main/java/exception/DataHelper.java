package exception;

import data.Activities;
import data.Hotel;
import data.Services;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {







    private static List<Services> data = new ArrayList<>();

    public static List<Services> getData(){
        doInit();
        return data;
    }

    /*private static List<Vehicle> date = new ArrayList<>();
    public static List<Vehicle> getDate(){
        doInit();
        return date;
    }*/


    private static void doInit(){
        if (data.isEmpty()){
            for(int i =0;i<50;i++){
                Hotel hotel = new Hotel();
                 hotel.setName("Grupotel Big Bay"+i);
                 hotel.setAddress("C/Mayor,n"+i+",");
                 hotel.setLleno(345);
                 hotel.start();
                data.add(hotel);
            }
        }
    }

    private static void doInity(){
        if (daty.isEmpty()){
            for(int i =0;i<50;i++){
                Activities act1 = new Activities() {
                    @Override
                    public String getName() {
                        return super.getName();
                    }
                };
                act1.setName("Grupotel Big Bay"+i);
                act1.setAddress("C/Mayor,n"+i+",");
               act1.setLleno(345);
                //act1.start();
                daty.add(act1);
            }
        }
    }

    private static List<Activities> daty = new ArrayList<>();

    public static List<Activities> getDaty(){
        doInity();
        return daty;
    }



    /*private static void doInite(){
        if (date.isEmpty()){
            for(int i =0;i<50;i++){
                Car car = new Car();

                date.add(car);
            }
        }
    } */



}
