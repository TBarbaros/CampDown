package gameSystem;

public interface Repository<T>{
    T add(T entity);
    T delete(T entity);
    T update(T entity);
}