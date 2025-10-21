package Lab1.com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculaterController {

    @GetMapping("/Caculate/Rectangle")
    public String Caculate() {
        return "/Caculate/Rectangle";
    }

    @PostMapping("/Caculate/caculate")
    public String Caculate(
            @RequestParam("length") double length,
            @RequestParam("width") double width,
            
            Model model) {

        double area = length * width;
        double perimeter = (length + width) * 2;
        
        

        model.addAttribute("area", area);
        model.addAttribute("perimeter", perimeter);
        
        return "/Caculate/Rectangle";
    }
}
