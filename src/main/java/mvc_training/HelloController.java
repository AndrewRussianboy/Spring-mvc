package mvc_training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-world") // url для контроллера
    public String sayHello() {
        return "hello_world";
    }
}
