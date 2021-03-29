package ada.edu.project.Library.controller;

import ada.edu.project.Library.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ada.edu.project.Library.repositiries.UserRepository;

import java.util.Map;
@Controller
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }
    @PostMapping("/registration")
    public String addUser(User user,Map<String, Object> model){
        User userFromDB = userRepository.findByEmail(user.getEmail()) ;

        if (userFromDB != null){
            model.put("message","User exists!");
            return "registration";
        }
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userRepository.save(user);
        return "redirect:/login";
    }
}
