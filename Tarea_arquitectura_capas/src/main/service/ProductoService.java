package main.service;

import main.model.Producto;
import main.repository.ProductoRepository;

public class ProductoService {

    private ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto getProductoById(String id) {
        return productoRepository.getProductoById(id);
    }

    public void saveProducto(Producto producto) {
        productoRepository.saveProducto(producto);
    }
}
