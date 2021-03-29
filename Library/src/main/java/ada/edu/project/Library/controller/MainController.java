package ada.edu.project.Library.controller;

import ada.edu.project.Library.domain.Book;
import ada.edu.project.Library.repositiries.FetchDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {


    @RequestMapping("/main")
    public String main(){
        return "main";
    }
    @Autowired
    FetchDataService fetchDataService;
    public List<Book> getBooks(){
        return fetchDataService.findAll();
    }

}
