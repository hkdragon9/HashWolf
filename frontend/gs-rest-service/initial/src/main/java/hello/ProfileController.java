package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileController {

    @CrossOrigin(origins = Application.BACKEND_SERVER)
    @RequestMapping("/profile")
    public String profile(@RequestParam(required=true) int id, Model model) {
        model.addAttribute("id", id);
        return "profile";
    }
}
