package paqueteappmcdonalds;

import java.util.ArrayList;

public class Carrito {

    ArrayList<Productos> productos = new ArrayList();

    public Carrito() {
        productos = new ArrayList();
    }

    public void agregarProducto(String nombre, double precio, int cantidad) {
        productos.add(new Productos(nombre, precio, cantidad));
        System.out.println("Producto agregado al carrito!!");
    }

    public double calcularTotal() {
        double total = 0;
        for (Productos p : productos) {
            total += p.getSubTotal();
        }
        System.out.println("TOTAL A PAGAR: $" + total);
        return total;
       
    }

    public void mostrarCarrito() {
        if (productos.isEmpty()) {
            System.out.println("No se agregaron productos");
        } else {
            for (int i = 0; i < productos.size(); i++) {
                System.out.println((i + 1) + ". " + productos.get(i));
            }
        }
    }

    public void vaciar(){
        productos.clear();
    }

    public boolean estaVacio() {
        return this.productos.isEmpty();
    }

    public void confimarCompra(Carrito carrito, GestorDeDatos gestor) {
        ArrayList<Tarjeta> tarjeta = gestor.getTarjeta();
        ArrayList<Direcciones> direcciones = gestor.getDirecciones();

        //LOGICA PARA ELEGIR TARJETA
      

            if (tarjeta.isEmpty()) {
                System.out.println("No tienes tarjetas guardadas. Agrega una en la billetera antes de comprar");
                return;
            } else {
                System.out.println("Seleccione una tarjeta:");
                for (int i = 0; i < tarjeta.size(); i++) {
                    System.out.println((i + 1) + ". " + tarjeta.get(i).toString());
                }
            }
            int indxTarjeta = Teclado.leerEntero("Elija una opcion o 0 para cancelar");
            if (indxTarjeta == 0) {
                System.out.println("Compra cancelada, volviendo atras...");
                return;
            }
            if (indxTarjeta < 1 || indxTarjeta > tarjeta.size()) {
                System.out.println("Opcion invalida, volviendo atras...");
                return;
            }
            Tarjeta tarjetaseleccionada = tarjeta.get(indxTarjeta - 1);

            //LOGICA PARA ELEGIR DIRECCION
            if (direcciones.isEmpty()) {
                System.out.println("No tienes direcciones guardada. Agrega una antes de comprar");
                return;
            } else {
                System.out.println("Seleccione una direccion:");
                for (int i = 0; i < direcciones.size(); i++) {
                    System.out.println((i + 1) + ". " + direcciones.get(i).toString());
                }
                int indxDirecciones = Teclado.leerEntero("Elija una opcion o 0 para cancelar");
                if (indxDirecciones == 0) {
                    System.out.println("Compra cancelada, volviendo atras...");
                    return;
                }
                if (indxDirecciones < 1 || indxDirecciones > direcciones.size()) {
                    System.out.println("Opcion invalida, volviendo atras...");
                    return;
                }
                Direcciones direccionSeleccionada = direcciones.get(indxDirecciones - 1);

                //IMPRIMIR INFO DE LA COMPRA
                System.out.println("--- RESUMEN DE LA COMPRA ---");
                System.out.println("Productos:");
                carrito.mostrarCarrito();
                System.out.println("- Tajeta terminada en: " + tarjetaseleccionada);
                System.out.println("- Direccion de entrega: " + direccionSeleccionada);
                System.out.println("1.Confirmar compra      2.Cancelar compra");
                int confirmar = Teclado.leerEntero("");
                if (confirmar == 1) {
                    System.out.println("PROCESANDO PAGO...");
                    System.out.println("Compra realizada con éxito. ¡Gracias por su pedido!");
                    System.out.println("Se cobraron $" + calcularTotal() + " en la tarjeta terminada "
                            + tarjetaseleccionada.getNumero().substring(Math.max(0, tarjetaseleccionada.getNumero().length() - 4)));
                    carrito.vaciar();
                    return;
                } else if (confirmar == 2) {
                    System.out.println("Compra cancelada, volviendo atras...");
                    return;
                } else {
                    System.out.println("Opcion incorrecta, vuelva a intentarlo");
                    return;
                }
            }

        
    }
}
