package task1_project_audi;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller

public class HelloController {

    @GetMapping(value = "/")
    public String hello() {
        return "Hello, Welcome! Audi's home page!.";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Audi") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    //http://localhost:8080/greeting?name=Audi
}