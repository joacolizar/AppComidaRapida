package paqueteappmcdonalds;

import java.util.ArrayList;

public class GestorDeDatos {

    ArrayList<DatosRegistrarse> registrarse = new ArrayList();
    ArrayList<DatosPersonales> datospersonales = new ArrayList();
    private ArrayList<Tarjeta> tarjeta = new ArrayList();
    private ArrayList<Direcciones> direcciones = new ArrayList();
    MenuUsuario mu = new MenuUsuario();

    public GestorDeDatos() {
        registrarse = new ArrayList();
        datospersonales = new ArrayList();
        tarjeta = new ArrayList();
    }

    public DatosRegistrarse registrarUsuario(String correo, String clave) {
        System.out.println("--- REGISTRARSE ---");
        System.out.print("E-mail:");
        correo = Teclado.leerTexto("");
        System.out.println("");
        System.out.println("Clave nueva:");
        clave = Teclado.leerTexto("");
        System.out.println("");
        registrarse.add(new DatosRegistrarse(correo, clave));
        System.out.println("Usuario registrado con exito!!!");
        return null;
    }

    public DatosRegistrarse iniciarSesion(String correo, String clave) {
        System.out.println("--- INICIAR SESION ---");
        System.out.print("1.E-mail:");
        correo = Teclado.leerTexto("");
        System.out.println("Clave:");
        clave = Teclado.leerTexto("");
        DatosRegistrarse d = validarUsuario(correo);
        if (d != null && d.validarClave(clave)) {
            System.out.println("Bienvenido!!!");
            return d;

        } else {
            System.out.println("E-mail y/0 clave incorrectos o inexistentes, vuelva a intentarlo");
            return null;
        }

    }

    public DatosRegistrarse validarUsuario(String correo) {
        for (DatosRegistrarse d : registrarse) {
            if (d.getCorreo().equals(correo)) {
                return d;
            }
        }
        return null;
    }

    public void ingresarDatosPersonales(String nombre, String telefono, String fechaNacimiento, String dni) {
        System.out.println("--- DATOS PERSONALES ---");
        System.out.print("Nombre completo:");
        nombre = Teclado.leerTexto(nombre);
        System.out.print("Telefono:");
        telefono = Teclado.leerTexto(telefono);
        System.out.print("Fecha de Nacimiento:");
        fechaNacimiento = Teclado.leerTexto(fechaNacimiento);
        System.out.print("Dni:");
        dni = Teclado.leerTexto(dni);
        datospersonales.add(new DatosPersonales(nombre, telefono, fechaNacimiento, dni));
        System.out.println("Datos actualizados!!!");

    }

    public void registrarTarjeta(String tipo, String numero, String vencimiento, String titular) {
        System.out.println("--- AGREGAR TARJETA ---");
        System.out.print("Tipo de tarjeta(debito/credito):");
        tipo = Teclado.leerTexto(tipo);
        System.out.print("Numero:");
        numero = Teclado.leerTexto(numero);
        System.out.print("Vencimiento:");
        vencimiento = Teclado.leerTexto(vencimiento);
        System.out.print("Titular:");
        titular = Teclado.leerTexto(titular);
        getTarjeta().add(new Tarjeta(tipo, numero, vencimiento, titular));
        System.out.println("Tarjeta agregada con exito!!!");

    }

    public void registrarDireccion(String calle, String numero, String localidad, String nota) {
        System.out.println("--- DIRECCION ---");
        System.out.print("Calle:");
        calle = Teclado.leerTexto(calle);
        System.out.print("Numero:");
        numero = Teclado.leerTexto(numero);
        System.out.print("Localidad:");
        localidad = Teclado.leerTexto(localidad);
        System.out.print("Nota:");
        nota = Teclado.leerTexto(nota);
        getDirecciones().add(new Direcciones(calle, numero, localidad, nota));
        System.out.println("Direccion agregada con exito!!!");
    }

    /**
     * @return the tarjeta
     */
    public ArrayList<Tarjeta> getTarjeta() {
        return tarjeta;
    }

    /**
     * @return the direcciones
     */
    public ArrayList<Direcciones> getDirecciones() {
        return direcciones;
    }

}
