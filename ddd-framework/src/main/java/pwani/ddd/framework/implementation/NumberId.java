package pwani.ddd.framework.implementation;

import pwani.ddd.framework.core.Identity;

public class NumberId implements Identity<NumberId> {
    private static int nextId = 1;

    public static NumberId nextId() {
        return new NumberId(nextId++);
    }

    private final int id;

    public NumberId(int id) {
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

    public int value(){
        return id;
    }
}
