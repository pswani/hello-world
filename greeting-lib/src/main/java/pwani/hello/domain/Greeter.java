package pwani.hello.domain;

public class Greeter {
    private GoodWishesService goodWishesService = null;

    public Greeter(GoodWishesService goodWishesService) {
        this.goodWishesService = goodWishesService;
    }

    public Greeting greet(Noun noun) {
        String message = "Hello, " + noun.name();
        message = message + 
            System.lineSeparator() + 
            this.goodWishesService.goodWish();

        return new Greeting(message);
    }
}
