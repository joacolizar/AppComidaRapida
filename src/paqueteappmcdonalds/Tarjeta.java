package paqueteappmcdonalds;

public class Tarjeta {

    private String tipo; // Débito o crédito
    private String numero;
    private String vencimiento;
    private String titular;

    public Tarjeta(String tipo, String numero, String vencimiento, String titular) {
        this.tipo = tipo;
        this.numero = numero;
        this.vencimiento = vencimiento;
        this.titular = titular;

    }

    public String getTipo() {
        return tipo;
    }

    public String getNumero() {
        return numero;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        String ultimos4 = numero.length() >= 4 ? numero.substring(numero.length() - 4) : numero;
        return "💳 Tarjeta " + tipo
                + " (**** **** **** " + ultimos4 + ")\n"
                + "Titular: " + titular + "\n"
                + "Vencimiento: " + vencimiento;
    }

}
