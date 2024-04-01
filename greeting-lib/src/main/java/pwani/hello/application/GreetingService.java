package pwani.hello.application;

import org.apache.commons.lang3.StringUtils;
import pwani.hello.domain.Greeter;
import pwani.hello.domain.Greeting;
import pwani.hello.domain.Noun;

public class GreetingService {

    private Greeter greeter;

    public GreetingService(Greeter greeter) {
        if (null == greeter)
            throw new IllegalArgumentException("greeter must be initialized to a valid object");
        this.greeter = greeter;
    }

    public GreetingVO greet(GreetingCommand command) {
        String nounName = command.getNounName();
        if (StringUtils.isEmpty(nounName))
            nounName = "World";
        Greeting greeting = greeter.greet(new Noun(nounName));
        return new GreetingVO(greeting.message());
    }
}
