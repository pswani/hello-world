package pwani.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pwani.hello.application.GreetingService;
import pwani.hello.domain.Greeter;

@Configuration
public class AppConfiguration {
    @Bean
    public Greeter greeter() {
        return new Greeter();
    }

    @Bean
    public GreetingService greetingService(Greeter greeter) {
        return new GreetingService(greeter);
    }
}
