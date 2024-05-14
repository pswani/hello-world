package pwani.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pwani.hello.application.GreetingCommand;
import pwani.hello.application.GreetingService;
import pwani.hello.application.GreetingVO;

@RestController
public class GreetingController {
    @Autowired
    GreetingService greetingService;
    @GetMapping("/hello")
    public GreetingMessageDTO greet(){
        return greet("");
    }
    @GetMapping("/hello/{name}")
    public GreetingMessageDTO greet(@PathVariable String name){
        GreetingVO greetingVO = greetingService.greet(new GreetingCommand(name));
        GreetingMessageDTO dto = new GreetingMessageDTO(greetingVO);
        return dto;
    }
}
