package service.impl;

import entity.Producto;
import service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public List<Producto> listar() {
        return productoRepository.findAll();

    }
    @Override
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }
    @Override
    public Producto actualizar(Producto producto) {
        return productoRepository.save(producto);
    }
    @Override
    public Optional<Producto> listarb(Integer id) {
        return productoRepository.findById(id);
    }
    @Override
    public void eliminar(Integer id) {
        productoRepository.deleteById(id);
    }
}
