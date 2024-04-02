package pwani.hello.application;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pwani.hello.domain.Greeter;
import pwani.hello.infrastructure.GoodWishesFromMind;

class GreetingServiceTest {
    static GreetingService greetingService;
    @BeforeAll
    static void setUp() {
        Greeter greeter = new Greeter(new GoodWishesFromMind());
        greetingService = new GreetingService(greeter);
    }

    @Test
    void greet() {
        GreetingCommand command = new GreetingCommand("World");
        GreetingVO greetingVO = greetingService.greet(command);

        Assertions.assertNotNull(greetingVO);
        Assertions.assertTrue(StringUtils.isNotEmpty(greetingVO.getMessage()));
    }
}