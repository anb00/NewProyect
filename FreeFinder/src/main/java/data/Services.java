package data;

import com.sun.istack.internal.localization.NullLocalizable;


public abstract class Services {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public Integer getLleno() {
        return lleno;
    }

    public void setLleno(Integer lleno) {
        this.lleno = lleno;
    }

    public Double getOcupado() {
        return ocupado;
    }

    public void setOcupado(Double ocupado) {
        this.ocupado = ocupado;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Boolean getListo() {
        return listo;
    }

    public void setListo(Boolean listo) {
        this.listo = listo;
    }

    public Double getPrice(int i) {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    private String name;
    private String tipe;
    private Double price;
    private Integer lleno;
    private Double ocupado;
    private String address;
    private String Country;
    private Boolean listo;


    /** utilidad para mandar msg shortly **/
    protected void doMsg(String message) {
        System.out.println(message);
    }

    private String showMsg(String message) {
        doMsg(message);
        return message;
    }

    public void getName(String algo) {
    }
}

