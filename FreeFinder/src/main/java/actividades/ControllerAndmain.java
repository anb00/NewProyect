package actividades;

import data.Services;
import exception.DataHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@EnableAutoConfiguration
    @RestController
    public class ControllerAndmain{
        @RequestMapping("/getAllproducts/Spain")
        public String ActivitisS(){
            return "SHOPPING - CITY TOUR - RELAX & SPA - EXCURSION - PARTY NIGHT  ";
        }

    @RequestMapping("/getAllproducts/Japon")
    public String ActivitisJ(){
        return "SHOPPING - CITY TOUR - RELAX & SPA - EXCURSION - PARTY NIGHT  ";
    }
    @RequestMapping("/getAllproducts/Brazil")
    public String ActivitiesBra(){
        return "Climbing - ";
    }

    @RequestMapping("/getAll")
    public List<Services> getHotels(){
        List<Services> items = DataHelper.getData();
        return items;
    }
    public List<Services> getActivities(){
        List<Services> items = DataHelper.getData();
        return items;
    }
    public List<Services> getRests(){
        List<Services> items = DataHelper.getData();
        return items;
    }
        public static void main(String... args){
            SpringApplication.run(ControllerAndmain.class,args);
        }
    }

