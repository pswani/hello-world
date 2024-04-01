package pwani.hello.domain;

import org.apache.commons.lang3.StringUtils;
import pwani.ddd.framework.core.ValueObject;
import pwani.ddd.guards.StringGuards;

public class Greeting implements ValueObject<Greeting> {
    private String message;

    public Greeting(String message) {
        StringGuards.checkNotEmpty("Message", message);
        this.message = message;
    }

    public String message() {
        return this.message;
    }

    public boolean sameAs(Greeting other) {
        return StringUtils.equals(this.message, other.message);
    }

    public Greeting copy() {
        return new Greeting(this.message);
    }
}
