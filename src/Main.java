public class Main {
    public static void main(String[] args) {
        // Rama main: comision estandar por defecto (5%)
        EstrategiaComision estrategia = new ComisionEstandar();
        Vendedor vendedor = new Vendedor("William", 1000.0, estrategia);
        vendedor.mostrarDetalle();
    }
}