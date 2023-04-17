package service;

import entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    public List<Producto> listar();

    public Producto guardar(Producto producto);

    public Producto actualizar(Producto producto);

    public Optional<Producto> listarb(Integer id);

    public void eliminar(Integer id);

}
