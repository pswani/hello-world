package pwani.hello.application;

public class GreetingCommand {
    private String nounName;

    public GreetingCommand(String nounName) {
        this.nounName = nounName;
    }

    public String getNounName() {
        return nounName;
    }

    public void setNounName(String nounName) {
        this.nounName = nounName;
    }
}
