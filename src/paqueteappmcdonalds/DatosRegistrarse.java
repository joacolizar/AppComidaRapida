package paqueteappmcdonalds;

public class DatosRegistrarse {

    private String correo;
    private String clave;
    private DatosPersonales datos;

    public DatosRegistrarse(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    public boolean validarClave(String clave) {
        return this.getClave().equals(clave);
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }

    public DatosPersonales getDatos() {
        return datos;
    }

    public void setDatos(DatosPersonales datos) {
        this.datos = datos;
    }
}
