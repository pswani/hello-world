package pwani.ddd.framework.core;

public interface Identity<T> extends ValueObject<T>{
    public boolean sameAs(T other);
}
