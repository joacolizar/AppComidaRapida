package paqueteappmcdonalds;

public class McDonaldsApp {

    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        GestorDeDatos gestor = new GestorDeDatos();
        Carrito carrito = new Carrito();
        DatosRegistrarse usuario = null;
        MenuProductos mensajero = new MenuProductos();
        boolean salir = false;
        while (!salir) {
            int opcion;
            System.out.println("--- MC DONALDS ---");
            System.out.println(" 1.Ingresar");
            System.out.println(" 2.Registrarse");
            System.out.println(" 3.Salir");
            opcion = Teclado.leerEntero("");
            switch (opcion) {
                case 1 -> {
                    usuario = gestor.iniciarSesion("", "");
                    if (usuario != null) {
                        MenuUsuario mensajero3 = new MenuUsuario();
                        mensajero3.menuUsuario(gestor, carrito);
                    } else{
                        System.out.println("No se pudo iniciar sesion, intentelo nuevamente");
                    }
                }
                case 2 -> {
                    usuario = gestor.registrarUsuario("", "");

                }
                case 3 -> {
                    System.out.println("Gracias por su visita, vuelva pronto!!!");
                    salir = true;

                }
            }
        }

    }
}
//NOTA 3: Hay q agregar una opcion mostrar mis tarjetas y mostrar direeciones para mostrar la lista de los mismos y otra opcion aparte para agregar tarjeta y direccion