package repository;


import entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository {
    List<Producto> findAll();

    Producto save(Producto producto);

    Optional<Producto> findById(Integer id);

    void deleteById(Integer id);
}
