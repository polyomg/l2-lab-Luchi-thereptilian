package Lab4.com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    // Trang chủ
    @RequestMapping("/home/form")
    public String home() {
        return "home/form";  // Trỏ đến file: templates/home/form.html
    }

    // Trang giới thiệu
    @RequestMapping("/about/form")
    public String about() {
        return "about/form";  // Trỏ đến file: templates/about/form.html
    }
}
