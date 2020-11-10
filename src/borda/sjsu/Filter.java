package borda.sjsu;

public interface Filter<T> {
    boolean accept(T x);
}
