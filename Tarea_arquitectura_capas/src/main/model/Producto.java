package main.model;

public class Producto {

    private String id;
    private String producto;
    private String descripcion;

    // Constructor, getters y setters
    public Producto(String id, String producto, String descripcion) {
        this.id = id;
        this.producto = producto;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
