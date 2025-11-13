package interfaces;

import java.util.List;
import java.util.Optional;

public interface CRUDService<T, K> {
    void create(T entity);
    Optional<T> find(K id);
    List<T> readAll();
    void update(T entity);
    void delete(K id);
}
