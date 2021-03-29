package ada.edu.project.Library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class LoginController {
    @GetMapping("/")
    public String login(Map<String, Object> model) {

        return "login";
    }
}
