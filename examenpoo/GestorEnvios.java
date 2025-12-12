public class GestorEnvios {
    private Envio[] envios;
    private int contador;

    public GestorEnvios(int capacidad) {
        envios = new Envio[capacidad];
        contador = 0;
        
    }

    public void agregarEnvio(Envio envio) {
        if (contador < envios.length) {
            envios[contador] = envio;
            contador++;
        } else {
            System.out.println("llego a su maximo.");
        }
    }

    public Envio[] getEnvios() {
        return envios;
    }
    public int getContador() {
        return contador;
    } 
}

