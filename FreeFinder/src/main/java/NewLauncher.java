import data.Hotel;
import data.Services;
import exception.DataHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*public class Bmain {
    // private static Object name;

    public static void main(String... args) {

            Playz A = new Playz();
            Playz B = new Playz();
            Playz C = new Playz();
            System.out.println("Lista de Paises ");
            System.out.println(A.nombre2 + "" + "Tiene 4 Servicios");
            System.out.println(B.nombre3);
            System.out.println(C.nombre4);
            // Tren segundo =new Tren("Juan palomo",25);
            //Lujo tercero = new Lujo("tony", true);
            //primero.maquinista = " pepe fone";
            //primero.CompletarVagon(2);
            //System.out.println(primero.vagones[2][1]);
            //primero.MeterPasajero(1,5);
            //System.out.println(primero.vagones[1][1]);
            //tercero.MeterPasajero(1,5);
            //System.out.println(tercero.vagones[1][1]);
            //tercero.StatusBar(true);





        }
    } */
@RestController
public class NewLauncher {


    @RequestMapping("/getAll/{")
    public List<Services> getAll () {
        List<Services> items = DataHelper.getData();
        return items;
    }


    @RequestMapping("/getAll/Spain")
    public Services geData (@RequestParam(value = "name", defaultValue = "BrumBrum") String name){
        Hotel hotel1 = new Hotel();
        //Moto.setName(name);
        hotel1.setName("asdasd");

        hotel1.setColor("clueb");
        hotel1.getPrice(111111);
        hotel1.setPrice((double) 1212);
        // moto1.getClass();
        //moto1.notifyAll();
        return hotel1;
    }

}
