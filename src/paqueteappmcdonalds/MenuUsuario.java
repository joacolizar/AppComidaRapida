package paqueteappmcdonalds;

public class MenuUsuario {

    public void menuUsuario(GestorDeDatos gestor, Carrito carrito) {
        boolean salir = false;
        int opcion = 0;

        while (!salir) {
            System.out.println("--- MC DONALDS ---");
            System.out.println(" 1.Ver Productos");
            System.out.println(" 2.Carrito");
            System.out.println(" 3.Mis Datos Personales");
            System.out.println(" 4.Mi Billetera");
            System.out.println(" 5.Mis Direcciones");
            System.out.println(" 6.Cerrar Sesion");
            opcion = Teclado.leerEntero("");
            switch (opcion) {
                case 1 -> {
                    MenuProductos mensajero = new MenuProductos();
                    mensajero.menuProductos(carrito);

                }
                case 2 -> {
                    int opcioncarrito;
                    int opcioncarritoLleno = 0;
                    if (carrito.estaVacio()) {
                        do {
                            System.out.println("--- CARRITO ---");
                            System.out.println("");
                            System.out.println("Carrito vacio");
                            System.out.println("-----------------------------");
                            System.out.println("1.Volver atras");
                            opcioncarrito = Teclado.leerEntero("");
                            if (opcioncarrito == 1) {
                                System.out.println("Volviendo atras...");
                            } else {
                                System.out.println("Opcion incorrecta, vuelva a intentarlo");
                            }
                        } while (opcioncarrito != 1);
                    } else {
                        do {
                            System.out.println("--- CARRITO ---");
                            carrito.mostrarCarrito();
                            System.out.println("-----------------------------");
                            carrito.calcularTotal();
                            System.out.println("1.Comprar      2.Volver atras");
                            opcioncarritoLleno = Teclado.leerEntero("");
                            if (opcioncarritoLleno == 1) {
                               carrito.confimarCompra(carrito, gestor);
                               break;
                            } else if (opcioncarritoLleno == 2) {
                                System.out.println("Volviendo atras...");
                                break;
                            } else {
                                System.out.println("Opcion incorrecta, vuelva a intentarlo");
                            }
                        } while (opcioncarritoLleno != 2);
                    }

                }
                case 3 -> {
                    gestor.ingresarDatosPersonales("", "", "", "");

                }
                case 4 -> {
                    gestor.registrarTarjeta("", "", "", "");

                }
                case 5 -> {
                    gestor.registrarDireccion("", "", "", "");

                }
                case 6 -> {
                    System.out.println("Sesion cerrada, volviendo al menu principal...");
                    salir = true;

                }
            }

        }
    }
}
