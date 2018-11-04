package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    static Database database = new Database();
    public static final String FRONTEND_SERVER = "http://localhost:8888";

    public static void main(String[] args) {
        Coder coder = new Coder("Kenny", "Sophomore", "EECS", "SQL", "Project Manager", "4 Hours per Week");
        Project p1 = new Project("p1", "PHD", "EECS", "Machine Learning", "Frontend Software Engineer", "16 Hours per Week");
        Project p2 = new Project("p2", "Sophomore", "EECS", "Machine Learning", "Frontend Software Engineer", "16 Hours per Week");
        Project p3 = new Project("p3", "Sophomore", "EECS", "Machine Learning", "Frontend Software Engineer", "16 Hours per Week");
        SpringApplication.run(Application.class, args);
    }
}
