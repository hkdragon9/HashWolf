package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @CrossOrigin(origins = "http://localhost:8888")
    @RequestMapping("/user")
    public Student user(@RequestParam(required=true) int id) {
        System.out.println("########");
        Student ans = Application.database.findUser(id);
        System.out.println(ans.id);
        return ans;
    }
}
