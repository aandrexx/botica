package logica;

public class Venta {
    
    Medicamentos med = new Medicamentos();
    
    private String nombre_cliente, nro_venta, nombre_medicamento;
    private int cantidad, fecha_compra;
    private double precio;

    public Venta() {
    }

    public Venta(String nombre_cliente, String nro_venta, String nombre_medicamento, int cantidad, int fecha_compra, double precio) {
        this.nombre_cliente = nombre_cliente;
        this.nro_venta = nro_venta;
        this.nombre_medicamento = nombre_medicamento;
        this.cantidad = cantidad;
        this.fecha_compra = fecha_compra;
        this.precio = precio;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getNro_venta() {
        return nro_venta;
    }

    public void setNro_venta(String nro_venta) {
        this.nro_venta = nro_venta;
    }

    public String getNombre_medicamento() {
        return nombre_medicamento;
    }

    public void setNombre_medicamento(String nombre_medicamento) {
        this.nombre_medicamento = nombre_medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {   
        this.cantidad = cantidad;
    }

    public int getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(int fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
}

