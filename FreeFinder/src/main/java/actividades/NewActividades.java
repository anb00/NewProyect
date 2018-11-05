package actividades;

import javafx.scene.input.KeyCode;

public class NewActividades {

  private String name;

  public NewActividades(KeyCode s) {

  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public boolean isAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  public double getOcupado() {
    return ocupado;
  }

  public void setOcupado(double ocupado) {
    this.ocupado = ocupado;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public double getLibre() {
    return libre;
  }

  public void setLibre(double libre) {
    this.libre = libre;
  }

  private String genero;
  private String address;
  private int stock;
  private boolean available;
  private double ocupado;
  private double total;
  private double libre;

   public NewActividades(String name, String genero, String address, int stock, boolean available,double ocupado,
                         double total, double libre){
     this.name = name;
   }
}
