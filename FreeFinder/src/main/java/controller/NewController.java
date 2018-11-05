package controller;

import data.Activities;
import data.Hotel;
import data.Services;
import exception.DataHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

/** rest in peace sublimetext and VisualBasic */

@EnableAutoConfiguration
@RestController
public class NewController {


    @RequestMapping("/getAllproducts/Spain")
    public List<Services> getAll(){
        System.out.println("HOTELES EN SPANIA");
        List<Services> items = DataHelper.getData();


        return items;
    }
    @RequestMapping("/getAllproducts/Alemania")
    public List<Activities> getAlly(){
        System.out.println("HOTELES EN ALEMANIA");
        List<Activities> items = DataHelper.getDaty();


        return items;
    }
    public List<Activities> getDaty(){
        List<Activities> items = DataHelper.getDaty();
        return items;
    }

   /* @RequestMapping("/hotel")
    public Services getHotel(@RequestParam(value = "name", defaultValue = "☼☼☼☼ Estrellas") String name) {
        Hotel hotel = new Hotel();
        hotel.setName(name);
        return hotel;
    }*/
    public static void main(String... args){
        SpringApplication.run(NewController.class,args);
    }
}
