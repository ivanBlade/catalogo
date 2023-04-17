package controller;

import entity.Producto;
import org.springframework.web.bind.annotation.*;
import service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @GetMapping() {
        private productoservice
    }

    @GetMapping("/id")
    public Producto buscarPorId(@PathVariable(required = true) Integer id) {
        return ProductoService.listarPorId(id).get();
    }

    @GetMapping()
    public Producto actualizar(@RequestBody Producto producto) {
        return ProductoService.actualizar(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarPorId(@PathVariable(required = true) Integer id){
        ProductoService.eliminarPorId(id);
    }
}
