package stream.wortex.weather;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class WeatherController {

    @GetMapping("/")
    public String root() {
        log.info(" / root");
        return "hello root";
    }

    @GetMapping("/hello")
    public String hello() {
        log.info("/hello ");
        return "Hello from weather node!";
    }

}
