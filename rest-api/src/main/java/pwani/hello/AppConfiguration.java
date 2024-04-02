package pwani.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pwani.hello.application.GreetingService;
import pwani.hello.domain.GoodWishesService;
import pwani.hello.domain.Greeter;
import pwani.hello.infrastructure.GoodWishesFromMind;

@Configuration
public class AppConfiguration {

    @Bean
    public GoodWishesService goodWishesService() {
        return new GoodWishesFromMind();
    }

    @Bean
    public Greeter greeter(GoodWishesService goodWishesService) {
        return new Greeter(goodWishesService);
    }

    @Bean
    public GreetingService greetingService(Greeter greeter) {
        return new GreetingService(greeter);
    }
}
