package commons;

public interface Validator<T> {
    void check(T t);
}