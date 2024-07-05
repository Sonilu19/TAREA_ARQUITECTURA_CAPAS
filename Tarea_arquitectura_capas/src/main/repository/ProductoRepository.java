package main.repository;

import main.model.Producto;
import java.util.HashMap;
import java.util.Map;

public class ProductoRepository {

    private Map<String, Producto> ProductoDatabase = new HashMap<>();

    public Producto getProductoById(String id) {
        return ProductoDatabase.get(id);
    }

    public void saveProducto(Producto Producto) {
        ProductoDatabase.put(Producto.getId(), Producto);
    }
}
