package pwani.ddd.framework.implementation;

import pwani.ddd.framework.core.Identity;

public class NumberId implements Identity<NumberId> {
    private static long nextId = 1;

    public static NumberId nextId() {
        return new NumberId(nextId++);
    }

    private final long id;

    public NumberId(long id) {
        if(id <= 0)
            throw new IllegalArgumentException(String.format("Invalid Id: %s", id));
        this.id = id;
    }

    public boolean sameAs(NumberId other) {
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "NumberId [id=" + id + "]";
    }

    @Override
    public NumberId copy() {
        return new NumberId(this.id);
    }

    public long value(){
        return id;
    }
}
