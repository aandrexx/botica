package logica;

import javax.swing.JOptionPane;

public class Medicamentos {
    
    private String cod_laboratorio, nombre_proveedor, registro_sanitario, nombre_medicamento;
    private int stock;

    public Medicamentos() {
    }

    public Medicamentos(String cod_laboratorio, String nombre_proveedor, String registro_sanitario, String nombre_medicamento, int stock) {
        this.cod_laboratorio = cod_laboratorio;
        this.nombre_proveedor = nombre_proveedor;
        this.registro_sanitario = registro_sanitario;
        this.nombre_medicamento = nombre_medicamento;
        this.stock = stock;
    }
    

    public String getCod_laboratorio() {
        return cod_laboratorio;
    }

    public void setCod_laboratorio(String cod_laboratorio) {
        this.cod_laboratorio = cod_laboratorio;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getRegistro_sanitario() {
        return registro_sanitario;
    }

    public void setRegistro_sanitario(String registro_sanitario) {
        this.registro_sanitario = registro_sanitario;
    }

    public String getNombre_medicamento() {
        return nombre_medicamento;
    }

    public void setNombre_medicamento(String nombre_medicamento) {
        this.nombre_medicamento = nombre_medicamento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
}