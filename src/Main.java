public class Main {
    public static void main(String[] args) {
        // Rama feature: comision personalizada (12%)
        EstrategiaComision estrategia = new ComisionPersonalizada();
        Vendedor vendedor = new Vendedor("William", 1000.0, estrategia);
        vendedor.mostrarDetalle();
    }
}