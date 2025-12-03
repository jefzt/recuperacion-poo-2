public class Envio {
    // Encapsulamiento
    private String codigo;
    private String destinatario;
    private double costoBase;

    public Envio(String codigo, String destinatario, double costoBase) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.costoBase = costoBase;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getDestinatario() {   
        return destinatario;
    }

    public double getCostoBase() {
        return costoBase;
    }

    
    public void setDestinatario(String destinatario) {  
        this.destinatario = destinatario;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    // Método para mostrar detalles
    public String obtenerDetalles() {
        return "Código: " + codigo + "Destinatario: " + destinatario + "Costo Base: " + costoBase;
    }
}
