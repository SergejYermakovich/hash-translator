package tt.hash.rest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tt.hash.service.HelloService;


@Slf4j
@RestController
@RequestMapping("/api/hello")
@AllArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping
    public String printGreeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        log.info("greeting for {}", name);
        return helloService.makeGreetingMessageFor(name);
    }
}
