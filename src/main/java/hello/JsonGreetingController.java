package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonGreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/JsonGreeting")
    public JsonGreeting greeting(@RequestParam(value="name", defaultValue="World")  String name, @RequestParam(value="adj", defaultValue="Beautiful") String adjective) {
        return new JsonGreeting(counter.incrementAndGet(),
                String.format(template, name), adjective);
    }
}
