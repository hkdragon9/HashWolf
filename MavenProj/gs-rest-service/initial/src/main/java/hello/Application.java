package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    static Database database = new Database();

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
