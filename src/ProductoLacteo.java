public class ProductoLacteo {

    private String nombre;
    private double precio;
    private double[] cantidadVendidaSemanales;
    private double cantidadVendidaTotal;

    public ProductoLacteo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadVendidaSemanales = new double[4]; // 4 semanas en un mes
        this.cantidadVendidaTotal = 0;
    }

    public void vender(int semana, double cantidad) {
        this.cantidadVendidaSemanales[semana - 1] += cantidad;
        this.cantidadVendidaTotal += cantidad;
    }

    public double getCantidadVendidaSemanales(int semana) {
        return cantidadVendidaSemanales[semana - 1];
    }

    public double getCantidadVendidaTotal() {
        return cantidadVendidaTotal;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}







