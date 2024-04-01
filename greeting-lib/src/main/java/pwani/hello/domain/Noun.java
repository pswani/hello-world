package pwani.hello.domain;

import org.apache.commons.lang3.StringUtils;
import pwani.ddd.framework.core.ValueObject;
import pwani.ddd.guards.StringGuards;

public class Noun implements ValueObject<Noun>{
    private String name;

    public Noun(String name) {
        StringGuards.checkNotEmpty("Noun",name);
        StringGuards.checkNotMultiline("Noun",name);

        this.name = name;
    }

    public String name(){
        return this.name;
    }

    public boolean sameAs(Noun other) {
        return StringUtils.equals(this.name,other.name);
    }

    public Noun copy() {
        return new Noun(this.name);
    }
}
