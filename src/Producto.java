public class Producto {
    private String nombre;
    private Double preciodCompra;
    private Double preciodVenta;
    private Integer stock;

    public Producto (String nombre, double preciodVenta, double preciodCompra, Integer stock){

        this.nombre = nombre;
        this.preciodVenta = preciodVenta;
        this.preciodCompra = preciodCompra;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPreciodCompra() {
        return preciodCompra;
    }

    public void setPreciodCompra(Double preciodCompra) {
        this.preciodCompra = preciodCompra;
    }

    public Double getPreciodVenta() {
        return preciodVenta;
    }

    public void setPreciodVenta(Double preciodVenta) {
        this.preciodVenta = preciodVenta;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + this.nombre + this.preciodVenta;
    }

    public boolean hayStock(){
        return this.stock >=1;
    }

    public double ganancia (){
        return this.preciodVenta-this.preciodCompra;
    }
}
