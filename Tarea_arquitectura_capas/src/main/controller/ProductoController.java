package main.controller;

import main.model.Producto;
import main.service.ProductoService;

public class ProductoController {

    private ProductoService ProductoService;

    public ProductoController(ProductoService ProductoService) {
        this.ProductoService = ProductoService;
    }

    public Producto getProductoById(String id) {
        return ProductoService.getProductoById(id);
    }

    public void saveProducto(Producto Producto) {
        ProductoService.saveProducto(Producto);
    }
}
