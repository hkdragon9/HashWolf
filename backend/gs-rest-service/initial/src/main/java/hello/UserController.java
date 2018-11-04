package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @CrossOrigin(origins = Application.FRONTEND_SERVER)
    @RequestMapping("/match")
    public Student match(@RequestParam(required=true) int id) {
        Student user = Application.database.findUser(id);
        return user.nextStudent();
    }
}