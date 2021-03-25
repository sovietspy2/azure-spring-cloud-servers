package stream.wortex.weather;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import stream.wortex.weather.model.Address;
import stream.wortex.weather.repository.AddressRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Slf4j
@RestController
public class WeatherController {

    @Autowired
    private AddressRepository addressRepository;

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

    @GetMapping("/address")
    public List<Address> address() {
        log.info("/findAll ");
        return addressRepository.findAll();
    }

    @GetMapping("/address/{id}")
    public Address address(@PathVariable Integer id) {
        try {
            log.info("/findById/" + id);
            return addressRepository.findById(id).orElseThrow();
        } catch (NoSuchElementException e) {
            log.error(e.getLocalizedMessage());
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Address Not Found", e);
        }
    }

}
