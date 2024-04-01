package pwani.hello.domain;

public class Greeter {
    public Greeting greet(Noun noun){
        String message = "Hello, "+noun.name();
        return new Greeting(message);
    }
}
