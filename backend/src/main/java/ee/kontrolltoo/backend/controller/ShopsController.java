package ee.kontrolltoo.backend.controller;


import ee.kontrolltoo.backend.Dto.ShopsDto;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shops")
@CrossOrigin(origins = "*")
public class ShopsController {

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping
    public ShopsDto[] getBiblesFromExternalApi() {
        String url = "https://jsonplaceholder.typicode.com/todos";
        return restTemplate.exchange(url, HttpMethod.GET, null, ShopsDto[].class).getBody();
    }
}
