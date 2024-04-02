package pwani.hello.infrastructure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;

import pwani.hello.domain.GoodWishesService;

public class GoodWishesFromFile implements GoodWishesService {
    private List<String> wishes = null;
    private static final Random rn = new Random();

    public GoodWishesFromFile(String fileName) throws IOException {
        this.wishes = Files.readAllLines(new File(fileName).toPath());
        if (wishes.isEmpty())
            throw new IllegalArgumentException("Wishes file is empty");
    }

    @Override
    public String goodWish() {
        return wishes.get(rn.nextInt(wishes.size()));
    }
}
