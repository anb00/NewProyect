package data;
public class Hotel extends Services{

    public void start() {
        doMsg("Grupo Hotel ");


    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    /*@Override
    public int getOcupado() {
        return ocupado;
    }

   public void setOcupado(int ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public double getLleno() {
        return lleno;
    } */

    public void setLleno(double lleno) {
        this.lleno = lleno;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    private String name;
    private String tipo;
    private String color;
    private boolean vacio;
    //private int ocupado;
    private double lleno;
    private String address;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}