
package paqueteappmcdonalds;


public class Productos {
    private String nombre;
    private double precio;
    private int cantidad;
    
    public Productos(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }
   public double getSubTotal(){
       return cantidad * precio;
   }
    @Override
   public String toString(){
       return "X" + getCantidad() + getNombre() + " $" + getPrecio();
   }
}
