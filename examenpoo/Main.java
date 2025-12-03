public class Main {
    public static void main(String[] args) {

        GestorEnvios gestor = new GestorEnvios(4);

        EnvioLocal local1 = new EnvioLocal("L001", "Paquete Zona Centro", 7000, 12);
        EnvioLocal local2 = new EnvioLocal("L002", "Documentos Oficiales", 6000, 5);
        EnvioInternacional inter1 = new EnvioInternacional("I001", "Electrónica China", 10000, 25000);
        EnvioInternacional inter2 = new EnvioInternacional("I002", "Ropa España", 8000, 12000);

        gestor.agregarEnvio(local1);
        gestor.agregarEnvio(local2);
        gestor.agregarEnvio(inter1);
        gestor.agregarEnvio(inter2);

        double totalLocales = local1.getCostoBase() + local2.getCostoBase();
        double totalInternacionales = inter1.getCostoBase() + inter1.getImpuestoAduana() + inter2.getCostoBase() + inter2.getImpuestoAduana();

        Envio[] envios = gestor.getEnvios();

        for (int i = 0; i < gestor.getContador(); i++) {
            System.out.println(envios[i].obtenerDetalles());
        }

        System.out.println("Costo total de envíos locales: " + totalLocales);
        System.out.println("Costo total de envíos internacionales: " + totalInternacionales);
    }
}
