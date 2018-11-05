import java.util.Scanner;

public class pax {
    String pasajeros[][]= new String [3][2];
    String nombre,edad;
    public void showpax(){
        Scanner read = new Scanner (System.in);
        for(int i = 0; i < pasajeros[0].length; i++) {
            nombre =read.nextLine();
            System.out.println("Ingrese el nombre"+(i+1)+"pasajero");
            edad=read.nextLine();
            pasajeros[i][0] = nombre;
            pasajeros[i][1] = edad;
        }
    }

    public void showmatriz(){
        System.out.println("Pasajero:                              Edad: ");
        for(int i= 0; i < pasajeros[0].length; i++){
            for (int j = 0; j < 2; j++){
                System.out.println(pasajeros[i][j]+"    ");
            }
            System.out.println("");
            }
        }

}
