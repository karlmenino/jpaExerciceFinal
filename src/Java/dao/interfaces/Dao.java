package dao.interfaces;

import java.util.List;

public interface Dao<T,K> {
    public T findById(K id);
    public List<T> findAll();
    public void add(T obj);
    public void update(T obj);
    public void remove(T obj);
    public void removeById(K id);

}
