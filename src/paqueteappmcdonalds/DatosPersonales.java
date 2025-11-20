package paqueteappmcdonalds;

public class DatosPersonales {

    private String nombre;
    private String telefono;
    private String fechaNacimiento;
    private String dni;

    public DatosPersonales(String nombre, String telefono, String fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre()
                + "\nDNI: " + getDni()
                + "\nTeléfono: " + getTelefono()
                + "\nFecha de nacimiento: " + getFechaNacimiento();
    }

}
