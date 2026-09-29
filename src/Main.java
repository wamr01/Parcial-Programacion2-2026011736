public class Main {
    public static void main(String[] args) {
        // En la rama main se usa la comision estandar por defecto
        EstrategiaComision estrategia = new ComisionEstandar();
        Vendedor vendedor = new Vendedor("William", 1000.0, estrategia);
        vendedor.mostrarDetalle();
    }
}