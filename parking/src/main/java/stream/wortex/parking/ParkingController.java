package stream.wortex.parking;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class ParkingController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String root() {
        return "This is reachable";
    }

    @GetMapping("/parking")
    public ResponseEntity<Object> getParkingAddress() throws InterruptedException {
        Thread.sleep(2000);

        ResponseEntity<Object> response = restTemplate.getForEntity("http://WEATHER/address", Object.class);

        return response;
    }

}
