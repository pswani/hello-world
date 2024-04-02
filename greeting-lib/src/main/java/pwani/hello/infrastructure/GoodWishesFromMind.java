package pwani.hello.infrastructure;

import java.util.Random;

import pwani.hello.domain.GoodWishesService;

public class GoodWishesFromMind implements GoodWishesService {
    private String[] wishes = { "Have a good day!",
            "Enjoy the rest of your day!",
            "Have fun!",
            "Take care!",
            "God bless you!" };
    private static final Random rn = new Random();

    @Override
    public String goodWish() {
        return wishes[rn.nextInt(wishes.length)];
    }
}
