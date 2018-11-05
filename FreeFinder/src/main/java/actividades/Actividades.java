package actividades;

public class Actividades {
    public Actividades (String nombre,int plazas,double precio, String address){
        this.nombre = nombre;
        this.plazas=plazas;
        this.precio = precio;
        this.address= address;
    }

    public String gimmiDatos(){
        return "1"+nombre+"\n"+address+"\n"+"por solo"+"\n"+precio+"\n"+"Stock"+plazas+"";
    }
    private String nombre;
    private int plazas;
    private double precio;
    private String address;


}
