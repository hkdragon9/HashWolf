package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @CrossOrigin(origins = Application.FRONTEND_SERVER)
    @RequestMapping("/user")
    public Student user(@RequestParam(required=true) int id) {
        return Application.database.findUser(id);
    }
}
