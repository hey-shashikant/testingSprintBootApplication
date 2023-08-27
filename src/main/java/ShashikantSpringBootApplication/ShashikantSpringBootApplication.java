package ShashikantSpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ShashikantSpringBootApplication {

    @GetMapping("/message")
    public String message() {
        return "Congrats Nikhil ! You have successfully deployed in Azure.";
    }
    public static void main(String[] args) {
        SpringApplication.run(ShashikantSpringBootApplication.class, args);
    }

}
