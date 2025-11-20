package paqueteappmcdonalds;

public class Direcciones {

    private String calle;
    private String numero;
    private String localidad;
    private String nota;

    public Direcciones(String calle, String numero, String localidad, String nota) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.nota = nota;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Calle: " + getCalle()
                + "\nNumero: " + getNumero()
                + "\nLocalidad: " + getLocalidad()
                + "\nNota: " + getNota();
    }

}
