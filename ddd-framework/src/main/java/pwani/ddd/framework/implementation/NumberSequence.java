package pwani.ddd.framework.implementation;

public class NumberSequence {
    private long num;

    public NumberSequence() {
        this(1);
    }

    public NumberSequence(long initial) {
        setValue(initial);
    }

    public synchronized void setValue(long value){
        if(value<0)
            throw new IllegalArgumentException("Number sequence value cannot be less than zero: "+value);
        this.num = value;
    }

    public synchronized long nextValue(){
        return ++this.num;
    }

    public long value(){
        return this.num;
    }
}
