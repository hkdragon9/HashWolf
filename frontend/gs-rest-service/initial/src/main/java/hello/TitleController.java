package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.stereotype.Controller;

@Controller
public class TitleController {

    @CrossOrigin(origins = Application.BACKEND_SERVER)
    @RequestMapping("/title")
    public String title() {
        return "title";
    }
}
