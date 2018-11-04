package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwipeController {

    @CrossOrigin(origins = "http://localhost:8888")
    @RequestMapping("/swipe")
    public void match(@RequestParam(required=true) int id, boolean like) {
        Student user = Application.database.findUser(id);
        user.swipe(like);
    }

//    @GetMapping("/greeting-javaconfig")
//    public Greeting greetingWithJavaconfig(@RequestParam(required=false, defaultValue="World") String name) {
//        System.out.println("==== in greeting ====");
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
//    }

}