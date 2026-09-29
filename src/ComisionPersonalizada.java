public class ComisionPersonalizada implements EstrategiaComision {
    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * 0.12; // (5 + 7)% = 12%, William tiene 7 letras
    }
}