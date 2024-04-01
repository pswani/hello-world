package pwani.hello.application;

public class GreetingVO {
    private String message;

    public GreetingVO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
