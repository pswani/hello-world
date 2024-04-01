package pwani.hello;

import pwani.hello.application.GreetingVO;

public class GreetingMessageDTO {

    private String message;
    public GreetingMessageDTO(GreetingVO vo){
        this.message=vo.getMessage();
    }

    public String getMessage() {
        return message;
    }
}
