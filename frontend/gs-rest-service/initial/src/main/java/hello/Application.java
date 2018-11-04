package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static final String BACKEND_SERVER = "http://localhost:8080";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
