package main;

import main.controller.ProductoController;
import main.model.Producto;
import main.repository.ProductoRepository;
import main.service.ProductoService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciamos las capas necesarias
        ProductoRepository ProductoRepository = new ProductoRepository();
        ProductoService ProductoService = new ProductoService(ProductoRepository);
        ProductoController ProductoController = new ProductoController(ProductoService);

        // Solicitar datos del producto
        System.out.println("Ingrese el ID del producto:");
        String id = scanner.nextLine();

        System.out.println("Ingrese el nombre del producto:");
        String producto = scanner.nextLine();

        System.out.println("Ingrese una descripcion del producto:");
        String descripcion = scanner.nextLine();

        // Crear y guardar el producto
        Producto newProducto = new Producto(id, producto, descripcion);
        ProductoController.saveProducto(newProducto);

        // Recuperar y mostrar el producto guardado
        Producto retrievedProducto = ProductoController.getProductoById(id);
        if (retrievedProducto != null) {
            System.out.println("Producto guardado:");
            System.out.println("ID: " + retrievedProducto.getId());
            System.out.println("Producto: " + retrievedProducto.getProducto());
            System.out.println("Descripcion: " + retrievedProducto.getDescripcion());
        } else {
            System.out.println("No se pudo encontrar el producto.");
        }

        // Cerrar el scanner al finalizar
        scanner.close();
    }
}
